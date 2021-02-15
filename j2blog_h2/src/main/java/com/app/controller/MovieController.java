package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Movie;
import com.app.service.MovieService;

@RestController
//@RequestMapping("/movies")
public class MovieController {

	@Autowired
	MovieService movieService;

	@GetMapping("/movies")
	private ResponseEntity<?> getAllMovies() {
		return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.OK);
	}

	@GetMapping("/movies/{id}")
	private ResponseEntity<?> getMovie(@PathVariable("id") int id ) {
		return new ResponseEntity<>(movieService.getMovieById(id), HttpStatus.OK);
	}
	@DeleteMapping("/movies/{id}")
	private void deleteMovie(@PathVariable("id") int id) {
		movieService.delete(id);
	}
	@PostMapping("/movies")
	private int saveMovie(@RequestBody Movie movie) {
		movieService.saveOrUpdate(movie);
		return movie.getId();
	}
	@PostMapping("/movies/multiSave")
	private ResponseEntity<?> saveAllMovies(@RequestBody List<Movie> movies) {
		return new ResponseEntity<>(movieService.saveAll(movies),HttpStatus.OK);
	}
}
