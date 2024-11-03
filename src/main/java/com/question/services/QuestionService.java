package com.question.services;

import java.util.List;

import com.question.entities.Question;

public interface QuestionService {

	public Question create(Question question);
	
	public List<Question> get();
	
	public Question getOne(Long id);
	
	public List<Question> getQuestionsOfQuiz(Long quizId);
}
