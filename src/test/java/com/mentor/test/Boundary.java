package com.mentor.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

import com.mentor.hibernate.model.Skills;
import com.mentor.hibernate.model.TrainingDetails;
import com.mentor.hibernate.model.User;

public class Boundary {

	
	//password word length must be 10
    @Test
    public void testpasswordLength()
    {
        User user=new User();
        user.setUserId(9);
        user.setFirstName("Raj");
        user.setLastName("Gopal");
        user.setContactNumber(1234567890);
        user.setExperience(5);
        user.setRole("mentor");
        user.setPassword("String@1234");
      

        int passwordLength=10;
assertNotEquals(passwordLength,user.getPassword().length());


    }

    //email should not be null
    @Test
    public void testContactNumber()
    {
    	User user=new User();
        user.setUserId(9);
        user.setFirstName("Raj");
        user.setLastName("Gopal");
        user.setContactNumber(1234567890);
        user.setExperience(5);
        user.setRole("User");
        user.setPassword("String@1234");
        int numLength=10;
        int contactNumberLength=Integer.toString(user.getContactNumber()).length();
        Assert.assertEquals(numLength,contactNumberLength);
        
		

    }
    
   
    // number of shares should not be null
    
    //company turnover should not be null
    @Test
    public void testTrainingfees()
    {
        TrainingDetails training=new TrainingDetails();
        training.setFees(5000);
        training.setTrainingDetailsId(6);
        training.setAmountReceived(500);
        
        int Fees=10000;
        Assert.assertEquals(Fees, training.getFees());
    }
}
