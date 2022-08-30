package com.yavuzahmet.SpotifyDemo.entity.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="genres")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_positions"})

public class Genre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="genre_id")
	private int genreId;
	
	@Column(name ="genre_name")
	private String genreName;

	
	@OneToMany(mappedBy = "genreArtist")
	private List<Artist> artists;
	
	
	@OneToMany(mappedBy = "genreSong")
	private List<Song> songs;
	
	
	public Genre(int genreId, String genreName) {
		super();
		this.genreId = genreId;
		this.genreName = genreName;
	}
	
	
	
	public Genre() {
	
	}

	public int getGenreId() {
		return genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
	
	
	
	
}
