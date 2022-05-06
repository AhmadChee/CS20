import java.lang.Math;
import java.util.Scanner;

public class Player 
{

	 int ran1, ran2;
	    int tries = 1;
	    int answer;
	    int guess;

	    public Player(int trys, int ans) {
	        tries = trys;
	        answer = ans;
	    }

	    public int getTry() 
	    {
	        Scanner input = new Scanner(System.in);
	        ran1 = (int) (19 * Math.random());
	        ran2 = (int) (19 * Math.random());
	        answer = ran1 + ran2;

	        do 
	        {
	            System.out.print(ran1 + " + " + ran2 + ": ");
	            guess = input.nextInt();
	            if (guess == answer) 
	            {
	                return (tries);
	 
	            } 
	                
	            
	            else 
	            {
	                System.out.print ("Wrong answer. Enter another answer for ");
	             
	                if (tries >= 4) 
	                {
	                	
	                
	                	System.out.print("The correct answer was " + answer);
	                }
	                
	               
	               
	               
	            }
	        } while (tries <= 4 && answer != guess || guess != 999);
	        return (tries);
	    }

	    public int getAns() {
	        return (answer);
	    }

}
