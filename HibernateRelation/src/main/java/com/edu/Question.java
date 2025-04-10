package com.edu;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {

	@Id
	private int questionid;
	private String question;
	
	@OneToOne
	@JoinColumn(name="answer_id")
	private Answer answer;

	
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int questionid, String question) {
		super();
		this.questionid = questionid;
		this.question = question;
	}
	@Override
	public String toString() {
		return "Question [questionid=" + questionid + ", question=" + question + "]";
	}
	

}
