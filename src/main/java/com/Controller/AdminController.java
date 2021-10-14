package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.CandidateEntity;
import com.Entity.ResponseEntity;
import com.Repository.CandidateRepo;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	CandidateRepo crepo;
	
	@GetMapping("/candidates")
	public ResponseEntity<List<CandidateEntity>> getAllCandidates(){
		ResponseEntity<List<CandidateEntity>> res = new ResponseEntity<>();
		
		List<CandidateEntity> candidateList = crepo.findAll();
		
		res.setMessage("All Candidates are retrieved...");
		res.setStatus(200);
		res.setData(candidateList);
		
		return res;
	}
	
	@GetMapping("/candidates/{candidateId}")
	public ResponseEntity<CandidateEntity> getCandidateById(@PathVariable("candidateId") int candidateId){
		
		ResponseEntity<CandidateEntity> res = new ResponseEntity<>();
		
		CandidateEntity candidate = crepo.findById(candidateId);
		res.setMessage("The candidate is retrieved successfully...");
		res.setStatus(200);
		res.setData(candidate);
		
		return res;
	}
	
	@DeleteMapping("/deleteCandidate/{candidateId}")
	public ResponseEntity<CandidateEntity> deleteCandidateById(@PathVariable("candidateId") int candidateId){
		
		ResponseEntity<CandidateEntity> res = new ResponseEntity<>();
		
		CandidateEntity candidate = crepo.findById(candidateId);
		
		crepo.delete(candidate);
		
		res.setMessage("The candidate is removed successfully...");
		res.setStatus(200);
		res.setData(candidate);
		
		return res;	
	}
	
	@PutMapping("/updateCandidate/{candidateId}")
	public ResponseEntity<CandidateEntity> updateCandidate(@PathVariable("candidateId") int candidateId, @RequestBody CandidateEntity requested_candidate){
		
		ResponseEntity<CandidateEntity> res = new ResponseEntity<>();
		
		CandidateEntity existing_candidate = crepo.findById(candidateId);
		
		if(requested_candidate.getcName() != null) {
		}
		
		return res;		
	}

}
