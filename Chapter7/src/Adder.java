import java.util.Scanner;

public class Adder 
{

	public static void main(String[] args) 
	{
		int ans = 0;
		int tries;
		int score = 0;
			
		TestAdder one = new TestAdder (0, 0);
		while (ans != 999) 
		{
			tries = one.getTry();
			ans = one.getAns();
		
			switch (tries) 
			{
			case 1: score += 5; break;//gained 5 points
			case 2: score += 3; break;//gained 3 points 
			case 3: score += 1; break;//gained 1 point 
			case 4: score += 0;//gained 0 points 
			System.out.println("Wrong answer. The correct answer is: " + ans ); break;//displays the correct answer of the equation 
			}	
		}
		
		System.out.print("Your Score is " + score);//displays score after round 
	}

}
