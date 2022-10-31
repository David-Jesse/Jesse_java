package project_java;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// create scanner to obtain input from command line.
		Scanner input = new Scanner(System.in);
		
		int x;
		
		System.out.print("Give me a number: ");
		x = input.nextInt();
		
		if (x % 2 == 0)
			System.out.printf("This is an even number", x);
		
		if (x % 2 != 0)
			System.out.printf("This is an odd number", x);

	}

}
