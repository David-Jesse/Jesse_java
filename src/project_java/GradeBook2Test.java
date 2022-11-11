package project_java;
// Create GradeBook object and invoke its determineClassAverage method.

public class GradeBook2Test {
	public static void main(String[] arg)
	{
		// create GradeBook object myGradeBook and
		// pass course name to constructor
		GradeBook2 myGradeBook2 = new GradeBook2(
				"CS101 Introduction to Java Programming");
		
		myGradeBook2.displayMessage(); // display welcome message 
		myGradeBook2.determineClassAverage(); /// find average of 10 grades
	} // end main
} // end class GradeBook2Test
