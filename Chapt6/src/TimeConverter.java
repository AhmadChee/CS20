/*

Program: TimeConverter.java      Last Date of this Revision: April 12, 2022

Purpose: Create a TimeConverter application that allows the user to choose among converting hours to minutes, days to hours, minutes to hours or hours to days. 

Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 _

*/

import java.util.*;

public class TimeConverter
{
	public static void hoursTominutes()
	{
		double hTime, mTime;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a time in hours: ");//user enters time in hours
		
		hTime = input.nextDouble();
		
		mTime =  ((hTime) * 60);//formula of conversion between hours to minutes
		
		System.out.print("The time in minutes is " + mTime);//displays conversion from hours to minutes
	}




public static void daysTohours()
{
	double dTime, hTime;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the number of days:  ");//user enters number of days
	
	dTime = input.nextDouble();
	
	hTime = ((dTime) * 24);//formula for conversion between days to hours
	
	System.out.println("The time in hours is " + hTime);//displays conversion from days to hours
}

public static void minutesTohours()
{
	double mTime, hTime;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter time in minutes: ");//user enters time in minutes 
	
	mTime = input.nextDouble();
	
	hTime = (mTime * 0.0166667);//formula for conversion between minutes to hours
	
	System.out.println("The time in hours is " + hTime);//displays conversion from days to hours
}

public static void hoursTodays()
{
	double hTime, dTime;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter time in hours: ");//user enters time in hours 
	
	hTime = input.nextDouble();
	
	dTime = (hTime * 0.0416667);//formula for conversion between hours to days
	
	System.out.println("The time in days will be" + dTime);//displays conversion from hours to days
}




public static void main(String[] args)
{
	int choice;
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("1. Hours to Minutes conversion.");//first choice of conversion
	System.out.println("2. Days to Hours conversion.");//second choice of conversion 
	System.out.println("3. Minutes to Hours conversion.");//third choice of conversion
	System.out.println("4. Hours to Days conversion.");//fourth choice of conversion
	
	
	System.out.println("Enter your conversion choice:  ");//user enters conversion choice
	
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
	
}



}
		

/* Screen Dump

1. Hours to Minutes conversion.
2. Days to Hours conversion.
3. Minutes to Hours conversion.
4. Hours to Days conversion.
Enter your conversion choice:  
1
Enter a time in hours: 5
The time in minutes is 300.0

*/
