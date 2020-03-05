package com.mentor.hibernate.dao;

import com.mentor.hibernate.model.User;

public interface LoginServiceDao {

	 public boolean signUp(User user);
     public boolean signIn(String username,String password);

  
}
