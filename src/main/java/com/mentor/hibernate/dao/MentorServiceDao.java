package com.mentor.hibernate.dao;

import java.util.List;

import com.mentor.hibernate.model.Mentor;
import com.mentor.hibernate.model.User;

public interface MentorServiceDao {
	
	Mentor createProfile(Mentor mentor);
	Mentor viewMyProfile(int mentorId);
	boolean updateProfile(int mentorId);
	Mentor deactivateProfile(int mentorId);
	public void viewProposal();
    boolean acceptProposal(User user);


}
