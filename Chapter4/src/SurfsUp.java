import java.util.Scanner;

/*

Program: SurfsUp.java      Last Date of this Revision: March 14, 2022

Purpose: Create a SurfsUp application that prompts the user for the wave height and then displays "Great day for surfing!" when the waves are 6 feet and over, "Go body boarding!" when the waves are between 3 and 6 feet, "Go for a swim'.  when the waves are 0 to 3 feet, and "Whoa! What kind of surf is that?" otherwise.  

Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 

*/

public class SurfsUp 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a wave height (feet): ");//ask waveheight
		
		int waveheight = input.nextInt();//record waveheight
		
		
		if (waveheight > 6)//checks waveheight greater than 6
		{
			System.out.println("Great day for surfing!");
		}
		
		
		else if (waveheight < 6)//checks waveheight less than 6
		{
			System.out.println("Go body boarding!");
		}
		
		
		else if (waveheight > 3 &&  waveheight < 6)//checks waveheight greater than three and less than 6
		{
			System.out.println("Go for a swim.");
		}
		
		else if (waveheight > 0 && waveheight < 3 )//checks waveheight greater than zero but less than 3
		{
			System.out.println("Whoa! What kind of surf is that?");
		}
		
	}

}

/* Screen Dump

Enter a wave height (feet): 4
Go body boarding!

*/


