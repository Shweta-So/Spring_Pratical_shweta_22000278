package com.score.ci;

public class Marks {
	
	String sub;
	int marks;
	
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Marks(String sub, int marks) {
		super();
		this.sub = sub;
		this.marks = marks;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.sub + "," + this.marks;
	}
}
