package com.yavuzahmet.SpotifyDemo.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yavuzahmet.SpotifyDemo.business.abstracts.SongService;
import com.yavuzahmet.SpotifyDemo.entity.concretes.Song;
import com.yavuzahmet.SpotifyDemo.entity.dtos.SongWithArtistDto;

@RestController
@RequestMapping("/songs/")
@CrossOrigin
public class SongsController {

	private SongService songService;
	
	@Autowired
	public SongsController(SongService songService) {
		super();
		this.songService = songService;
	}

	@GetMapping("getall")
	public List<Song> getAll(){
		return songService.getAll();
	}
	
	@PostMapping("save")
	public Song save(Song song){
		return songService.saveSong(song);
	}
	@GetMapping("getSongWithArtistDto")
	public List<SongWithArtistDto> getSongWithArtistDto() {
		return this.songService.songWithArtistDto();
	}

	@GetMapping("getByGenreGenreId")
	public List<Song> getByGenreSong_GenreId(int genreId) {
		return this.songService.getByGenreSong_GenreId(genreId);
	}
	
}
