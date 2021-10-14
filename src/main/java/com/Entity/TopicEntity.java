//package com.Entity;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "Topics")
//public class TopicEntity {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	int topicId;
//	String topicName;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	SubjectEntity subject;
//	
//	@ManyToOne
//	QuestionEntity question;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	CandidateEntity candidate;
//
//	public int getTopicId() {
//		return topicId;
//	}
//
//	public void setTopicId(int topicId) {
//		this.topicId = topicId;
//	}
//
//	public String getTopicName() {
//		return topicName;
//	}
//
//	public void setTopicName(String topicName) {
//		this.topicName = topicName;
//	}
//
//	public SubjectEntity getSubject() {
//		return subject;
//	}
//
//	public void setSubject(SubjectEntity subject) {
//		this.subject = subject;
//	}
//
//	public QuestionEntity getQuestion() {
//		return question;
//	}
//
//	public void setQuestion(QuestionEntity question) {
//		this.question = question;
//	}
//
//	public CandidateEntity getCandidate() {
//		return candidate;
//	}
//
//	public void setCandidate(CandidateEntity candidate) {
//		this.candidate = candidate;
//	}
//}
