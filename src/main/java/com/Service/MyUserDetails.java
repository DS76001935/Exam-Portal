package com.Service;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.Entity.CandidateEntity;

public class MyUserDetails implements UserDetails {

	@Autowired
	CandidateEntity candidate;
	
	public MyUserDetails(CandidateEntity candidate) {
		super();
		this.candidate = candidate;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		HashSet<SimpleGrantedAuthority> hs = new HashSet<>();
		hs.add(new SimpleGrantedAuthority(candidate.getRoleType()));
		return hs;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return candidate.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return candidate.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
