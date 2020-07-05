package com.sh.pfe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sh.pfe.models.Category;

@RepositoryRestResource
public interface CategoryRepository extends MongoRepository<Category,String> {
}
