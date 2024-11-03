package com.question.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.entities.Question;
import com.question.services.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
	
	//creating the question
	@PostMapping
	public Question create(@RequestBody Question question) {
		System.out.println(question);
		return questionService.create(question);
	}
	
	//getting all the questions
	@GetMapping
	public List<Question> getAll(){
		return questionService.get();
	}
	
	@GetMapping("/{questionId}")
	public Question getQuestion(@PathVariable Long questionId) {
		return questionService.getOne(questionId);
	}
	
	//get all questions of specific quiz
	@GetMapping("/quiz/{quizId}")
	public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId){
		return questionService.getQuestionsOfQuiz(quizId);
	}
	
}
