package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entity.RoleEntity;

@Repository
public interface RoleRepo extends JpaRepository<RoleEntity, Integer> {
	
	RoleEntity findByRoleName(String roleName);

}
