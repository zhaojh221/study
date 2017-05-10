package com.ootb.cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ootb.cloud.entity.Role;

/**
 * Spring Data JPA repository for the Role entity.
 */
@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role,Long> {

}
