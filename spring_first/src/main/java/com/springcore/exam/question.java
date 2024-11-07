package com.springcore.exam;

import java.util.List;

public class question {
	
	private String q1;
	private List<String> answer;
	/**
	 * @return the q1
	 */
	public String getQ1() {
		return q1;
	}
	/**
	 * @param q1 the q1 to set
	 */
	public void setQ1(String q1) {
		this.q1 = q1;
	}
	/**
	 * @return the answer
	 */
	public List<String> getAnswer() {
		return answer;
	}
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
	public question(String q1, List<String> answer) {
		super();
		this.q1 = q1;
		this.answer = answer;
	}
	public question() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "question [q1=" + q1 + ", answer=" + answer + "]";
	}
	
	
	
	

}
