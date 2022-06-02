import java.util.Scanner;


class PiggyBank//PiggyBank Object
{
     private double total=0.0;//Total in bank

     void AddPenny(int num)
     { 
    	 
     total = total + num*0.01;//add one cent to total
     }
     
     void AddNickel(int num)
      {
         total = total + num*0.05;//add five cents to total
      }
     
      void AddDime(int num)
      {
        total = total + num*0.10;//add 10 cents to total
      }
      
      
     void AddQuarter(int num)
       {
         total = total + num*0.25;//add 25 cents to total
       }

    void ShowTotal()
   
    {
       System.out.println("Your balance IS $ "+total);//displays total balance
    }
    
    
    void Withdraw(double mul)
    {
    if(mul<=total)
    total = total-mul;
    
    
    else
    System.out.println("Not enough balance to withdraw.");//displays when there is not enough balance to withdraw
    }


}

/* Screen Dump
 * 
 * 
1. Show total in bank 
 2. Add a Penny
 3. Add a Nickel
 4. Add a Dime
 5. Add a Quarter
 6. Take money out of the bank
 Enter your choice: 3

*/
