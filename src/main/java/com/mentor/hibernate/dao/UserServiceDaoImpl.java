package com.mentor.hibernate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mentor.hibernate.model.Mentor;
import com.mentor.hibernate.model.TrainingDetails;
import com.mentor.hibernate.model.User;

@Component
@Repository ("userServiceDao")
public class UserServiceDaoImpl implements UserServiceDao {
	@Autowired
	private SessionFactory sessionFactory;
	public boolean createProfile(User user) {
		return false;
		// TODO Auto-generated method stub

	}

	public Mentor viewMentor(int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Mentor> searchMentor(String technology) {
		// TODO Auto-generated method stub
		return null;
	}

	public Mentor selectMentor(int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean sendProposal(int userId, int mentorId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean assignRating(int rating) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<TrainingDetails> viewTrainings(String status) {
		// TODO Auto-generated method stub
		return null;
	}

}
