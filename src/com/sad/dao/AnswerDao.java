package com.sad.dao;

import java.util.ArrayList;

import com.sad.dto.Answer;

public interface AnswerDao {
	
	ArrayList<Answer> getAllAnswers();
	

	void addAnswer(Answer answer);
	
	void addAnswer(ArrayList<Answer> answers);

	void deleteAnswer(Answer answer);

	void updateAnswer(Answer answer);

}
