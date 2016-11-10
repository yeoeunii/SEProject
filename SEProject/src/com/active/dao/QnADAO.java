package com.active.dao;

import java.util.ArrayList;
import java.util.Date;

import com.active.model.QnA;
import com.active.model.Response;

public class QnADAO {
	
	private static QnADAO qnaDao;
	
	public boolean insertQuestion(String tempQuestion, String tempWriter, Date tempTime) {
		return true;
	}
	
	public boolean insertResponse(int tempQuestionNo, Response tempResponse) {
		return true;
	}
	
	public boolean deleteQuestion(int tempQuestionNo) {
		return true;
	}
	
	public boolean deleteResponse(int tempQuestionNo, int tempResponseNo) {
		return true;
	}
	
	public boolean updateQuestion(int tempQuestion) {
		return true;
	}
	
	public boolean updateResponse(int tempQuestionNo, int tempResponseNo) {
		return true;
	}
	
	public ArrayList<QnA> searchQuestionCourse(String tempCourseNumber) {
		return null;
	}
	
	public ArrayList<QnA> searchQuestionWriter(String tempWriter) {
		return null;
	}
}
