package com.mentor.hibernate.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	@Id
	@Column(name="userId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	  int userId ;
	
	@Column(name="userName")
      String userName ;
	
	@Column(name="password")
     String password ;
	
	@Column(name="firstName")
     String firstName ;
	
	@Column(name="lastName")
      String lastName ;
	
	@Column(name="contactNumber")
     int contactNumber ;
	
	@Column(name="role")
     String role ;
	
	@Column(name="linkedinURL")
     String linkedinURL ;
	
	@Column(name="experience")
     int experience ;
	
	@Column(name="active")
     boolean active ;
	
	@Column(name="confirmedSignUp")
     boolean confirmedSignUp ;
	
	@Column(name="resetPassword")
     boolean resetPassword ;
	
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLinkedinURL() {
		return linkedinURL;
	}

	public void setLinkedinURL(String linkedinURL) {
		this.linkedinURL = linkedinURL;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isConfirmedSignUp() {
		return confirmedSignUp;
	}

	public void setConfirmedSignUp(boolean confirmedSignUp) {
		this.confirmedSignUp = confirmedSignUp;
	}

	public boolean isResetPassword() {
		return resetPassword;
	}

	public void setResetPassword(boolean resetPassword) {
		this.resetPassword = resetPassword;
	}

	
	
	
	
	
	
      
	

}
