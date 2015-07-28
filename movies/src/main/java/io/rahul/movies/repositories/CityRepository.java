package io.rahul.movies.repositories;

import io.rahul.movies.domain.Cities;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "cities", path = "cities")
public interface CityRepository extends PagingAndSortingRepository<Cities, Long> {
	
	@RestResource(path = "name", rel = "name")
	Page<Cities> findByNameIgnoreCase(@Param("q") String name, Pageable pageable);

	@RestResource(path = "nameContains", rel = "nameContains")
	Page<Cities> findByNameContainsIgnoreCase(@Param("q") String name, Pageable pageable);

	@RestResource(path = "state", rel = "state")
	Page<Cities> findByStateCodeIgnoreCase(@Param("q") String stateCode, Pageable pageable);

	@RestResource(path = "postalCode", rel = "postalCode")
	Page<Cities> findByPostalCode(@Param("q") String postalCode, Pageable pageable);

}
