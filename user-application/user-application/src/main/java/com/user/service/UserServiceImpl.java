package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repository;

	@Override
	public String addUser(User user) {
		User response = repository.save(user);
		if (response == null) {
			return "Data is not saved";
		}
		return "Data is saved";
	}

	@Override
	public List<User> getUsers() {
		List<User> response = repository.findAll();
		if (response == null || response.isEmpty()) {
			throw new RuntimeException("Data is empty");
		}
		return response;
	}

	@Override
	public User getUserData(Integer userId) {
		Optional<User> response = repository.findById(userId);
		if (!response.isPresent()) {
			throw new RuntimeException("Data is not found");
		}
		return response.get();
	}

}
