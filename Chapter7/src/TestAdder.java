import java.lang.Math;
import java.util.Scanner;

public class TestAdder
{


	    int tries = 1;
	    int answer;
	    int guess;
	    
	    
	    public TestAdder(int trys, int ans) {
	        tries = trys;
	        answer = ans;
	    }

	    public int getTry() 
	    {
	        Scanner input = new Scanner(System.in);
	        int ran1 = (int) (19 * Math.random());
	        int ran2 = (int) (19 * Math.random());

	        answer = ran1 + ran2;

	        do 
	        {
	            System.out.print(ran1 + " + " + ran2 + ": ");
	            guess = input.nextInt();
	            if (guess == answer) 
	            {
	               tries++;
	               System.out.println(tries);
	 
	            } 
	                
	            
	            else 
	            {
	                System.out.print ("Wrong answer. Enter another answer for ");
	             
	                if (tries <= 4) 
	                {
	                	
	                
	                	System.out.print("The correct answer was " + answer);
	                }
	                
	               
	               
	               
	            }
	        } while ( guess != 999);
	        
	        return (tries);
	    }

	    public int getAns() {
	        return (answer);
	    }
	    

}
