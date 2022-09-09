package com.user.service;

import java.util.List;

import com.user.entity.User;

public interface UserService {

	String addUser(User user);

	List<User> getUsers();

	User getUserData(Integer userId);

}
