import java.util.Scanner;

/*

Program: Hurricane.java      Last Date of this Revision: March 17, 2022

Purpose: Create a hurricane application that displays the wind speed for the hurricane category entered by the user. Display the speed in miles per hour (mph), knots (kts), and kilometers per hour (km/hr).

Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 

*/
public class Hurricane 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a hurricane category: ");//ask for the hurricane category
		
		int category = input.nextInt();//record category of hurricane
		
	    switch (category) 
	    {
	    case 1: 
	    	System.out.println("Category 1: The speeds of this hurricane are between 74-95 mph, 64-82 kt, 119-153 km/hr");//tells the speeds of category 1 hurricane in different units
	    	break;
	    case 2: 
	    	System.out.println("Category 2: The speeds of this hurricane are between 96-110 mph, 83-95 kt, 154-177km/hr");//tells the speeds of category 2 hurricane in different units
	    	break;
	    case 3: 
	    	System.out.println("Category 3: The sppeds of this hurricane are between 111-130 mph, 96-113 kt, 178-209km/hr");//tells the speeds of category 3 hurricane in different units
	    	break;
	    case 4: 
	    	System.out.println("Category 4: The speeds of this hurricane are between 131-155 mph, 114-135 kt, 210-249 km/hr");//tells the speeds of category 4 hurricane in different units
	    	break;
	    case 5: 
	    	System.out.println("Category 5: The speed of this hurricane is greater than 155 mph, 135 kt, 249 km/hr");//tells the speeds of category 5 hurricane in different units
	    	break;
	    	
	    }

	}

}

/* Screen Dump
 * 
Enter a hurricane category: 1
Category 1: The speeds of this hurricane are between 74-95 mph, 64-82 kt, 119-153 km/hr

*/

