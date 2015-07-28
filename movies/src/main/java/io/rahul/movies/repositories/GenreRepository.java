package io.rahul.movies.repositories;

import io.rahul.movies.domain.Genre;

import org.springframework.data.repository.CrudRepository;

public interface GenreRepository extends CrudRepository<Genre, Long> {
	Genre findByMlId(String mlId);
}
