package io.rahul.movies.repositories;

import io.rahul.movies.domain.Movie;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
	public Movie findByMlId(String mlId);
}
