package project_java;
import java.util.Scanner; // program uses Scanner

public class Arithmetic {

	public static void main(String[] arg)
	{
		// Create scanner to obtain input from command line.
		Scanner input = new Scanner(System.in);
		
		int number1;  // first input from user
		int number2; // second input from user
		int sum;
		int product;
		int diff;
		int division;
		
		System.out.print("Give me a number: ");	// prompt for input
		number1 = input.nextInt();		
		
		System.out.print("Give me another number: ");	// prompt for second input
		number2 = input.nextInt();
		
		sum = number1 + number2;
		product = number1 * number2;
		diff = number1 - number2;
		division = number1 / number2;
		
		System.out.printf("sum = %d\n", sum);
		System.out.printf("product = %d\n",  product );
		System.out.printf("division = %d\n", division);
		System.out.printf("diff = %d\n", diff,);
	}
}
