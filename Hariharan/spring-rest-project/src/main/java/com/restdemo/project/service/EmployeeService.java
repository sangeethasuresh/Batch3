package com.restdemo.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restdemo.project.model.Employee;
import com.restdemo.project.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;
	
	public String listOfDataInsert(Employee emp)
	{
		repo.save(emp);
		return "Inserted Succesfully";
	}
	
	public List<Employee> listOfDataInsert1(List<Employee> empe)
	{
		return repo.saveAll(empe);
	}
	
	public Optional<Employee> listOfDataretrieve(Long id)
	{
	   return repo.findById(id);
	   
	}
	
	public String updatadata1(Employee emm)
	{
		repo.save(emm);
		return "Update Sucessfully";
	}
	
	public String deletedat(Long id)
	{
		repo.deleteById(id);
		return "Deleted Successfully";
	}
	
	
}
