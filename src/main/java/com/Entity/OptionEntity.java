//package com.Entity;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="Options")
//public class OptionEntity {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	int optionId;
//	
//	
//	@Column(name="optionName")
//	String optName;
//	
//	
//	@Column(name="correctAnswer")
//	String CorrAnswer;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	QuestionEntity question;
//
//	public int getOptionId() {
//		return optionId;
//	}
//
//	public void setOptionId(int optionId) {
//		this.optionId = optionId;
//	}
//
//	public String getOptName() {
//		return optName;
//	}
//
//	public void setOptName(String optName) {
//		this.optName = optName;
//	}
//
//	public String getCorrAnswer() {
//		return CorrAnswer;
//	}
//
//	public void setCorrAnswer(String corrAnswer) {
//		CorrAnswer = corrAnswer;
//	}
//	
//	@JoinColumn(name = "queId")
//	public QuestionEntity getQuestion() {
//		return question;
//	}
//
//	public void setQuestion(QuestionEntity question) {
//		this.question = question;
//	}
//
//	@Override
//	public String toString() {
//		return "OptionEntity [optionId=" + optionId + ", optName=" + optName + ", CorrAnswer=" + CorrAnswer
//				+ ", question=" + question + "]";
//	}
//}
