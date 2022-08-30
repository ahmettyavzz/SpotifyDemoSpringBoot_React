package com.yavuzahmet.SpotifyDemo.entity.dtos;

public class SongWithArtistDto {

	private int songId;
	private String songName;
	private String artistName;
	
	public SongWithArtistDto(int songId, String songName, String artistName) {
		super();
		this.songId = songId;
		this.songName = songName;
		this.artistName = artistName;
	}
	public SongWithArtistDto() {
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
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	
	
	
	
}
