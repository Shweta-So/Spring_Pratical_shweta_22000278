package com.spring.jdbc.entites;

public class Employee {
	
	private int eid;
	private String ename;
	private String dname;
	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}
	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}
	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
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
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, String dname) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dname = dname;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dname=" + dname + "]";
	}
	
	

}
