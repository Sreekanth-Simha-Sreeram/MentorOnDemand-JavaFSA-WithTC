package com.mentor.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mentor")
public class Mentor {
	
	@Id
	@Column(name="mentorId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int mentorId;
	@Column(name="email")
	String email;
	@Column(name="technology")
	String technology;
	@Column(name="experience")
	float experience;
	@Column(name="facilities")
	String facilities;
	@Column(name="fees")
	float fees;
	@Column(name="workHours")
	float workHours;
	public int getMentorId() {
		return mentorId;
	}
	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	public String getFacilities() {
		return facilities;
	}
	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public float getWorkHours() {
		return workHours;
	}
	public void setWorkHours(float workHours) {
		this.workHours = workHours;
	}
	
	
	
	
	
	
	
	
}
