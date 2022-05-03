import java.util.Scanner;

public class Adder {

	public static void main(String[] args) 
	{
		System.out.println("Choose one of the following operations: ");
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		Scanner input = new Scanner (System.in);
		System.out.println();
		System.out.println("Enter \"1\", \"2\", \"3\" or \"4\"");
		int operation = input.nextInt();
		
		
		operation = input.nextInt();
		
		if(operation == 1)
		{
			System.out.println("Addition");
		}
		
		else if(operation == 2);
		{
			System.out.println("Subtraction");
		}
		
		if(operation == 3)
		{
			System.out.println("Multiplication");
		}
		
		else if(operation == 4)
		{
			System.out.println("Division");
		}
		
	
				

	}

}
