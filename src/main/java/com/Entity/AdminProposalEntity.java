package com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AdminProposals")
public class AdminProposalEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "proposalId")
	int pId;
	
	@Column(name = "proposal")
	String proposal;
	
	@Column(name = "alienName")
	String aname;
	
	@Column(name = "alienAge")
	int age;
	
	@Column(name = "alienAddress")
	String localaddress;
	
	@Column(name = "alienMobile")
	String amobile;
	
	@Column(name = "alienEmail")
	String aemail;
	
	@Column(name = "businessName")
	String busiName;
	
	@Column(name = "businessType")
	String busiType;
	
	@Column(name = "qualification")
	String qualification;
	
	@Column(name = "business")

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getProposal() {
		return proposal;
	}

	public void setProposal(String proposal) {
		this.proposal = proposal;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocaladdress() {
		return localaddress;
	}

	public void setLocaladdress(String localaddress) {
		this.localaddress = localaddress;
	}

	public String getAmobile() {
		return amobile;
	}

	public void setAmobile(String amobile) {
		this.amobile = amobile;
	}

	public String getAemail() {
		return aemail;
	}

	public void setAemail(String aemail) {
		this.aemail = aemail;
	}

	public String getBusiName() {
		return busiName;
	}

	public void setBusiName(String busiName) {
		this.busiName = busiName;
	}

	public String getBusiType() {
		return busiType;
	}

	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

}
