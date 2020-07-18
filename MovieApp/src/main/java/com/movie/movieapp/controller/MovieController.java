package com.movie.movieapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.movie.movieapp.entity.Movie;
import com.movie.movieapp.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	@Autowired
	MovieService movieservice;
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public Optional<Movie> getMovie(@PathVariable int id){
		return this.movieservice.getMovieById(id);
		
	}
	
	@RequestMapping(value = "/addMovie",method = RequestMethod.POST)
	public Movie addMovie(@RequestBody Movie movie) {
		return this.movieservice.addEmployee(movie);
	}
	
	@RequestMapping(value = "/updateMovie",method = RequestMethod.PUT)
	public Movie updateMovie(@RequestBody Movie movie) {
		return this.movieservice.updateMovie(movie);
		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteMovie(@PathVariable int id) {
		this.movieservice.deleteMovieById(id);
	}
	@RequestMapping(value = "/deleteAll",method=RequestMethod.DELETE)
	public void deleteAllMovies() {
		this.movieservice.deleteAllMovies();
	}
	
}
