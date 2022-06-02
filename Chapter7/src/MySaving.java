/*

Program: MySavings.java      Last Date of this Revision: May 24, 2022

Purpose: Create a MySavings application that displays a menu of 
choices foe entering pennies, nickels, dimes and quarters into
a piggy bank and then prompts the user to make a selection. 
The MySavings application should include a piggyBank object
that can add coins to the piggy bank, remove coins, and return 
the total amount in the bank. 


Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 _

*/






import java.util.Scanner;

   class MySaving
{
    public static void main(String arg[]){
    int choice1=0,mul=0;
    double mul2=0.0;
    
    
       Scanner in = new Scanner(System.in);
       
      PiggyBank pb = new PiggyBank();
   do
     {

          System.out.println("");
                  System.out.println(" 1. Show total in bank ");//displays this as first option 
                  System.out.println(" 2. Add a Penny");//displays this as second option 
                  System.out.println(" 3. Add a Nickel");//displays this as third option 
                  System.out.println(" 4. Add a Dime");//displays this as fourth option 
                  System.out.println(" 5. Add a Quater");//displays this as the fifth option  
                  System.out.println(" 6. Take money out of the bank");//displays this as sixth option
                  System.out.print(" Enter your choice: ");//prompts user to enter choice

      choice1=in.nextInt();//pront of user
      switch(choice1)
      {
       

case 1://if first option is chosen
                System.out.println("");
                pb.ShowTotal();//showing the total
                                break;

case 2://if second option is chosen
                System.out.println("");
                System.out.print("Enter how many pennies you would like to add : ");//prompts the user to enter the amount of pennies which can be added 
                mul=in.nextInt();
                      pb.AddPenny(mul);
                                break;

case 3://if third option is chosen
                System.out.println("");
                System.out.print("Enter how many nickels you would like to add :");//prompts the user for the nickels that they would like to add 
                mul=in.nextInt();
                      pb.AddNickel(mul);
                                break;

case 4://if forth option is chosen
                System.out.println("");
                System.out.print("Enter how many dimes you would like to add :");//prompts the user for the dimes that they would like to add 
                mul=in.nextInt();
                      pb.AddDime(mul);
                                break;
case 5://if fifth option is chosen
                System.out.println("");
                System.out.print("Enter how many quarters you would like to add :");//promots the user for the quarters that they would like to add 
                mul=in.nextInt();
                      pb.AddQuarter(mul);
                                break;

case 6://if sixth option is chosen
                System.out.println("");
                System.out.print("Enter amount you want to withdraw : ");//asks user for the amount that they want to withdraw
                mul2=in.nextDouble();
                      pb.Withdraw(mul);
                                break;
case 0://option to end the program
                System.out.println("");
                System.out.print("End Program");
                 
                 
                                break;
            default:
                      System.out.println("Wronge Choice,try again !");
            }
    }

while(choice1!=0);

   }
}

