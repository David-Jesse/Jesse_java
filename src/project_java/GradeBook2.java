package project_java;
// GradeBook class that solves class-average problem using
// counter-controlled repetition
import java.util.Scanner;

public class GradeBook2 {
	private String courseName; // name of course this GradeBook represents
	
	// constructor initializes courseName
	public GradeBook2( String name)
	{
		courseName = name; // initializes courseName
	}  // end constructor
	
	// method to set the course name
	public void setCourseName(String name)
	{
		courseName = name; // store course name
	} // end method setCourseName
	
	// method to get course name
	public String getCourseName()
	{
		return courseName;
	} // end method getCourseName
	
	// display a welcome message to the GradeBook user
	public void displayMessage()
	{
		// getCourseName gets the name of the course
		System.out.printf("Welcome to the grade  book for\n%s!\n\n",
				getCourseName() );
	} // end method display course name
	
	// determine class average based on 10 grades entered by user
	public void determineClassAverage()
	{
		// create Scanner to obtain input from command window
		 Scanner input = new Scanner (System.in);
		 
		 int total;
		 int gradeCounter;
		 int grade;
		 int average;
		 
		 // initialization phase
		 total = 0; // initialize total
		 gradeCounter = 1; // initialize loop counter
		 
		 // processing phase uses counter controlled repetition
		 while (gradeCounter <= 10)
		 {
			 System.out.print("Enter grade: ");
			 grade = input.nextInt();
			 total = total + grade; // add grade to total
			 gradeCounter = gradeCounter + 1; // increment counter by 1
		 } // end while
		 
		 // termination phase
		 average = total / 10; // integer division yields integer result
		 
		 // display total and average of grades
		 System.out.printf("\nTotal of all 10 grades is %d\n", total);
		 System.out.printf(" Class average is %d\n", average);
	} // end method determineClassAverage
} // end class GradeBook2 
