package com.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.pojos.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer> {

}
