package com.Entity;

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

@Entity
@Table(name = "Roles")
public class RoleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "roleId")
	int roleId;
	@Column(name = "roleName")
	String roleName;
	
	@OneToMany(mappedBy = "role",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	Set<CandidatRoleEntity> candirole = new HashSet<>();
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Set<CandidatRoleEntity> getCandirole() {
		return candirole;
	}
	public void setCandirole(Set<CandidatRoleEntity> candirole) {
		this.candirole = candirole;
	}
	
}
