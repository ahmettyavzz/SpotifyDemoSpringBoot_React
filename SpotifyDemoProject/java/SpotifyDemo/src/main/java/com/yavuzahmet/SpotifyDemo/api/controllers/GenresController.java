package com.yavuzahmet.SpotifyDemo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yavuzahmet.SpotifyDemo.business.abstracts.GenreService;
import com.yavuzahmet.SpotifyDemo.entity.concretes.Genre;

@RestController
@RequestMapping("/genres/")
@CrossOrigin
public class GenresController {

	private GenreService genreService;

	@Autowired
	public GenresController(GenreService genreService) {
		super();
		this.genreService = genreService;
	}
	
	@GetMapping("getall")
	public List<Genre> getAll(){
	
		return genreService.getAll();	
	}
	@PostMapping("save")
	public Genre saveArtist(Genre genre) {
		return this.genreService.saveArtist(genre);
	}

}
