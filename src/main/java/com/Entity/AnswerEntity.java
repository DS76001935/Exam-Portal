//package com.Entity;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "answers")
//public class AnswerEntity {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	int ansId;
//	String UserAnswer;
//	String AnswerStatus;
//	
//	@OneToOne
//	OptionEntity option;
//	
//	@OneToOne
//	CandidateEntity candidate;
//	@OneToOne
//	QuestionEntity question;
//
//	public int getAnsId() {
//		return ansId;
//	}
//
//	public void setAnsId(int ansId) {
//		this.ansId = ansId;
//	}
//
//	public String getUserAnswer() {
//		return UserAnswer;
//	}
//
//	public void setUserAnswer(String userAnswer) {
//		UserAnswer = userAnswer;
//	}
//
//	public String getAnswerStatus() {
//		return AnswerStatus;
//	}
//
//	public void setAnswerStatus(String answerStatus) {
//		AnswerStatus = answerStatus;
//	}
//
//	public OptionEntity getOption() {
//		return option;
//	}
//
//	public void setOption(OptionEntity option) {
//		this.option = option;
//	}
//
//	public CandidateEntity getCandidate() {
//		return candidate;
//	}
//
//	public void setCandidate(CandidateEntity candidate) {
//		this.candidate = candidate;
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
////	@Override
////	public String toString() {
////		return "AnswerEntity [ansId=" + ansId + ", UserAnswer=" + UserAnswer + ", AnswerStatus=" + AnswerStatus
////				+ ", option=" + option + ", candidate=" + candidate + ", question=" + question + "]";
////	}
//	
//}
