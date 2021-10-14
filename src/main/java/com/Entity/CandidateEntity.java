package com.Entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Candidates")
public class CandidateEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "candidateId")
	int cId;
	
	@Column(name="candidateName")
	String cName;
	
	@Column(name="candidateAge")
	int cAge;
	
	@Column(name = "candidateAddress")
	String cAddress;
	
	@Column(name="candidateMobile")
	String cMobile;
	
	@Column(name = "candidateEmail")
	String email;
	
	@Column(name="candidatePassword")
	String password;
	
	@Column(name="alterEmail")
	String alterEmail;
	
	@Column(name="createdAt")
	Timestamp createdAt;
	
	@Column(name="flag")
	boolean flag;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "candidate",fetch = FetchType.EAGER)
	@JsonIgnore
	Set<CandidatRoleEntity> candirole = new HashSet<>();
	
	public int getcId() {
		return cId;
	} 
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getcAge() {
		return cAge;
	}
	public void setcAge(int cAge) {
		this.cAge = cAge;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	public String getcMobile() {
		return cMobile;
	}
	public void setcMobile(String cMobile) {
		this.cMobile = cMobile;
	}
	
	public String getAlterEmail() {
		return alterEmail;
	}
	public void setAlterEmail(String alterEmail) {
		this.alterEmail = alterEmail;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public Set<CandidatRoleEntity> getCandirole() {
		return candirole;
	}
	public void setCandirole(Set<CandidatRoleEntity> candirole) {
		this.candirole = candirole;
	}
}
