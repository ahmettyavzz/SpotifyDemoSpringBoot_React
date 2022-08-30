package com.yavuzahmet.SpotifyDemo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yavuzahmet.SpotifyDemo.business.abstracts.ArtistsService;
import com.yavuzahmet.SpotifyDemo.entity.concretes.Artist;
import com.yavuzahmet.SpotifyDemo.entity.dtos.ArtistWithGenreDto;

import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/artists/")
@CrossOrigin
public class ArtistsController {
	
	private ArtistsService artistsService;
	
	@Autowired
	public ArtistsController(ArtistsService artistsService) {
		super();
		this.artistsService = artistsService;
	}
	
	@GetMapping("getall")
	public List<Artist> getAll() {
		return this.artistsService.getAll();
	}
	@PostMapping("save")
	public Artist saveArtist(@RequestBody Artist artist) {
		return this.artistsService.saveArtist(artist);
	}
	
	@GetMapping("getArtistWithGenreDto")
	public List<ArtistWithGenreDto> getArtistWithGenreDto() {
		return this.artistsService.artistWithGenreDto();
	}



}
