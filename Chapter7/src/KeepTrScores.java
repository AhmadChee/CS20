
public class KeepTrScores
{
	
	
	int score =0;
	
	
	public int scores1()
	{
		score = score + 5;
		
		return score;
		
	}
	
	
	public int scores2()
	{
		score = score + 3;
		
		return score;
		
	}
	
	
	public int scores3()
	{
		score = score + 1;
		
		return score;
	}
	
	public int scores4()
	{
		score = score + 0;
		
		return score;
	}
	
	
	
public String toString()
{
	return "Total points are: "+ score;
}
	

}
