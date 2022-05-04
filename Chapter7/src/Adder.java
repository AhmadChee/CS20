import java.util.Scanner;

public class Adder 
{

	public static void main(String[] args) 
	{
		int ans = 0;
		int tries;
		int score = 0;
			
		Player one = new Player (0, 0);
		while (ans != 999) 
		{
			tries = one.getTry();
			ans = one.getAns();
		
			switch (tries) 
			{
			case 1: score += 5; break;
			case 2: score += 3; break;
			case 3: score += 1; break;
			case 4: score += 0;
			System.out.println("Wrong answer. The correct answer is: " + ans ); break;
			}	
		}
		
		System.out.print("Your Score is " + score);
	}

}
