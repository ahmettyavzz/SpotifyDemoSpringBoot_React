package com.yavuzahmet.SpotifyDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yavuzahmet.SpotifyDemo.business.abstracts.GenreService;
import com.yavuzahmet.SpotifyDemo.dataAccess.abstracts.GenreDao;
import com.yavuzahmet.SpotifyDemo.entity.concretes.Genre;

@Service
public class GenreManager implements GenreService{

	
	private GenreDao genreDao;
	
	
	@Autowired
	public GenreManager(GenreDao genreDao) {
		super();
		this.genreDao = genreDao;
	}

	
	@Override
	public List<Genre> getAll() {	
		return genreDao.findAll();
	}


	@Override
	public Genre saveArtist(Genre genre) {

		return genreDao.save(genre);
	}

}
