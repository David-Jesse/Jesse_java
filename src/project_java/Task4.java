package project_java;
import java.util.Scanner;
public class Task4 {
	public static void main(String[] arg)
	{
		// Create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("Enter an integer: "); //prompt for input
		x = input.nextInt();
		
		System.out.print("Give me another integer: ");
		y = input.nextInt();
		
		if (x > y)
			System.out.printf("%d is larger", x, y);
		if (y > x)
			System.out.printf("%d is larger", x, y);
		if (x == y)
			System.out.printf("These numbers are equal", x, y);
	}
}
