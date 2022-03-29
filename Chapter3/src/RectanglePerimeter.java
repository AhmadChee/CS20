import java.util.Scanner;

/*

Program: RectanglePerimeter.java        Last Date of this Revision: February 23, 2022

Purpose: Create a RectanglePerimeter application that calculates perimeter of rectangle  with width 4 and length 13

Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 
_
*/

public class RectanglePerimeter 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the length:   ");
		 
		int length = input.nextInt();		  //longer side of the rectangle
		
		
		System.out.print("Enter the width:    ");
		
		int width = input.nextInt();          //shorter side of the rectangle
		
		
		int perimeter;                       //calculated perimeter of rectangle
		
		perimeter = (2*length) + (2*width);
		
		System.out.println("The perimeter of the rectangle is: "     +    perimeter );
		

	}

}


/* Screen Dump

Enter the length:   13
Enter the width:    4
The perimeter of the rectangle is: 34

*/
