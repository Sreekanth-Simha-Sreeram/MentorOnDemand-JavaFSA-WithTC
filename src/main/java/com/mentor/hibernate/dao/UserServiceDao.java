package com.mentor.hibernate.dao;

import java.util.List;

import com.mentor.hibernate.model.Mentor;
import com.mentor.hibernate.model.TrainingDetails;
import com.mentor.hibernate.model.User;

public interface UserServiceDao {
	
	 public boolean createProfile (User user);
	 Mentor viewMentor (int mentorId);
	 List<Mentor> searchMentor(String technology);
	 Mentor selectMentor(int mentorId);
     boolean sendProposal(int userId,int mentorId);
     boolean assignRating(int rating);
     List<TrainingDetails> viewTrainings(String status);


}
