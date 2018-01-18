package Model;

public class Course {
	private String courseCode;
	private String courseName;
	private int points;
	
	public Course(){
		
	}
	
	public Course(String courseCode, String courseName, int points){
		setCourseCode(courseCode);
		setCourseName(courseName);
		setPoints(points);
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
