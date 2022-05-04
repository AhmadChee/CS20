import java.util.Scanner;

public class TestAdder 
{

	public static void main(String[] args) 
	{
		int ans = 0;
		int guess = 0;
		int tries;
		int score = 0;
			
		Player one = new Player (0, 0);
		while (guess != 999) 
		{
			tries = one.getTry();
			ans = one.getAns();
			guess = one.getGuess();
			switch (tries) 
			{
			case 1: score += 5; break;
			case 2: score += 3; break;
			case 3: score += 1; break;
			case 4: score += 0;
			System.out.println("Wrong answer. The correct answer is: " ); break;
			}	
		}
		
		System.out.print("Your Score is " + score);
	}

}
