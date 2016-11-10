package com.active.dao;

import java.util.ArrayList;
import com.active.model.User;

public class UserDAO {
	
	private static UserDAO userDAO;
	
	public boolean insertUser(User user) {
		return true;
	}
	
	public boolean deleteUser(String tempId) {
		return true;
	}
	
	public boolean updateUser() {
		return true;
	}
	
	public User searchUser(String tempId, String tempPwd) {
		return null;
	}
	
	public ArrayList<User> searchUser(String tempCourseNumber) {
		return null;
	}
	
	public ArrayList<User> searchAllUsers() {
		return null;
	}
	
	public String findPassword(String tempUserId) {
		return null;
	}
}
