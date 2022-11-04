package project_java;
//Creating and manipulating a GradeBook object.

public class GradeBookText {
	// main method begins the execution of a program
	public static void main(String[] arg)
	{
		// create a GradeBook object
		GradeBook gradeBook = new GradeBook(
				"CSC101 introduction to Java", "Boluwatife Sofela");
		
		// call my GradeBook displayMessage method 
				gradeBook.displayMessage();
		
	}//end of main
} // end class GradeBookText
