package com.active.dao;

import java.util.ArrayList;

import com.active.model.Review;

public class ReviewDAO {
	
	private static ReviewDAO reviewDao;
	
	public boolean insertReview(String tempWriter, String tempContent) {
		return true;	
	}
	
	public boolean deleteReview(int tempReviewNo) {
		return true;
	}
	
	public boolean updateReview(int tempReviewNo) {
		return true;
	}
	
	public ArrayList<Review> searchReview(String tempCourseNumber) {
		return null;
	}
}