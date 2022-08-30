package com.yavuzahmet.SpotifyDemo.business.abstracts;

import java.util.List;

import com.yavuzahmet.SpotifyDemo.entity.concretes.Artist;
import com.yavuzahmet.SpotifyDemo.entity.dtos.ArtistWithGenreDto;

public interface ArtistsService {

	public List<Artist> getAll();
	public Artist saveArtist(Artist artist);
	public List<ArtistWithGenreDto> artistWithGenreDto();
}
