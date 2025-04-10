package com.edu;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question1 {
	@Id
@Column(name="question_id")
private int questionId;
	
@Column(name="question", length = 100, nullable = false, unique = true)
private String question;

@OneToMany(mappedBy = "question1" , fetch = FetchType.EAGER)
private List<Answer1> answer1;
public Question1() {
	super();
	// TODO Auto-generated constructor stub
}

public Question1(int questionId, String question) {
	super();
	this.questionId = questionId;
	this.question = question;
}

public int getQuestionId() {
	return questionId;
}

public void setQuestionId(int questionId) {
	this.questionId = questionId;
}

public String getQuestion() {
	return question;
}

public void setQuestion(String question) {
	this.question = question;
}





public List<Answer1> getAnswer1() {
	return answer1;
}

public void setAnswer1(List<Answer1> answer1) {
	this.answer1 = answer1;
}

@Override
public String toString() {
	return "Question [questionId=" + questionId + ", question=" + question + "]";
}


	
}