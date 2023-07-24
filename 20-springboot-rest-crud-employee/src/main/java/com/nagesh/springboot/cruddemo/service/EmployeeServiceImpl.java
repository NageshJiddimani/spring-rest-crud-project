package com.nagesh.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagesh.springboot.cruddemo.dao.EmployeeDAO;
import com.nagesh.springboot.cruddemo.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
	
		employeeDAO = theEmployeeDAO;
	}
	
	public List<Employee> findAll() {
		
		return employeeDAO.findAll();
	}

	@Override
	public Employee findById(int theId) {
	
		
		return employeeDAO.findById(theId);
	}

	@Override
	@Transactional
	public Employee save(Employee theEmployee) {
		
		return employeeDAO.save(theEmployee);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		
		employeeDAO.deleteById(theId);
		
	}

}
