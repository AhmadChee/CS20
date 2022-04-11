import java.utill.Scanner;
/*

Program: TimeConverter.java      Last Date of this Revision: March 18, 2022

Purpose: Create a TimeConverte application that allows the user to choose among converting hours to minutes, days to hours, minutes to hours, or hours to days. Use methods as apprpriate. 

Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 _

*/

package timeconverter;


public class TimeConverter 
{
	public static void hoursTominutes()
	{
		double hTime, mTime;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a time in hours: ");
		
		hTime = input.nextDouble();
		
		mTime =  (hTemp * 60);
		
		System.out.print("The time in minutes is " + mTime);
	}
}

public static void daysTohours()
{
	double dTIme, hTime;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the number of days:  ");
	
	dTime = input.nextDouble();
	
	hTime = (dTime * 24);
	
	System.out.println("The time in hours is " + hTime);
}

public static void minutesTohours()
{
	double mTime, hTime;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter time in minutes: ");
	
	mTime = input.nextDouble();
	
	hTime = (mTime * 0.0166667);
	
	System.out.println("The time in hours is " + hTime);
}

public static void hoursTodays()
{
	double hTime, dTime;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter time in hours: ");
	
	hTime = input.nextDouble();
	
	dTime = (hTime * 0.0416667);
	
	System.out.println("The time in days will be" + dTime)
}















public static void main(String[] args)
{
	int choice;
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("1. Hours to Minutes conversion.");
	System.out.println("2. Days to Hours conversion.");
	System.out.println("3. Minutes to Hours conversion.");
	System.out.println("4. Hours to Days conversion.");
	
	
	System.out.println("Enter your conversionn choice:  ");
	
	choice = input.nextInt();
	
	if(choice == 1)
	{
		hoursTominutes();
	}
	else if(choice == 2)
	{
		daysTohours();
	}
	
	else if(choice == 3) 
	{
		minutesTohours();
	}
	
	else 
	{
		hoursTodays();	
	}
		


	
    


/* Screen Dump



*/
