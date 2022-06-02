/*

Program: Squares.java      Last Date of this Revision: May 31, 2022

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

      int [] arr;//Array

      arr = new int [5];//Element

      for (int i = 0; i < arr.length; i++)//Tracker
         {

             arr[i] = i*i;//formula for the elements of an array

         }

        System.out.println("Elements of Array are >>");//Output message for elements and values

        for (int i = 0; i < arr.length; i++)//Adder starting from array of 0
        {

           System.out.println("arr["+i+"] = "+arr[i]);//Outputs arrays with the values

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

