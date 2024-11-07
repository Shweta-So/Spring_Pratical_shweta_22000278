package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entites.Employee;

public class EmpdaoImpl implements EmpDao
{

	JdbcTemplate jdbcTemplate;
	
	/**
	 * @return the jdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}



	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	public int insert(Employee employee) {
		
		String q = "insert into emp_data(eid,ename,dname)values(?,?,?)";
		int r = this.jdbcTemplate.update(q,employee.getEid(),employee.getEname(),employee.getDname());
		return r;
	}
	
	public int update(Employee employee) {
		String u ="update employee set ename=? where eid=?";
		int r = this.jdbcTemplate.update(u,employee.getEname(),employee.getEid());
		return r;
	}
	
	public int delete(Employee employee) {
		String u = "delete from employee where cid=?";
		int r = this.jdbcTemplate.update(u,employee.getEid());
		return r;
	}
	
}
