package com.yavuzahmet.SpotifyDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yavuzahmet.SpotifyDemo.business.abstracts.ArtistsService;
import com.yavuzahmet.SpotifyDemo.dataAccess.abstracts.ArtistDao;
import com.yavuzahmet.SpotifyDemo.entity.concretes.Artist;
import com.yavuzahmet.SpotifyDemo.entity.dtos.ArtistWithGenreDto;

@Service
public class ArtistsManager implements ArtistsService{

	private ArtistDao artistDao;
	
	@Autowired
	public ArtistsManager(ArtistDao artistDao) {
		super();
		this.artistDao = artistDao;
	}

	@Override
	public List<Artist> getAll() {
		return artistDao.findAll();
	}

	@Override
	public Artist saveArtist(Artist artist) {
		return artistDao.save(artist);
	}

	@Override
	public List<ArtistWithGenreDto> artistWithGenreDto() {
		return artistDao.getArtistWithGenreDtoDetails();
	}

}
