/*

Program: AddCoins.java        Last Date of this Revision: April 12, 2022

Purpose: Create a AddCoins application that prompts the user for the number of pennies, nickels, dimes and quarters and then displays the total amount

Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 
_
*/

import java.text.DecimalFormat;
import java.util.Scanner;


public class AddCoins 
{

	public static void main(String[] args) 
	{
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter your total coins:");//user prompts the total number of coins (quarters, dimes, nickels, pennies)

      System.out.print("\nQuarters: ");//prompt number of quarters
	  int Q1 = input.nextInt();

	  System.out.print("Dimes: ");//prompt number of dimes 
	  int D1 = input.nextInt();

	  System.out.print("Nickels: ");//prompt number of nickels 
	  int N1 = input.nextInt();

	  System.out.print("Pennies: ");//prompt number of nickels 
	  int P1 = input.nextInt();

		     
	 DecimalFormat fmt = new DecimalFormat("$#,###.##");
	System.out.println("\nTotal: "+fmt.format(calctotal(Q1, D1, N1,P1)));//displays the total amount of money 

    }
		public static double calctotal(int Q1, int D1, int N1, int P1) 
		{
		   double total;
		   total=((0.25 * Q1) + (0.1 * D1) + (0.05 * N1) + (0.01 * P1));//formula for calculating total for the total amount of money
		   return (total);

		}

		

}

/* Screen Dump
 
Enter your total coins:

Quarters: 3
Dimes: 2
Nickels: 1
Pennies: 8

Total: $1.08
 
*/
