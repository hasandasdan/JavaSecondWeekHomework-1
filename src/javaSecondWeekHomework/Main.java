package javaSecondWeekHomework;



public class Main {

	public static void main(String[] args) {
		
		
		Category category1 = new Category();
		category1.id=1;
		category1.categoryName="Programlama Yetiþtirme Kampý";
		
		Category category2 = new Category();
		category2.id=2;
		category2.categoryName="Programlama Giriþ";
		
		 Course course1 = new Course(1,1,"Yazilim Gelistirici Yerlestirme Kampý (C# + ANGULAR) ", "Engin Demirog","Ücretsiz");
		 Course course2=new Course();
		 course2.id=2;
		 course2.categoryId=1;
		 course2.courseName="Yazilim Gelistirici Yerlestirme Kampý(JAVA + REACT)";
		 course2.instructorName="Engin Demirog";
		 course2.coursePrice="Ücretsiz";
		 
		 Course course3=new Course(3,2,"Proðlamlamaya Giriþ için Temel Kurs","Engin Demirog","Ücretsiz");
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
