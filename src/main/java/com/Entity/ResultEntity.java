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
//@Table(name="result")
//public class ResultEntity {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	int resultId;
//	
//	String status;
//	
//	@OneToOne
//	private ExamEntity exam;
//	
//	@OneToOne
//	CandidateEntity candidate;
//	
//	@OneToOne
//	AnswerEntity answers;
//	
//	public int getResultId() {
//		return resultId;
//	}
//
//	public void setResultId(int resultId) {
//		this.resultId = resultId;
//	}
//
//	public String getStatus() {
//		return status;
//	}
//
//	public void setStatus(String status) {
//		this.status = status;
//	}
//
//	public ExamEntity getExam() {
//		return exam;
//	}
//
//	public void setExam(ExamEntity exam) {
//		this.exam = exam;
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
//	public AnswerEntity getAnswers() {
//		return answers;
//	}
//
//	public void setAnswers(AnswerEntity answers) {
//		this.answers = answers;
//	}
//}
