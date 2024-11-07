package com.springcore.lifecycle;

public class Department {
	
	private String dname;

	/**
	 * @return the dname
	 */
	public String getDname() {
		return dname;
	}

	/**
	 * @param dname the dname to set
	 */
	public void setDname(String dname) {
		this.dname = dname;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Department [dname=" + dname + "]";
	}
	
	public void init() {
		System.out.println("initalized deaprtment value");
	}
	
	public void destroy() {
		System.out.println("destory department value");
	}
	

}
