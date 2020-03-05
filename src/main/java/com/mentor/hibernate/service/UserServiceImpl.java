package com.mentor.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mentor.hibernate.dao.UserServiceDao;
import com.mentor.hibernate.model.Mentor;
import com.mentor.hibernate.model.TrainingDetails;
import com.mentor.hibernate.model.User;

@Component
@Service ("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserServiceDao userServiceDao;
	@Transactional

	public boolean createProfile(User user) {
		return false;
		// TODO Auto-generated method stub

	}

	@Transactional
	public Mentor viewMentor(int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<Mentor> searchMentor(String technology) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Mentor selectMentor(int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean sendProposal(int userId, int mentorId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean assignRating(int rating) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public List<TrainingDetails> viewTrainings(String status) {
		// TODO Auto-generated method stub
		return null;
	}

}
