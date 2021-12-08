package com.restdemo.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restdemo.project.model.Employee;
import com.restdemo.project.service.EmployeeService;

@RestController
public class MainController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/checking")
	public String insertData(@RequestBody Employee empp)
	{
		return service.listOfDataInsert(empp);
	}
	
	@PostMapping("/checking_data")
	public List<Employee> insertData1(@RequestBody List<Employee> emppp)
	{
		return service.listOfDataInsert1(emppp);
	}
	
	@GetMapping("/retrieveData/{id}")
	public Optional<Employee> retrieveData(@PathVariable("id") Long id)
	{
		return service.listOfDataretrieve(id);
	}
	
	@PutMapping("/updateData")
	public String updateData(@RequestBody Employee emmp)
	{
		return service.updatadata1(emmp);
	}
	
	@DeleteMapping("/deletedata/{id}")
	public String deletedata(@PathVariable("id") Long id)
	{
		return service.deletedat(id);
	}
	
	
	
	

}
