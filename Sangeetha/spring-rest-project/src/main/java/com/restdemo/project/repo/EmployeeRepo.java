package com.restdemo.project.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restdemo.project.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

	void save(Long id);

	
	
	

}
