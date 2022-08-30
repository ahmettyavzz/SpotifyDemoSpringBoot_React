package com.yavuzahmet.SpotifyDemo.business.abstracts;

import java.util.List;

import com.yavuzahmet.SpotifyDemo.entity.concretes.Genre;

public interface GenreService {

	public List<Genre> getAll();
	public Genre saveArtist(Genre genre);
}
