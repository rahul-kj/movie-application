package io.rahul.movie.reviews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableMongoRepositories
@EnableNeo4jRepositories(basePackages = "io.springbox.recommendations.repositories")
public class MovieReviewsStartupApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieReviewsStartupApplication.class, args);
	}

}
