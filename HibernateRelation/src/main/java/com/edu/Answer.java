package com.edu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	@Column(name="answer_id")
	private int answerid;
	
	@Column(name="answer",length = 100, nullable = false, unique=true)
	private String answer;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int answerid, String answer) {
		super();
		this.answerid = answerid;
		this.answer = answer;
	}
	public int getAnswerid() {
		return answerid;
	}
	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Answer [answerid=" + answerid + ", answer=" + answer + "]";
	}
	
	
	
}
