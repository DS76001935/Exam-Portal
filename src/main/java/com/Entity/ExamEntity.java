//package com.Entity;
//
//import java.sql.Timestamp;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "exams")
//public class ExamEntity {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	int examId;
//	String title, description;
//	int noOfQue, pointPerQue;
//	boolean isNeg = false;
//	int deductionOf;
//	boolean isActive = false;
//	Timestamp startDateTime, endDateTime;
//	boolean isPublic = false;
//	String batchCode;
//	int totalMarks;
//	
//	@OneToOne
//	CandidateEntity candidate;
//	
//	@OneToOne
//	SubjectEntity subject;
//	
//	@OneToOne
//	TopicEntity topic;
//
//	public int getExamId() {
//		return examId;
//	}
//
//	public void setExamId(int examId) {
//		this.examId = examId;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public int getNoOfQue() {
//		return noOfQue;
//	}
//
//	public void setNoOfQue(int noOfQue) {
//		this.noOfQue = noOfQue;
//	}
//
//	public int getPointPerQue() {
//		return pointPerQue;
//	}
//
//	public void setPointPerQue(int pointPerQue) {
//		this.pointPerQue = pointPerQue;
//	}
//
//	public boolean isNeg() {
//		return isNeg;
//	}
//
//	public void setNeg(boolean isNeg) {
//		this.isNeg = isNeg;
//	}
//
//	public int getDeductionOf() {
//		return deductionOf;
//	}
//
//	public void setDeductionOf(int deductionOf) {
//		this.deductionOf = deductionOf;
//	}
//
//	public boolean isActive() {
//		return isActive;
//	}
//
//	public void setActive(boolean isActive) {
//		this.isActive = isActive;
//	}
//
//	public Timestamp getStartDateTime() {
//		return startDateTime;
//	}
//
//	public void setStartDateTime(Timestamp startDateTime) {
//		this.startDateTime = startDateTime;
//	}
//
//	public Timestamp getEndDateTime() {
//		return endDateTime;
//	}
//
//	public void setEndDateTime(Timestamp endDateTime) {
//		this.endDateTime = endDateTime;
//	}
//
//	public boolean isPublic() {
//		return isPublic;
//	}
//
//	public void setPublic(boolean isPublic) {
//		this.isPublic = isPublic;
//	}
//
//	public String getBatchCode() {
//		return batchCode;
//	}
//
//	public void setBatchCode(String batchCode) {
//		this.batchCode = batchCode;
//	}
//
//	public int getTotalMarks() {
//		return totalMarks;
//	}
//
//	public void setTotalMarks(int totalMarks) {
//		this.totalMarks = totalMarks;
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
//	public SubjectEntity getSubject() {
//		return subject;
//	}
//
//	public void setSubject(SubjectEntity subject) {
//		this.subject = subject;
//	}
//
//	public TopicEntity getTopic() {
//		return topic;
//	}
//
//	public void setTopic(TopicEntity topic) {
//		this.topic = topic;
//	}
//
//	@Override
//	public String toString() {
//		return "ExamEntity [examId=" + examId + ", title=" + title + ", description=" + description + ", noOfQue="
//				+ noOfQue + ", pointPerQue=" + pointPerQue + ", isNeg=" + isNeg + ", deductionOf=" + deductionOf
//				+ ", isActive=" + isActive + ", startDateTime=" + startDateTime + ", endDateTime=" + endDateTime
//				+ ", isPublic=" + isPublic + ", batchCode=" + batchCode + ", totalMarks=" + totalMarks + ", candidate="
//				+ candidate + ", subject=" + subject + ", topic=" + topic + "]";
//	}
//	
//}
