//package com.Entity;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "questions")
//public class QuestionEntity {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private String queId;
//	private String queName;
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	List<SubjectEntity> subjects = new ArrayList<>();
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	List<TopicEntity> topics = new ArrayList<>();
//
//	public String getQueId() {
//		return queId;
//	}
//
//	public void setQueId(String queId) {
//		this.queId = queId;
//	}
//
//	public String getQueName() {
//		return queName;
//	}
//	
//	public void setQueName(String queName) {
//		this.queName = queName;
//	}
//	
//}
