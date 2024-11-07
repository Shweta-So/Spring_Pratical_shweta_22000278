package com.score.autowire;

public class Question {
	
	private String que1;
	private Answer answer;
	/**
	 * @return the que1
	 */
	public String getQue1() {
		return que1;
	}
	/**
	 * @param que1 the que1 to set
	 */
	public void setQue1(String que1) {
		this.que1 = que1;
	}
	/**
	 * @return the answer
	 */
	public Answer getAnswer() {
		return answer;
	}
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Question(String que1, Answer answer) {
		super();
		this.que1 = que1;
		this.answer = answer;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Question [que1=" + que1 + ", answer=" + answer + "]";
	}
	
	
	
	

}
