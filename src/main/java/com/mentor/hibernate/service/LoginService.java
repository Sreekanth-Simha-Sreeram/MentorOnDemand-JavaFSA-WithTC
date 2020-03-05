package com.mentor.hibernate.service;

import com.mentor.hibernate.model.User;

public interface LoginService {
	
	 public boolean signUp(User user);
     public boolean signIn(String username,String password);

}
