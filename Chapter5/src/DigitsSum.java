
/*

Program: DigitsSum.java      Last Date of this Revision: March 30, 2022

Purpose: Create a DigitsSum application that prompts the user for the non-negative integer and then displays the sum of the digits. 

Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 

*/

import java.util.Scanner;


public class DigitsSum
{

	public static void main(String[] args) 
	{
		int number, digit, sum = 0; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter a positive integer: ");  //ask for a positive integer
		
		number = sc.nextInt();
		
		
		while(number > 0)  
		{  
		    
		digit = number % 10;  //finds the last digit of the given number  
		
		sum = sum + digit;  //adds last digit to the variable sum 
		  
		number = number / 10;  //removes the last digit from the number  
		}  
		 
		System.out.println("The sum of the cubes of the digits is: "+sum);  //prints the result  
		
	}
	
}

/* Screen Dump

Enter a positive integer: 892
The sum of the cubes of the digits is: 19

*/
