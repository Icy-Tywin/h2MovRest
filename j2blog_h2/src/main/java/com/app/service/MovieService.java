package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.MovieRepository;
import com.app.pojos.Movie;

@Service
public class MovieService {
	@Autowired
	MovieRepository repository;
	public List<Movie> getAllMovies() {
		List<Movie> movies = new ArrayList<>();
		repository.findAll().forEach(movie->movies.add(movie));
		return movies;
	}
	public Movie getMovieById(int id) {
		return repository.findById(id).orElseThrow(()->new RuntimeException(" could not find the movie by that id."));
	}
	public void saveOrUpdate(Movie movie) {
		Movie m = repository.save(movie);
		if(!m.equals(movie))
			throw new RuntimeException(" an error occured durng the save process ");
	}
	public void delete(int id) {
		repository.deleteById(id);
	}
	public Iterable<Movie> saveAll(List<Movie> movies) {
		List<Movie> m = (List<Movie>)  repository.saveAll(movies);
		return m;
	}

}
