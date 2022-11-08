package project_java;
// Employee class with constructors to validate and 
// initialize instance variables
public class Employee {
	private String firstName, lastName;
	private double yearlySalary;
	
	// instance variable that declares constructors
	
	public Employee (String name, String last, double salary)
	{
		firstName = name;
		lastName = last;
		yearlySalary = salary;
	}
	
	// method to set first name
	public void setFirstName(String name)
	{
		firstName = name;
	} // end method set name
	
	// method to getfirstName
	public String getFirstName()
	{
		return firstName;
	} // end of method get first name
	
	// method to set last name
	public void setLastName(String last)
	{
		lastName = last;
	} // end method setlastName
	
	// method to get lastName
	public String getLastName()
	{
		return lastName;
	} // end of method getLastName
	
	// method to set monthlySalary
	public void setyearlySalary(double salary)
	{
		yearlySalary = salary;
	} // end of method setMonthlySalary
	
	// method to get monthlySalary
	public double getYearlySalary()
	{
		return yearlySalary;
	} // end of set monthlySalary
}
