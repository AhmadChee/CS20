import java.util.Scanner;

public class AddG {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		KeepTrScores kt = new KeepTrScores();
		
		int attempts = 0;
		
		
		
		 int ran1 = (int) (19 * Math.random());
		 int ran2 = (int) (19 * Math.random());
		 int answer = ran1 + ran2;
		 
		 
		 System.out.print(ran1 + " + " + ran2 + ": ");
         int guess = input.nextInt();
		
		while( guess != 999)
		{
			attempts++;
			
			   if (guess == answer) 
	            {
	               
	               System.out.println("Your attempts so far are: "+ attempts);
	               
	               
	               if(attempts == 1)	            	   
	               {
	            	   kt.scores1();
	            	   System.out.println("Your current Score is: "+ kt.score);
	               }
	               else if(attempts > 1)
	               {
	            	   kt.scores2();
	            	   System.out.println("Your current Score is: "+ kt.score);
	               }
	 
	            }
			   
			   if(guess != answer)
			   {
				   
			   }
			   
			   
			 
			   
			   
			   
			   
			   
			   
			   
			   
			 
			   System.out.print("Continue or type 999 to quit");
			   ran1 = (int) (19 * Math.random());
			   ran2 = (int) (19 * Math.random());
			   System.out.print(ran1 + " + " + ran2 + ": ");
		        guess = input.nextInt();
	         
	        
		}
		
       

	}

}
