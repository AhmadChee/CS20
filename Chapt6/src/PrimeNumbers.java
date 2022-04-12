/*

Program: PrimeNumbers.java        Last Date of this Revision: April 12, 2022

Purpose: Modify the primeNumber application created in Chapter 5 exercise 1 to include a method named isPrime(). 
The isPrime() method should require one parameter and return a Boolean Value. 

Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 
_
*/

import java.util.Scanner;


public class PrimeNumbers 
{

	public static void main(String[] args) 
	{
		{

			Scanner input = new Scanner (System.in);

			System.out.print("Please enter the the first number (Minimum Range): ");//prompts the user to enter number in minimum range

			int min = input.nextInt();

			System.out.print("\nPlease enter the the second number (Maximum Range): ");//prompts the user to enter number in maximum range

			int max = input.nextInt();

			for(int a=min;a<= max;a++) 
		  {

			if(isPrime(a)) 
			{
			  System.out.println("Prime numbers between "+ min +" and "+ max +": " + a);//tells the user which numbers are prime between the minimum range and the max range numbers
			}
		  }
	   }
    }
			   
	public static boolean isPrime(int num) 
	{    
	    for(int i = 2; i <= num/i; ++i) 
			 {
			    if(num % i == 0) 
			      {
			        return false;
			      }
			 }
			       return true;
	}

}


/* Screen Dump

Please enter the the first number (Minimum Range): 2

Please enter the the second number (Maximum Range): 9
Prime numbers between 2 and 9: 2
Prime numbers between 2 and 9: 3
Prime numbers between 2 and 9: 5
Prime numbers between 2 and 9: 7


*/