package org.aut.dao;

import org.aut.entities.SubCategory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SubCategoryRepository extends MongoRepository<SubCategory,String> {
}
