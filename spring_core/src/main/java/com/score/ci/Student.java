package com.score.ci;

public class Student {
	
	private String sname;
	private int sid;
	private Marks add;
	
	public Student(String sname, int sid, Marks add) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.add = add;
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
		return "Student name =" + this.sname + ",Student id =" + this.sid + "Subject is =" +this.add.sub + "Subject marks =" + this.add.marks;
	}
	
	
}
