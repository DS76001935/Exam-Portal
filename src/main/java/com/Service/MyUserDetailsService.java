package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Entity.CandidateEntity;
import com.Repository.CandidateRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	CandidateRepo crepo;

	@Override
	public MyUserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		CandidateEntity candidate = crepo.findByEmail(email);
		System.out.println("Candidate from userdetailsservice => "+candidate);
		if(candidate == null) {
			throw new UsernameNotFoundException(email);
		}
		return new MyUserDetails(candidate);
	}

}
