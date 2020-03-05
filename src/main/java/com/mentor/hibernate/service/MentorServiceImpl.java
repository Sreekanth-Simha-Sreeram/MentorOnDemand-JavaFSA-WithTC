package com.mentor.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mentor.hibernate.dao.MentorServiceDao;
import com.mentor.hibernate.model.Mentor;
import com.mentor.hibernate.model.User;

@Component
@Service ("mentorService")
public class MentorServiceImpl implements MentorService {
	
	@Autowired
	MentorServiceDao mentorServiceDao;
	@Transactional
	public boolean createProfile(Mentor mentor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public Mentor viewMyProfile(int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean updateProfile(int mentorId) {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public Mentor deactivateProfile(int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void viewProposal() {
		// TODO Auto-generated method stub

	}

	@Transactional
	public boolean acceptProposal(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
