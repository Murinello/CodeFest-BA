package com.ba.codefestba.service;

import com.ba.codefestba.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}