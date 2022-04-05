import java.util.Scanner;

/*

Program: GuessingGame.java      Last Date of this Revision: 

Purpose: The Guessing Game application created in Chapter 4 Exercise 9 would be more fun if users could make as many guesses as necessary to guess the secret number. 

Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 

*/

public class GuessingGame 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Welcome to RandomNum! Please enter the the first number (Min Range): ");//ask for first random number in minimum range

		int min = input.nextInt();//record first number in minimum range

		System.out.print("\nPlease enter the the second number (Max Range): ");//ask for second number in maximum range

		int max = input.nextInt();//record second number in maximum range

		int range = (max - min) + 1;//to determine the range of numbers that the computer can pick from


		System.out.print("\nGuess the secret number between " + min + " and " + max + ": "); //The user will try to display the number that is in their mind 

		int guess = input.nextInt();

		String userInput = "c";

		while (!(userInput.equalsIgnoreCase("q")))
		{  

		int randomNum = (int) (Math.random() * range) + min; //final formula for computer to pick random number.
		 
		    if (guess == randomNum)
		    {
		    System.out.println("\nYou won!");//When you have guessed the random number correctly, this message will be displayed
		    }
		   

		    else if (guess != randomNum)
		    {
		    System.out.println("Try Again!");//displays this when the guess is incorrect
		    }

		    guess = input.nextInt();
	   }


     }


}

/* Screen Dump
 
Welcome to RandomNum! Please enter the the first number (Min Range): 3

Please enter the the second number (Max Range): 9

Guess the secret number between 3 and 9: 6
Try Again!
2
Try Again!
8
Try Again!
1
Try Again!
9
Try Again!
5
Try Again!
6

You won!

*/


