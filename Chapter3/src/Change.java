import java.util.Scanner;

/*

Program: Change.java        Last Date of this Revision: February 25, 2022

Purpose: Create a change application that prompts the user for an amount less than $1.00 and then displays the minimum number of coins necessary to make the change. 

Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 
_
*/

public class Change 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		 System.out.print("Enter the change in cents: "  ); 

	        

	        int change = input.nextInt(); 

	        int quarters = change / 25;                //number of quarters
	        
	        int dimes = ((change % 25)/10);            //number of dimes  

	        int nickels = ((change % 25)% 10 ) / 5;    //number of nickels

	        int pennies = ((change % 25)% 10) % 5;     //number of pennies
	        

	        System.out.println("\n \nThe minimum number of coins is: " +"\n") ;

	        System.out.println("Quarters: " + quarters +  "\n");
	       
	        System.out.println("Dimes: " + dimes + "\n");

	        System.out.println("Nickels: " + nickels + "\n");

	        System.out.println("Pennies: " + pennies);

	}

}

/* Screen Dump

Enter the change in cents: 34

 
The minimum number of coins is: 

Quarters: 1

Dimes: 0

Nickels: 1

Pennies: 4


*/
