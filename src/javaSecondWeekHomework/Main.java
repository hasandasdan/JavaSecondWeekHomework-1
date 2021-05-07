package javaSecondWeekHomework;



public class Main {

	public static void main(String[] args) {
		
		
		Category category1 = new Category();
		category1.id=1;
		category1.categoryName="Programlama Yeti�tirme Kamp�";
		
		Category category2 = new Category();
		category2.id=2;
		category2.categoryName="Programlama Giri�";
		
		 Course course1 = new Course(1,1,"Yazilim Gelistirici Yerlestirme Kamp� (C# + ANGULAR) ", "Engin Demirog","�cretsiz");
		 Course course2=new Course();
		 course2.id=2;
		 course2.categoryId=1;
		 course2.courseName="Yazilim Gelistirici Yerlestirme Kamp�(JAVA + REACT)";
		 course2.instructorName="Engin Demirog";
		 course2.coursePrice="�cretsiz";
		 
		 Course course3=new Course(3,2,"Pro�lamlamaya Giri� i�in Temel Kurs","Engin Demirog","�cretsiz");
		 Course[] courses= {course1,course2,course3};
		 for(Course course:courses) {
			 			
			if(course.categoryId==1) {
				
			System.out.println(category1.categoryName);
			 System.out.print(course.courseName+"-");
			 System.out.print(course.instructorName+"-");
			 System.out.print(course.coursePrice+"-");
			 System.out.println();
			 
			 		 }
			else if(course.categoryId==2) {
				System.out.println(category2.categoryName);
				 System.out.print(course.courseName+"-");
				 System.out.print(course.instructorName+"-");
				 System.out.print(course.coursePrice+"-");
				 System.out.println();
				
				
			}
		 }
		 System.out.println();
		 CourseManager courseManager= new CourseManager();
		 courseManager.addToCourse(course1);
		 courseManager.addToCourse(course2);
		 courseManager.removeToCourse(course3);


	}

}
