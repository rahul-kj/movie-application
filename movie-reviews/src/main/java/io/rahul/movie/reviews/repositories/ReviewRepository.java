package io.rahul.movie.reviews.repositories;

import io.rahul.movie.reviews.domain.Review;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, String> {
	Iterable<Review> findByMlId(String mlId);
}
