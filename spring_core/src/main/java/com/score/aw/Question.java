package com.score.aw;

public class Question {

	private String question;
	private Answer answer;
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
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
	public Question(String question, Answer answer) {
		super();
		this.question = question;
		this.answer = answer;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Question [question=" + question + ", answer=" + answer + "]";
	}
	
	
	
	
	
	
}
