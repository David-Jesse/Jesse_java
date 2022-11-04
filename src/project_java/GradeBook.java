package project_java;
// GradeBook class with a constructor to initialize the course name.

public class GradeBook {
	private String courseName, instructorName; // course name for this GradeBook
	 // instructor's name for the course
	
	public GradeBook (String name, String instructor)  // constructor name is class name
	{
		courseName = name;
		instructorName = instructor;
	}
	
	// method to set instructor's name
	public void setInstructorName(String instructor)
	{
		instructorName = instructor;
	} // end method setInstructorName
	
	public String getInstructorName()
	{
		return instructorName;
	} // end method getInstructorName
	
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
		System.out.printf("This course is presented by: %s\n", 
				getInstructorName());
	} // end method displayMessage
} // end class GradeBook
