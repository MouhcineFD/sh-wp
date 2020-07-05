package com.sh.pfe.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sh.pfe.models.Product;

@CrossOrigin(origins = "*", maxAge = 3600)
@RepositoryRestResource
public interface ProductRepository extends MongoRepository<Product, String> {

	<S extends Product> Page<S> findByProductFrom(String productFrom, Example<S> example, Pageable pageable);

}
