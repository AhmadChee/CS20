import java.util.Scanner;

/*

Program: Digits2.java        Last Date of this Revision: February 23, 2022

Purpose: Create a Digits application that prompts the user for a two-digit number and then displays the ones-place and tens place digits. 

Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 _

*/


public class Digits2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a two digit number:    ");
		
		int number = input.nextInt();           //the two-digit number 
		
		int firstDigit = number/10;             //value of tens digit
		
		int lastDigit = number%10;              //value of ones digit
		
		
		
		System.out.println("The value of the tens digit is: " + firstDigit);
		
		System.out.println("The value of the ones digit is: " + lastDigit);
		
		
	}

}


/* Screen Dump

Enter a two digit number:    43
The value of the tens digit is: 4
The value of the ones digit is: 3


*/
