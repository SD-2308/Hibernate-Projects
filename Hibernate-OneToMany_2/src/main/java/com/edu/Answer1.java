package com.edu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer1 {
	
	@Id
	@Column(name="answer_id")
	private int answerId;
	
	@Column(name="answer",length = 100, nullable = false, unique = true)
	private String answer;
	
	@ManyToOne
	@JoinColumn(name="question_id")
	Question1 question1;
	
	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer1(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	

	public Question1 getQuestion1() {
		return question1;
	}

	public void setQuestion1(Question1 question1) {
		this.question1 = question1;
	}

	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", answer=" + answer + "]";
	}
	
	

}