package com.Controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.AdminProposalEntity;
import com.Entity.AuthenticationResponse;
import com.Entity.CandidatRoleEntity;
import com.Entity.CandidateEntity;
import com.Entity.ResponseEntity;
import com.Entity.RoleEntity;
import com.Repository.AdminProposalRepo;
import com.Repository.CandiRoleRepo;
import com.Repository.CandidateRepo;
import com.Repository.RoleRepo;
import com.Service.JWTUtill;
import com.Service.MailSend;
import com.Service.MyUserDetails;
import com.Service.MyUserDetailsService;

@RestController
@RequestMapping("/public")
public class SessionController {
	
	@Autowired
	CandidateRepo crepo;
	
	@Autowired
	RoleRepo roleRepo;
	
	@Autowired
	AdminProposalRepo aprepo;
	
	@Autowired
	CandiRoleRepo candiRoleRepo;
	
	@Autowired
	AuthenticationManager authManager;
	
	@Autowired
	JWTUtill jwtUtill;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	MyUserDetailsService myUserDetailsService;
	
	@PostMapping("/addUser")
	public ResponseEntity<CandidateEntity> addUser(@RequestBody CandidateEntity candidate, RoleEntity role){
		
		ResponseEntity<CandidateEntity> res = new ResponseEntity<>();
		
		CandidateEntity candi  = crepo.findByEmail(candidate.getEmail());
		
		role.setRoleName("USER");
		RoleEntity role1 = roleRepo.findByRoleName(role.getRoleName());
		
		if(role1 != null) {
			if(candi != null){
				System.out.println("User is already Exist!");
//				throw new Exception("User is already exist!");
				
				res.setData(candidate);
				res.setMessage("User is already exist!");
				res.setStatus(-1);
			}else {
				Set<CandidatRoleEntity> candiRoleSet = new HashSet<>();
				CandidatRoleEntity candiroles = new CandidatRoleEntity();
				
				candiroles.setRole(role1);
				
				candidate.setFlag(true);
				candiroles.setCandidate(candidate);
				
				candiRoleSet.add(candiroles);
				
				for(CandidatRoleEntity cr: candiRoleSet) {
					roleRepo.save(cr.getRole());
				}
				
				candidate.getCandirole().addAll(candiRoleSet);
				
				crepo.save(candidate);
				
				res.setData(candidate);
				res.setMessage("The candidate has saved successfully.");
				res.setStatus(200);
			}
		}else {
			if(candi != null){
				System.out.println("User is already Exist!");
//				throw new Exception("User is already exist!");
				
				res.setData(candidate);
				res.setMessage("User is already exist!");
				res.setStatus(-1);
			}else {
				Set<CandidatRoleEntity> candiRoleSet = new HashSet<>();
				CandidatRoleEntity candiroles = new CandidatRoleEntity();
				
//				if(role1.getRoleName() != null) {
//					res.setStatus(-1);
//					res.setMessage("The role is already exist!");
//				}else {
				candiroles.setRole(role1);
//				}
				
				candidate.setFlag(true);
				candiroles.setCandidate(candidate);
				
				candiRoleSet.add(candiroles);
				
//				for(CandidatRoleEntity cr: candiRoleSet) {
//					roleRepo.save(cr.getRole());
//				}
				
				candidate.getCandirole().addAll(candiRoleSet);
				
				crepo.save(candidate);
				
				res.setData(candidate);
				res.setMessage("The candidate has saved successfully.");
				res.setStatus(200);
			}
		}
		
//		candidate.setFlag(true);
//		
//		String rName = "SUPERADMIN";
//		String role_type= rName+"_ROLE";
//		RoleEntity role1 = roleRepo.findByRoleName(rName);
//		candidate.setRole(role1);
//		candidate.setRoleType(role_type);
//		List<CandidateEntity> candiList = new ArrayList<>();
//		role1.setCandidates(candiList);
//		String encrypted_password = passwordEncoder.encode(candidate.getPassword());
//		System.out.println("Encrypted Password => "+encrypted_password);
//		candidate.setPassword(encrypted_password);
//		crepo.save(candidate);
//		
//		res.setStatus(200);
//		res.setMessage("The candidate has added successfully.");
//		res.setData(candidate);
		
		return res;
	}
	
	@PostMapping("/adminProposal")
	public ResponseEntity<AdminProposalEntity> addAdminProposal(@RequestBody AdminProposalEntity proposal){
		ResponseEntity<AdminProposalEntity> res = new ResponseEntity<>();
		
		AdminProposalEntity adminProposal = aprepo.findByAemail(proposal.getAemail());
		
		if(adminProposal != null) {
			res.setStatus(-1);
			res.setMessage("Your proposal is already exist in our system!");
			res.setData(adminProposal);
		}else {
			
			aprepo.save(proposal);
			
			String sub = "A proposal for admin position on our system from "+proposal.getAname()+". Please just go through it once.";
			String text = "Hey Mr. Superadmin, here all the details of the person who submitted the admin proposal form as follows,"
					+ "\nAlien Name: "+proposal.getAname()+"\nAlien Age: "+proposal.getAge()+"\nAlien Address: "+proposal.getLocaladdress()
					+"\nAlien Mobile: "+proposal.getAmobile()+"\nAlien Email:"+proposal.getAemail()
					+"\n\n Please just go through this details and decide whether this person is eligible for the position or not."
					+"\n If he/she could be eligible then add them to our system as an admin otherwise just give a revert on your own words.";
			
			CandidatRoleEntity candiRole = candiRoleRepo.findById(1);
			
			String cemail = candiRole.getCandidate().getEmail();
			
			MailSend.mail(cemail,sub, text);
			
			res.setStatus(200);
			res.setMessage("Your proposal has saved successfully...");
			res.setData(proposal);
			
		}
		
		return res;
	}
	
	@PostMapping("/addAdmin")
	public ResponseEntity<CandidateEntity> AddAdmin(@RequestBody CandidateEntity candidate, RoleEntity role){
		
		ResponseEntity<CandidateEntity> res = new ResponseEntity<>();
		
		CandidateEntity candi  = crepo.findByEmail(candidate.getEmail());
		
		role.setRoleName("ADMIN");
		RoleEntity role1 = roleRepo.findByRoleName(role.getRoleName());
		
		if(role1 != null) {
			if(candi != null){
				System.out.println("User is already Exist!");
//				throw new Exception("User is already exist!");
				
				res.setData(candidate);
				res.setMessage("User is already exist!");
				res.setStatus(-1);
			}else {
				Set<CandidatRoleEntity> candiRoleSet = new HashSet<>();
				CandidatRoleEntity candiroles = new CandidatRoleEntity();
				
				candiroles.setRole(role1);
				
				candidate.setFlag(true);
				candiroles.setCandidate(candidate);
				
				candiRoleSet.add(candiroles);
				
				for(CandidatRoleEntity cr: candiRoleSet) {
					roleRepo.save(cr.getRole());
				}
				
				candidate.getCandirole().addAll(candiRoleSet);
				
				crepo.save(candidate);
				
				String sub = "";
				
				String text = "";
				
				MailSend.mail(candidate.getEmail(), sub, text);
				
				res.setData(candidate);
				res.setMessage("The candidate has saved successfully.");
				res.setStatus(200);
			}
		}else {
			if(candi != null){
				System.out.println("User is already Exist!");
//				throw new Exception("User is already exist!");
				
				res.setData(candidate);
				res.setMessage("User is already exist!");
				res.setStatus(-1);
			}else {
				Set<CandidatRoleEntity> candiRoleSet = new HashSet<>();
				CandidatRoleEntity candiroles = new CandidatRoleEntity();
				
				candiroles.setRole(role1);
				
				candidate.setFlag(true);
				candiroles.setCandidate(candidate);
				
				candiRoleSet.add(candiroles);
				
				candidate.getCandirole().addAll(candiRoleSet);
				
				crepo.save(candidate);
				
				res.setData(candidate);
				res.setMessage("The candidate has saved successfully.");
				res.setStatus(200);
			}
		}
		
		return res;
	}
	
	@PostMapping("/authenticate")
	public AuthenticationResponse Authenticate(@RequestBody CandidateEntity candidate) throws Exception {
		
//		ResponseEntity<CandidateEntity> res = new ResponseEntity<>();
		
//		CandidateEntity candi1 = crepo.findByEmailAndPassword(candidate.getEmail(), candidate.getPassword());
		
//		if(candi1 != null) {
//			res.setMessage("The user has authenticated successfully...");
//			res.setStatus(200);
//			res.setData(candi1);
//		}else {
//			res.setMessage("Invalid User!");
//			res.setStatus(-1);
//			res.setData(null);
//		}
		
		try {
			authManager.authenticate(
				new UsernamePasswordAuthenticationToken(candidate.getEmail(),candidate.getPassword())
			);
		}catch(BadCredentialsException e) {
			throw new Exception("Incorrect Email or Password!", e);
		}
		MyUserDetails myUserDetails = myUserDetailsService.loadUserByUsername(candidate.getEmail());
		final String jwt = jwtUtill.generateToken(myUserDetails);
		
		return new AuthenticationResponse(jwt);
		
	}
	
//	@GetMapping("/login")
//	public String Login() {
//		return "login";
//	}
	
	@GetMapping("/errorPage")
	public ResponseEntity<CandidateEntity> ErrorPage(){
		ResponseEntity<CandidateEntity> res = new ResponseEntity<>();
	
		res.setStatus(-1);
		res.setData(null);
		res.setMessage("Something went wrong!");
		return res;
	}
	
	

}
