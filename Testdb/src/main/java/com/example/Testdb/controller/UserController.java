package com.example.Testdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.example.Testdb.model.UserModel;
import com.example.Testdb.service.UserService;

@RestController
@RequestMapping("/api/emp")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/all")
	public List<UserModel> getAllStudents(){
		return service.getallStudent();
	}
	
	@PostMapping("/save")
	public String saveData(@RequestBody UserModel model) {
		service.autosave(model);
		return "Data inserted";
	}
	@GetMapping("/view/{rno}")
	public UserModel getById(@PathVariable long rno) {
		return service.getById(rno);
	}
	
	@PutMapping("/update")
	public String updateEMp(@RequestBody UserModel model) {
		service.update(model);
		return "Updated";
	}
	
	@DeleteMapping("/delete/{rno}")
	public String delete(@PathVariable long rno) {
		service.delete(rno);
		return "data deleted";
	}
	
	@DeleteMapping("/delete/all")
	public String clear() {
		service.deleteAllData();
		return "all data deleted";
	}
}
