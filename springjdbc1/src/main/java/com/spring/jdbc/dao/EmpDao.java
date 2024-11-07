package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entites.Employee;

public interface EmpDao {
	
	public int insert(Employee employee);
	
	public int update(Employee employee);
	
	public int delete(Employee employee);
	
	public Employee getEmployee(int eid);
	public List<Employee> getAllCust();

}
