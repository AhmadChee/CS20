import java.util.Scanner;

/*

Program: NumbersSum.java      Last Date of this Revision: 

Purpose: Create a NumbersSum application that prompts the user for a number and then displays the numbers 1 through the number entered, each on a separate line. Below the numbers, the sum is displayed. 

Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 

*/


public class NumbersSum 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		int num = 1;
		int numSum = 0;
		
		System.out.print("Enter a number:  ");//ask for any number
		
		int numberMax = input.nextInt();//record number
		
		
		while(num <= numberMax)
		{
			System.out.println("The number you have entered is: "   + num);//output it to the screen num
			
					
			numSum = numSum + num;//numSum being added to the num
			
			
			num = num +1; //1 more being added to num
		}
		
		   System.out.println("The sum of the equation will be:  " + numSum);//output it to the screen numSum

	}

}


/* Screen Dump

The number you have entered is: 1
The number you have entered is: 2
The number you have entered is: 3
The number you have entered is: 4
The number you have entered is: 5
The number you have entered is: 6
The number you have entered is: 7
The number you have entered is: 8
The sum of the equation will be:  36

*/
