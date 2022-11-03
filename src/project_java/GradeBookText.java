package project_java;
//Creating and manipulating a GradeBook object.

public class GradeBookText {
	// main method begins the execution of a program
	public static void main(String[] arg)
	{
		// create a GradeBook object
		GradeBook gradeBook1 = new GradeBook("CS101 Introduction to Java programming");
		GradeBook gradeBook2 = new GradeBook("CS102 Data Structures in Java")
		
		// display initial value of courseName.
		System.out.printf("gradeBook1 course name is: %s\n",
				gradeBook1.getCourseName());
		System.out.printf("gradeBook2 course name is: %s\n",
				gradeBook2.getCourseName());
	}//end of main
} // end class GradeBookText
