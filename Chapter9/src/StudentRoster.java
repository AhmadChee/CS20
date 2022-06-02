/*

Program: StudentsRoster.java      Last Date of this Revision: May 31, 2022

Purpose: Create a StudentRoster application that prompts the 
user for the number of students in the class and then prompts 
the user for each students and stores the name in an array. 

Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 _

*/


import java.util.Scanner;

public class StudentRoster 
{
	  
	  
  public static void main(String[] args)
  {
    int n;//variable for the number of students
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter number of students: ");//prompts user the number of students 
    
    n = scanner.nextInt();//prompts user the number of students
    
    String arr[] = new String[n];
    
    System.out.println("Enter "+n+" student names");//displays the number of students and prompts the user for 
    
    for(int i = 0;i<n;i++)
    {
      arr[i] = scanner.nextLine();
    
    }

    System.out.println("\nStudents are:");//displays the students names 
    
    for(int i = 0;i<n;i++)
    {
      System.out.println(arr[i]);
    }
    
  }
  
}

/* Screen Dump

Enter number of students: 
2
Enter 2 student names
Ahmad
Cheema

Students are:

Ahmad
Cheema

*/