/*

Program: Squares.java      Last Date of this Revision: 

Purpose: Create a Squares application that store the square of an 
element's index in an integer array of 5 elements. 
 
Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 

*/

public class Square 
{

      public static void main(String[] args) 
       {

      int [] arr;

      arr = new int [5];

      for (int i = 0; i < arr.length; i++) 
         {

             arr[i] = i*i;

         }

        System.out.println("Elements of Array are >>");

        for (int i = 0; i < arr.length; i++) 
        {

           System.out.println("arr["+i+"] = "+arr[i]);

        }

      }

}

/* Screen Dump
 
Elements of Array are >>
arr[0] = 0
arr[1] = 1
arr[2] = 4
arr[3] = 9
arr[4] = 16

*/

