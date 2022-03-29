import java.util.Scanner;

/*

Program: Digits3.java        Last Date of this Revision: February 24, 2022

Purpose: Create a Digits application that prompts the user for a three-digit and then displays the ones-place, tens place, and hundred place digits. 

Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 
_
*/


public class Digits3 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
	System.out.print("Enter a three digit number:    ");
		
		int number = input.nextInt();           //the three-digit number 
		
		int firstDigit = number/100;            //value of hundred digit
		
		int midDigit = (number%100)/10;         //value of tens digit
		
		int lastDigit = number%10;              //value of ones digit 
		
		
		
		System.out.println("The value of the hundred digit is: " + firstDigit);
		
		System.out.println("The value of the tens digit is: " + midDigit);
		
		System.out.println("The value of the ones digit is: " + lastDigit);
		
			
	}
}

/* Screen Dump

Enter a three digit number:    234
The value of the hundred digit is: 2
The value of the tens digit is: 3
The value of the ones digit is: 4

*/



