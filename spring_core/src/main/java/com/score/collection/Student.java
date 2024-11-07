package com.score.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	private String name;
	private List<String> phone;
	private Set<String> add;
	private Map<String,String> Course;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phone
	 */
	public List<String> getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	/**
	 * @return the add
	 */
	public Set<String> getAdd() {
		return add;
	}
	/**
	 * @param add the add to set
	 */
	public void setAdd(Set<String> add) {
		this.add = add;
	}
	/**
	 * @return the course
	 */
	public Map<String, String> getCourse() {
		return Course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(Map<String, String> course) {
		Course = course;
	}
	public Student(String name, List<String> phone, Set<String> add, Map<String, String> course) {
		super();
		this.name = name;
		this.phone = phone;
		this.add = add;
		Course = course;
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
		return "Student [name=" + name + ", phone=" + phone + ", add=" + add + ", Course=" + Course + "]";
	}
	
	
	

}
