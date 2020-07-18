package com.movie.movieapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.movieapp.dao.MovieDAO;
import com.movie.movieapp.entity.Movie;


@Service
public class MovieService {

	@Autowired
	MovieDAO movieDao;
	
	
	public Optional <Movie> getMovieById(int id ) {
		return this.movieDao.findById(id);
	}
	public Movie addEmployee(Movie movie) {
		return this.movieDao.save(movie);
	}

	public Movie updateMovie(Movie movie) {
		return this.movieDao.save(movie);
	}
	
	public void deleteMovieById(int id) {
		this.movieDao.deleteById(id);
	}
	
	public void deleteAllMovies() {
		this.movieDao.deleteAll();
	}
	

	public List<Movie> getAllMovies() {
		return this.movieDao.findAll();
	}
	
	
	
}
