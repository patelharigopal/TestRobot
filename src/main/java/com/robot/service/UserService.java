package com.robot.service;

import com.robot.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
