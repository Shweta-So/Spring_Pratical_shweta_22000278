package com.score.standalone.collection;

import java.util.List;

public class Student {
	
	private List<String> name;

	/**
	 * @return the name
	 */
	public List<String> getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(List<String> name) {
		this.name = name;
	}

	public Student(List<String> name) {
		super();
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
	

}
