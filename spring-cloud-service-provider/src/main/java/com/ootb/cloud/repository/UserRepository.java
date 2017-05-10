package com.ootb.cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ootb.cloud.entity.User;

/**
 * Spring Data JPA repository for the User entity.
 */
@RepositoryRestResource
public interface UserRepository extends JpaRepository<User,Long> {

}
