package com.score.ci;

public class Student {
	
	private String sid;
	private String sname;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
}
