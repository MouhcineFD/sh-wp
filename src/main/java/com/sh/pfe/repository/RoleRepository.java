package com.sh.pfe.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sh.pfe.models.ERole;
import com.sh.pfe.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
