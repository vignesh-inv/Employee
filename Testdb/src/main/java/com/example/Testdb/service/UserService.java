package com.example.Testdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Testdb.model.UserModel;
import com.example.Testdb.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<UserModel> getallStudent() {
		return repo.findAll();
	}

	public void autosave(UserModel model) {
		repo.save(model);
		
	}

	public UserModel getById( long rno) {
		return repo.findById(rno).orElse(new UserModel());
	}

	public void update(UserModel model) {
		repo.save(model);
		
	}

	public void delete(long rno) {
		repo.deleteById(rno);
		
	}

	public void deleteAllData() {
		repo.deleteAll();
		
	}


}
