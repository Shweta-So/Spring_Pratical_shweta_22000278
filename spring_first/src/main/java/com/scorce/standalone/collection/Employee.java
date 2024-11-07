package com.scorce.standalone.collection;

import java.util.List;

public class Employee {

	private List<String> Ename;

	
	/**
	 * @return the ename
	 */
	public List<String> getEname() {
		return Ename;
	}

	/**
	 * @param ename the ename to set
	 */
	public void setEname(List<String> ename) {
		Ename = ename;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(List<String> ename) {
		super();
		Ename = ename;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [Ename=" + Ename + "]";
	}
	
	
	
}
