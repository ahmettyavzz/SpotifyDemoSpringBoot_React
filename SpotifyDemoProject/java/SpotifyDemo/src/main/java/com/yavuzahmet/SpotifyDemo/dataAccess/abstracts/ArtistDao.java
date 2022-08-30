package com.yavuzahmet.SpotifyDemo.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yavuzahmet.SpotifyDemo.entity.concretes.Artist;
import com.yavuzahmet.SpotifyDemo.entity.dtos.ArtistWithGenreDto;


public interface ArtistDao extends JpaRepository<Artist, Integer>{
	
	@Query("Select new com.yavuzahmet.SpotifyDemo.entity.dtos.ArtistWithGenreDto"
			+"(a.artistId, a.artistName, g.genreName) "
			+"From Genre g Inner Join g.artists a")
	List<ArtistWithGenreDto> getArtistWithGenreDtoDetails();

	
	/*@Query("Select new kodlamaio.northwind.entities.dtos.ProductWithCategoryDto"
			+"(p.productId, p.productName, c.categoryName) "
			+"From Category c Inner Join c.products p")
	List<ProductWithCategoryDto> getProductWithCategoryDetails();*/
}
