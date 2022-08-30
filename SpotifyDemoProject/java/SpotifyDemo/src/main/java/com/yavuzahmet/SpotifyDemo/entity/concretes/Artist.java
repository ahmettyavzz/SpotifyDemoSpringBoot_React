package com.yavuzahmet.SpotifyDemo.entity.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name ="artists")
public class Artist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "artist_id")
	private int artistId;
	
	@Column(name = "artist_name")
	private String artistName;
	
	//@Column(name = "genre_id")
	//private int genreId;
	
	@ManyToOne()
	@JoinColumn(name = "genre_id")
	private Genre genreArtist;
	
	@OneToMany(mappedBy = "artistSong")
	private List<Song> songs;
	
	public Artist() {
	}
	
	public Artist(int artistId, String artistName,int genreId) {
		super();
		this.artistId = artistId;
		this.artistName = artistName;
		this.genreArtist.setGenreId(genreId);
	
	}
	
	/*public int getCategory() {
			return category.getCategoryId();
		}


		public void setCategory(Category category2) {
			this.category.setCategoryId(category2.getCategoryId());
		}*/
	
	public int getGenreId() {
		return genreArtist.getGenreId();
	}
	
	public void setGenreId(int genreId) {
		this.genreArtist.setGenreId(genreId);
	}
	
	
	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	/*public int getGenreId() {
		return genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}
	*/
	
	
}
