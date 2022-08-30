package com.yavuzahmet.SpotifyDemo.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yavuzahmet.SpotifyDemo.entity.concretes.Song;
import com.yavuzahmet.SpotifyDemo.entity.dtos.SongWithArtistDto;

public interface SongDao extends JpaRepository<Song, Integer>{
	
	@Query("Select new com.yavuzahmet.SpotifyDemo.entity.dtos.SongWithArtistDto"
			+"(s.songId, s.songName , a.artistName) "
			+"From Song s Inner Join s.artistSong a")
	List<SongWithArtistDto> getSongWithArtistDtoDetails();
	
	List<Song> getByGenreSong_GenreId(int genreId);
	

}
