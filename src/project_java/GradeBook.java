package project_java;
// GradeBook class with a constructor to initialize the course name.

public class GradeBook {
	private String courseName; // course name for this GradeBook
	
	// constructor initializes courseName with String argument
	public GradeBook (String name)  // constructor name is class name
	{
		courseName = name;
	}
	
	// method to set course name
	public void setCourseName(String name)
	{
		courseName = name; //store the course name
	} // end method setCourseName
	
	//method to retrieve the course name
	public String getCourseName()
	{
		return courseName;
	} // end method getCourseName
	
	public void displayMessage() {
		// calls getCourseName to get the name of 
		// the course this GradeBook represents
		System.out.printf("Welcome to the Grade Book for\n%s!\n",
				getCourseName());
	} // end method displayMessage
} // end class GradeBook
