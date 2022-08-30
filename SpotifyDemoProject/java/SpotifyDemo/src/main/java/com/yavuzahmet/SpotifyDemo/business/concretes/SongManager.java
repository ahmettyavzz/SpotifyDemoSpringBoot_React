package com.yavuzahmet.SpotifyDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yavuzahmet.SpotifyDemo.business.abstracts.SongService;
import com.yavuzahmet.SpotifyDemo.dataAccess.abstracts.SongDao;
import com.yavuzahmet.SpotifyDemo.entity.concretes.Song;
import com.yavuzahmet.SpotifyDemo.entity.dtos.SongWithArtistDto;

@Service
public class SongManager implements SongService{

	private SongDao songDao;
	
	@Autowired
	public SongManager(SongDao songDao) {
		super();
		this.songDao = songDao;
	}


	@Override
	public List<Song> getAll() {
		
		return songDao.findAll();
	}


	@Override
	public Song saveSong(Song song) {
		return songDao.save(song);
	}


	@Override
	public List<SongWithArtistDto> songWithArtistDto() {
		return this.songDao.getSongWithArtistDtoDetails();
	}


	@Override
	public List<Song> getByGenreSong_GenreId(int genreId) {
		return this.songDao.getByGenreSong_GenreId(genreId);
	}
	
	

}
