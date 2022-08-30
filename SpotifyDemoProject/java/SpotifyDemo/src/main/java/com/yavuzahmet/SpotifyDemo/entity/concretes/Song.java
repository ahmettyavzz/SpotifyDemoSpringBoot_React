package com.yavuzahmet.SpotifyDemo.entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="songs")
public class Song {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "song_id")
	private int songId;
	
	@Column(name = "song_name")
	private String songName;
	
	//@Column(name = "genre_id")
	//private int genreId;
	
	//@Column(name = "artist_id")
	//private int artistId;
	
	
	@ManyToOne()
	@JoinColumn(name="artist_id")
	private Artist artistSong;
	
	@ManyToOne
	@JoinColumn(name = "genre_id")
	private Genre genreSong;
	
	
	public Song() {
		
	}

	public Song(int songId, String songName) {
		super();
		this.songId = songId;
		this.songName = songName;
		//this.genreId = genreId;
		//this.artistId=artistId;
	}
	
/*	public int getArtistId() {
		return artistSong.getArtistId();     //idleri çağırmaya gerek yok
	}
	public int getGenreId() {
		return genreSong.getGenreId();
	}*/
	public String getArtistName() {
		return artistSong.getArtistName();
	}
	public String getGenreName() {
		return genreSong.getGenreName();
	}

	
	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}


	

}
