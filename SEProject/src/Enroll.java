
/* It manages user who is registered in course
 * 
 */
public class Enroll 
{
	/* professor string object represents professor name of course
	 * studentList User type List object represents list of students registered in course 
	 * courseNumber object represents the primary code of course
	 */
	
	private String professor;
	private ArrayList<User> studentList;
	private String courseNumber;
	
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public ArrayList<User> getStudentList() {
		return studentList;
	}
	public void setStudentList(ArrayList<User> studentList) {
		this.studentList = studentList;
	}
	public String getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	
	
}
