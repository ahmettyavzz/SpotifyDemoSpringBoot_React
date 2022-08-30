package com.yavuzahmet.SpotifyDemo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yavuzahmet.SpotifyDemo.entity.concretes.Genre;

public interface GenreDao extends JpaRepository<Genre, Integer>{

}
