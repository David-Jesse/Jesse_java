package project_java;
import java.util.Scanner;
public class Arithmetic1 {

	public static void main(String[] args) {
		{
			// create scanner to obtain input for command line
			Scanner input = new Scanner(System.in);
			
			int x, y, z;
			int sum;
			int average;
			int product;
			
			System.out.print("Give me an integer: ");
			x = input.nextInt();
			
			System.out.print("Give me another integer: ");
			y = input.nextInt();
			
			System.out.print("Last integer, i promise: ");
			z = input.nextInt();
			
			sum = x + y + z;
			average = (x + y + z) / 3;
			product = x * y * z;
			
			System.out.printf("sum = %d\n", sum);
			System.out.printf("average = %d\n", average);
			System.out.printf("product = %d\n", product);
		}

	}

}
