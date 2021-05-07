package javaSecondWeekHomework;

public class Course {

	public Course(int id,int categoryId,String courseName,String instructorName,String coursePrice) {
		
		this.id=id;
		this.categoryId=categoryId;
		this.courseName=courseName;
		this.instructorName=instructorName;
		this.coursePrice=coursePrice;

		
	}
	public Course() {
		
	}
	int id;
	int categoryId;
	String courseName;
	String instructorName;
	String coursePrice;

}
