package com.yavuzahmet.SpotifyDemo.business.abstracts;

import java.util.List;

import com.yavuzahmet.SpotifyDemo.entity.concretes.Song;
import com.yavuzahmet.SpotifyDemo.entity.dtos.SongWithArtistDto;

public interface SongService {
	
	public List<Song> getAll();
	public Song saveSong(Song song);
	public List<SongWithArtistDto> songWithArtistDto();
	public List<Song> getByGenreSong_GenreId(int genreId);
}
