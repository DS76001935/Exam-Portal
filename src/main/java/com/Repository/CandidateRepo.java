package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entity.CandidateEntity;

@Repository
public interface CandidateRepo extends JpaRepository<CandidateEntity, Integer> {
	CandidateEntity findByEmail(String email);
	CandidateEntity findByEmailAndPassword(String email, String password);
	CandidateEntity findById(int candidateId);
}
