package project_java;
// Creating and manipulating an Employee object
public class EmployeeTest {
	// main method begins execution of Java application
	public static void main(String[] args) {
		// create an Employee object and assign it to employee1
		
		Employee employee1 = new Employee("Mike", "John", 60000.00);
		Employee employee2 = new Employee ("Dvaid", "Jesse", 70000.00);
		
		System.out.printf("First name: %s\n",
				employee1.getFirstName());
		
		System.out.printf("Last name: %s\n",
				employee1.getLastName());
		
		System.out.printf("Yearly salary: %.2f\n", 
				employee1.getYearlySalary());
		
		System.out.printf("First name: %s\n", 
				employee2.getFirstName());
		
		System.out.printf("Last name: %s\n", 
				employee2.getLastName());
		
		System.out.printf("yearly salary: %.2f\n",
				employee2.getYearlySalary());
		
		// giving each employee a 10% raise and display current income after raise
		System.out.printf("Yearly Salary after a 10% bump: %.2f\n", 
				 employee1.getYearlySalary());
		
		System.out.printf("Yearly Salary after a 10% bump: %.2f\n", 
				 employee2.getYearlySalary());       
	}

}
