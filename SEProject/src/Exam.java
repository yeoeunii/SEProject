
public class Exam 
{
	private int examNo;
	private int score;
	private ArrayList<Exam> examList;
	private int examChapter;
	private String lectureId;
	
	public int getExamNo() {
		return examNo;
	}
	public void setExamNo(int examNo) {
		this.examNo = examNo;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public ArrayList<Exam> getExamList() {
		return examList;
	}
	public void setExamList(ArrayList<Exam> examList) {
		this.examList = examList;
	}
	public int getExamChapter() {
		return examChapter;
	}
	public void setExamChapter(int examChapter) {
		this.examChapter = examChapter;
	}
	public String getLectureId() {
		return lectureId;
	}
	public void setLectureId(String lectureId) {
		this.lectureId = lectureId;
	}
	
	
}
