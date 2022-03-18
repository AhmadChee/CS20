import java.util.Scanner;

/*

Program: RandomNum.java      Last Date of this Revision: March 16, 2022

Purpose: Create a RandomNum application that prompts the user for two numbers. The first number is a minimum value and the second is a maximum value. RandomNum then displays an integer between the min and max values entered by the user

Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 
_
*/

public class RandomNum 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Welcome to RandomNum! Please enter the the first number (Min Range): ");//ask for first random number in minimum range

		int min = input.nextInt();//record first number in minimum range

		System.out.print("\nPlease enter the the second number (Max Range): ");//ask for second number in maximum range

		int max = input.nextInt();//record second number in maximum range

		int range = (max - min) + 1;//to determine the range of numbers that the computer can pick from

		int randomNum = (int) (Math.random() * range) + min;//final formula for computer to pick random number.
		       
		       
		       System.out.println("\nRandomNum has picked the number: " + randomNum);//random number is printed between integer one and two. 


	}

}


/* Screen Dump

Welcome to RandomNum! Please enter the the first number (Min Range): 6

Please enter the the second number (Max Range): 12

RandomNum has picked the number: 10


*/
