package com.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CandidateRole")
public class CandidatRoleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int candiRoleId;
	
	@ManyToOne
	CandidateEntity candidate;
	
	@ManyToOne
	RoleEntity role;

	public int getCandiRoleId() {
		return candiRoleId;
	}

	public void setCandiRoleId(int candiRoleId) {
		this.candiRoleId = candiRoleId;
	}

	public CandidateEntity getCandidate() {
		return candidate;
	}

	public void setCandidate(CandidateEntity candidate) {
		this.candidate = candidate;
	}

	public RoleEntity getRole() {
		return role;
	}

	public void setRole(RoleEntity role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "CandidatRoleEntity [candiRoleId=" + candiRoleId + ", candidate=" + candidate + ", role=" + role + "]";
	}

}
