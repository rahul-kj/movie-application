package io.rahul.movie.reviews.repositories;

import io.rahul.movie.reviews.domain.Likes;

import org.springframework.data.neo4j.repository.GraphRepository;

public interface LikesRepository extends GraphRepository<Likes> {

}
