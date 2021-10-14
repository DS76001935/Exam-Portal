package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entity.AdminProposalEntity;

@Repository
public interface AdminProposalRepo extends JpaRepository<AdminProposalEntity, Integer> {
	
	AdminProposalEntity findByAemail(String email);

}
