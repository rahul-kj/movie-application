package io.rahul.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@SpringBootApplication
@EnableJpaRepositories
@EnableDiscoveryClient
@Import(RepositoryRestMvcConfiguration.class)
public class MoviesStartupApplication {
	public static void main(String[] args) {
        SpringApplication.run(MoviesStartupApplication.class, args);
    }
}
