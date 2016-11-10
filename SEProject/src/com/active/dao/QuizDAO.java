package com.active.dao;

import java.util.ArrayList;

import com.active.model.Quiz;

public class QuizDAO {
	
	private static QuizDAO quizDao;
	
	public boolean insertQuiz(String tempLectureId, String tempQuestion, int tempAnswer, ArrayList<String> tempChoice) {
		return true;
	}
	
	public boolean deleteQuiz(String tempLectureId, int TempQuizNo) {
		return true;
	}
	
	public boolean updateQuiz(String tempLectureId, int tempQuizNo) {
		return true;
	}
	
	public ArrayList<Quiz> searchQuizList(String tempLectureId) {
		return null;
	}
	
	public Quiz searchQuiz(String tempLectureId, int tempQuizNo) {
		return null;
	}
}