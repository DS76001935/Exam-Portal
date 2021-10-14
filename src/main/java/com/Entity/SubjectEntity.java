//package com.Entity;
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "Subjects")
//public class SubjectEntity {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	int subId;
//	
//	String subName;
//	
//	@OneToMany(mappedBy = "subject")
//	List<TopicEntity> topic;
//	
//	@ManyToOne
//	QuestionEntity question;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	CandidateEntity candidate;
//	
//	public int getSubId() {
//		return subId;
//	}
//	public void setSubId(int subId) {
//		this.subId = subId;
//	}
//	public String getSubName() {
//		return subName;
//	}
//	public void setSubName(String subName) {
//		this.subName = subName;
//	}
//	
//	public List<TopicEntity> getTopic() {
//		return topic;
//	}
//	public void setTopic(List<TopicEntity> topic) {
//		this.topic = topic;
//	}
//	public QuestionEntity getQuestion() {
//		return question;
//	}
//	public void setQuestion(QuestionEntity question) {
//		this.question = question;
//	}
//	public CandidateEntity getCandidate() {
//		return candidate;
//	}
//	public void setCandidate(CandidateEntity candidate) {
//		this.candidate = candidate;
//	}
//	
//
//}
