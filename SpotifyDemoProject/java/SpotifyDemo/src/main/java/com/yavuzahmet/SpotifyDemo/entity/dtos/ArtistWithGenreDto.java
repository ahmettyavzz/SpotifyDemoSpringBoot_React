package com.yavuzahmet.SpotifyDemo.entity.dtos;

public class ArtistWithGenreDto {
	private int id;
	private String artistName;
	private String genreName;
	
	
	public ArtistWithGenreDto(int artistId, String artistName, String genreName) {
		super();
		this.id = artistId;
		this.artistName = artistName;
		this.genreName = genreName;
	}
	
	public ArtistWithGenreDto() {
		
	}

	public int getArtistId() {
		return id;
	}

	public void setArtistId(int artistId) {
		this.id = artistId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
	
	

}
