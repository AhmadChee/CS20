/*
 
Program: AccountSetup.java      Last Date of this Revision: March 31, 2022
 
 
Purpose: Create a AccountSetup application which prompts the user for a user name or a password. 
The application should prompt the user until a password with at least eight characters is entered. 
The user name and password should be converted to all lower case letters and then an appropriate message is displayed.  

Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 

*/

import java.util.Scanner;

public class AccountSetup 
{

public static void main(String[] args)  
  {
     System.out.print("Enter a user name: ");//ask for user name

      Scanner userna = new Scanner (System.in);

      String username = userna.next();

      username = username.toLowerCase();//user name and password going to turn into lower case 

      String userInput = "c";

        

         while (!(userInput.equalsIgnoreCase("q")))
          {

             System.out.print("Enter a password that is at least 8 characters: ");//ask for password with at least 8 characters
    
                Scanner upass = new Scanner (System.in);
                
                String password = userna.next();
                
                password = password.toLowerCase();
                    
                int character = password.length();
                   
                   
	           if (character < 8)
	            {
	             System.out.println("Too short please enter a password with atleast 8 characters: ");//displays when password is less than 8 characters
	              continue;
	            }
	           
	           	
           		System.out.print("Do you want to continue(c) or QUIT(q)");
           		userInput = upass.next();
           		
           		if(userInput.equalsIgnoreCase("q"))
           		{
           		  System.out.println("Your username is " + username + " and your password is " +password);//displays user name and password in lower case
           			
           		}
           		
              

         }

  }

}

/* Screen Dump

Enter a user name: MattD
Enter a password that is at least 8 characters: Programmer7
Do you want to continue(c) or QUIT(q)q
Your username is mattd and your password is programmer7

*/


