package com.mentor.hibernate.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TrainingDetails")
public class TrainingDetails {
	
	
	@Id
	@Column(name="trainingDetailsId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int trainingDetailsId;
	
	@Column(name="status")
	String status;
	
	@Column(name="progress")
	int progress;
	
	@Column(name="fees")
	float fees;
	
	@Column(name="commissionAmount")
	float commissionAmount;
	
	@Column(name="rating")
	int rating;
	
	@Column(name="startDate")
	Date startDate;
	
	@Column(name="endDate")
	Date endDate;
	
	@Column(name="startTime")
	Time startTime;
	
	@Column(name="endTime")
	Time endTime;
	
	@Column(name="amountReceived")
	float amountReceived;
	
	@Column(name="userId")
	int userId;
	
	@Column(name="mentorId")
	int mentorId;
	
	@Column(name="skillId")
	int skillId;

	public int getTrainingDetailsId() {
		return trainingDetailsId;
	}

	public void setTrainingDetailsId(int trainingDetailsId) {
		this.trainingDetailsId = trainingDetailsId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public float getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(float commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public float getAmountReceived() {
		return amountReceived;
	}

	public void setAmountReceived(float amountReceived) {
		this.amountReceived = amountReceived;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMentorId() {
		return mentorId;
	}

	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	
	
	
	

}
