package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entity.CandidatRoleEntity;

@Repository
public interface CandiRoleRepo extends JpaRepository<CandidatRoleEntity, Integer> {
	
	CandidatRoleEntity findById(int candiRoleId);

}
