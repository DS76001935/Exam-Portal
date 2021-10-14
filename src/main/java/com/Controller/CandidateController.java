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
@RequestMapping("/candidates")
public class CandidateController {
	
	@Autowired
	CandidateRepo crepo;
	
	@GetMapping("/candidates/{candidateId}")
	public ResponseEntity<CandidateEntity> getCandidateById(@PathVariable("candidateId") int candidateId){
		
		ResponseEntity<CandidateEntity> res = new ResponseEntity<>();
		
		CandidateEntity candidate = crepo.findById(candidateId);
		res.setMessage("The candidate is retrieved successfully...");
		res.setStatus(200);
		res.setData(candidate);
		
		return res;
	}
}
