package io.rahul.movie.reviews.repositories;

import io.rahul.movie.reviews.domain.Person;

import org.springframework.data.neo4j.repository.GraphRepository;

public interface PersonRepository extends GraphRepository<Person> {
	Person findByUserName(String userName);
}
