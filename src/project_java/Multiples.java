package project_java;
import java.util.Scanner;

public class Multiples {
	public static void main(String[] arg)
	{
		// Create scanner to obtain values from command line
		Scanner input = new Scanner(System.in);
	
		int x;
		int y;
	
		System.out.print("Enter an integer: ");
		x = input.nextInt();
		
		System.out.print("Enter an integer: ");
		y = input.nextInt();
		
		if (x % y == 0)
			System.out.printf("%d is a multiple of %d", x, y);
	}
}
