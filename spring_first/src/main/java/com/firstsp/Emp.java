package com.firstsp;

public class Emp {
	private int eid;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int eid) {
		super();
		this.eid = eid;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Emp [eid=" + eid + "]";
	}
	

}
