package com.score.aw;

public class Answer {
	
	private String ans1;
	private String ans2;
	private String ans3;
	/**
	 * @return the ans1
	 */
	public String getAns1() {
		return ans1;
	}
	/**
	 * @param ans1 the ans1 to set
	 */
	public void setAns1(String ans1) {
		this.ans1 = ans1;
	}
	/**
	 * @return the ans2
	 */
	public String getAns2() {
		return ans2;
	}
	/**
	 * @param ans2 the ans2 to set
	 */
	public void setAns2(String ans2) {
		this.ans2 = ans2;
	}
	/**
	 * @return the ans3
	 */
	public String getAns3() {
		return ans3;
	}
	/**
	 * @param ans3 the ans3 to set
	 */
	public void setAns3(String ans3) {
		this.ans3 = ans3;
	}
	public Answer(String ans1, String ans2, String ans3) {
		super();
		this.ans1 = ans1;
		this.ans2 = ans2;
		this.ans3 = ans3;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Answer [ans1=" + ans1 + ", ans2=" + ans2 + ", ans3=" + ans3 + "]";
	}
	
	

}
