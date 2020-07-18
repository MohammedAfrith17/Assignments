package com.movie.movieapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.movieapp.entity.Movie;

@Repository
public interface MovieDAO extends JpaRepository<Movie, Integer>{

}
