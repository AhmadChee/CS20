import java.util.Scanner;

/*

Program: Grade.java      Last Date of this Revision: March 15, 2022

Purpose: Create a grade application that prompts the user for the percentage earned on a test or other graded work and then displays then corresponding letter grade. 

Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 .

*/


public class Grade 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a grade percentage: ");//ask the grade

        int grade = input.nextInt();//report the grade

        if (grade > 89 && grade < 101 )//check if grade is greater than 89 and less than 101
        {
            System.out.println("The corresponding letter grade is: A ");
        }

        else if (grade > 79 && grade < 90)
        {
           System.out.println("The corresponding letter grade is: B");//check if grade is greater than 79 and less than 90
        }

        else if (grade > 69 && grade < 80 )
        {
            System.out.println ("The corresponding letter grade is: C");//check if grade is greater than 69 and less than 80
        }

        else if (grade > 59 && grade < 70)
        {
            System.out.println("The corresponding letter grade is: D ");//check if grade is greater than 59 and less than 70
        }

        else if (grade < 60)
        {
            System.out.println("The corresponding letter grade is: F ");//check if grade is less than 60
        }

      
	}

}


/* Screen Dump

Enter a grade percentage: 75
The corresponding letter grade is: C

*/
