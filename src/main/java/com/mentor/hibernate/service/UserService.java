package com.mentor.hibernate.service;
import com.mentor.hibernate.model.Mentor;
import com.mentor.hibernate.model.TrainingDetails;
import com.mentor.hibernate.model.User;

import java.util.List;

public interface UserService {
	
	 public boolean createProfile (User user);
	 Mentor viewMentor (int mentorId);
	 List<Mentor> searchMentor(String technology);
	 Mentor selectMentor(int mentorId);
     boolean sendProposal(int userId,int mentorId);
     boolean assignRating(int rating);
     List<TrainingDetails> viewTrainings(String status);

}
