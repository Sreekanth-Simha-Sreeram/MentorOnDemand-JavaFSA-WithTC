package com.mentor.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mentor.hibernate.model.Mentor;
import com.mentor.hibernate.model.TrainingDetails;
import com.mentor.hibernate.model.User;
import com.mentor.hibernate.service.LoginService;
import com.mentor.hibernate.service.MentorService;
import com.mentor.hibernate.service.UserService;


public class Functional {
	
	@Test
	public void testRegister()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("popups-application.xml");

		User user = new User();

		user.setUserId(1);
		user.setUserName("meghana");
		user.setPassword("meghana12");
		user.setFirstName("meghana12");	
		user.setLastName("meghana12");
		user.setContactNumber(1234567889);
		user.setRole("user");
		user.setLinkedinURL("meghana12@234");
		user.setExperience(1);
		user.setActive(true);
		user.setConfirmedSignUp(true);
		user.setResetPassword(true);
		
				
		LoginService loginservice=(LoginService) context.getBean("loginService");
		loginservice.signUp(user);
		boolean userfromdb =loginservice.signUp(user);
		assertSame(user,userfromdb);
	}
	
	@Test
	public void createMentorProfile() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("mentor-application.xml");
		boolean isCreated=false;
		
		Mentor mentor=new Mentor();
		
		mentor.setMentorId(12);
		mentor.setEmail("mentor@mentor.com");
		mentor.setExperience(3);
		mentor.setFacilities("FSA Notes");
		mentor.setFees(10000);
		mentor.setTechnology("java");
		mentor.setWorkHours(9);
		MentorService mentorservice = (MentorService) context.getBean("mentorService");
		boolean creatementor = mentorservice.createProfile(mentor);
		assertEquals("mentor",creatementor,"should be created");
		
				
	}
	
	
	@Test
	public void createUserProfile() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("mentor-application.xml");
		boolean isCreated=false;
		User user = new User();

		user.setUserId(1);
		user.setUserName("meghana");
		user.setPassword("meghana12");
		user.setFirstName("meghana12");	
		user.setLastName("meghana12");
		user.setContactNumber(1234567889);
		user.setRole("user");
		user.setLinkedinURL("meghana12@234");
		user.setExperience(1);
		user.setActive(true);
		user.setConfirmedSignUp(true);
		user.setResetPassword(true);
		
				
		UserService userservice = (UserService) context.getBean("userService");
		boolean createuser = userservice.createProfile(user);
		assertEquals("user",createuser,"should be created");
		
				
	}

	
	@Test
	public void testUpdateProfile()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("mentor-application.xml");
Mentor mentor=new Mentor();
		
		mentor.setMentorId(12);
		mentor.setEmail("mentor@mentor.com");
		mentor.setExperience(3);
		mentor.setFacilities("FSA Notes");
		mentor.setFees(10000);
		mentor.setTechnology("php");
		mentor.setWorkHours(9);
		
		MentorService mentorservice = (MentorService) context.getBean("mentorService");
		boolean isUpdated =mentorservice.updateProfile(mentor.getMentorId());
		assertEquals("12",isUpdated,"Should be updated");

	
	}
	
	@Test
	public void testAgreePayment()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("popups-application.xml");
		User user = new User();
		Mentor mentor=new Mentor();

		mentor.setMentorId(12);
		mentor.setEmail("mentor@mentor.com");
		mentor.setExperience(3);
		mentor.setFacilities("FSA Notes");
		mentor.setFees(10000);
		mentor.setTechnology("php");
		mentor.setWorkHours(9);
		
		MentorService mentorservice = (MentorService) context.getBean("mentorService");
		boolean isAccepted =mentorservice.acceptProposal(user);
		assertEquals("user",isAccepted);
	
}
	
	@Test
	public void testDeactivateProfile() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("pixogram-application.xml");
		Mentor mentor=new Mentor();

		mentor.setMentorId(12);
		mentor.setEmail("mentor@mentor.com");
		mentor.setExperience(3);
		mentor.setFacilities("FSA Notes");
		mentor.setFees(10000);
		mentor.setTechnology("php");
		mentor.setWorkHours(9);
		MentorService mentorservice = (MentorService) context.getBean("mentorService");
		Mentor isdeactivated = mentorservice.deactivateProfile(mentor.getMentorId());
		assertEquals("12",isdeactivated,"should deactivated from db");
	}
	
	public void testViewMyProfile() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");
		Mentor mentor=new Mentor();

		mentor.setMentorId(12);
		mentor.setEmail("mentor@mentor.com");
		mentor.setExperience(3);
		mentor.setFacilities("FSA Notes");
		mentor.setFees(10000);
		mentor.setTechnology("php");
		mentor.setWorkHours(9);
		MentorService mentorservice = (MentorService) context.getBean("mentorService");
		Mentor mentorfromdb =mentorservice.viewMyProfile(mentor.getMentorId());
		assertEquals("12",mentorfromdb);
	}
	
	public void testViewMentor() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");
		User user = new User();
		Mentor mentor=new Mentor();

		user.setUserId(1);
		user.setUserName("meghana");
		user.setPassword("meghana12");
		user.setFirstName("meghana12");	
		user.setLastName("meghana12");
		user.setContactNumber(1234567889);
		user.setRole("user");
		user.setLinkedinURL("meghana12@234");
		user.setExperience(1);
		user.setActive(true);
		user.setConfirmedSignUp(true);
		user.setResetPassword(true);
		
		UserService userservice = (UserService) context.getBean("userService");
		Mentor mentorfromdb =userservice.viewMentor(mentor.getMentorId());
		assertEquals("12",mentorfromdb);
	}
@Test
	
	public void testSearchAllUser() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("popups-application.xml");
		User user= new User();
		Mentor mentor=new Mentor();
		
	user.setUserId(1);
	user.setUserName("meghana");
	user.setPassword("meghana12");
	user.setFirstName("meghana12");	
	user.setLastName("meghana12");
	user.setContactNumber(1234567889);
	user.setRole("user");
	user.setLinkedinURL("meghana12@234");
	user.setExperience(1);
	user.setActive(true);
	user.setConfirmedSignUp(true);
	user.setResetPassword(true);
	
	
	UserService userservice = (UserService) context.getBean("userService");
		List<Mentor> mentorfromdb = userservice.searchMentor(mentor.getTechnology());
		Assert.assertNotNull(mentorfromdb);
	}

public void testViewTrainingDetails() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("mentor-application.xml");
	TrainingDetails trainingdetails=new TrainingDetails();
	User user= new User();

	user.setUserId(1);
	user.setUserName("meghana");
	user.setPassword("meghana12");
	user.setFirstName("meghana12");	
	user.setLastName("meghana12");
	user.setContactNumber(1234567889);
	user.setRole("user");
	user.setLinkedinURL("meghana12@234");
	user.setExperience(1);
	user.setActive(true);
	user.setConfirmedSignUp(true);
	user.setResetPassword(true);
	
	UserService userservice = (UserService) context.getBean("userService");
	List<TrainingDetails> trainingdetailsfromdb =userservice.viewTrainings(trainingdetails.getStatus());
	assertEquals("12",trainingdetails);
}
}
