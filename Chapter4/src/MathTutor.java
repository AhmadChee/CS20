import java.util.Scanner;

/*

Program: MathTutor.java      Last Date of this Revision: March 15, 2022

Purpose: Create a MathTutor application that displays math problems by randomly generating two numbers, 1 through 10 and the operator (*, +, -, /), and then prompts the user for the answer. 

Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 

*/


public class MathTutor 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		  Scanner sc = new Scanner (System.in);
	        int num1 = 1 +(int)(10*Math.random());//random num1
	        int num2 = 1 +(int)(10*Math.random());//random num2
	        int x = 1 + (int)(10*Math.random());//random answer
	        String operator = "";//random operator
	        int answer = 0;
	        String remainder ="";

	        switch(x){

	            case 1,2,3:
	            operator = "+";//operator is addition
	            answer = num1 + num2;//adding num1 and num2
	            break;

	            case 4,5,6:
	            operator = "-";//operator subtraction
	            answer = num1 -num2;//subtracting num1 and num2
	            break;
	        
	                case 7,8:
	                operator = "*";//operator multiplication
	                answer = num1 * num2;//multiplying num1 and num2
	                break;

	                default:
	                operator = "/";//operator division
	                remainder = "as a whole number without a remainder";//answer as a whole number with no remainder

	                
	               
	            }

	            System.out.print("What is " + num1 + operator +  num2 + remainder+"?");//asking user a question
	            int UserAnswer = sc.nextInt();//recording answer

	            if (UserAnswer == answer){//checking if answer is correct

	                System.out.println("Correct!");
	            }

	            else{//if not the right answer
	                System.out.println("Sorry, better luck next time!");
	            }        

	}

}


/* Screen Dump

What is 9*9? 81
Correct!

*/

