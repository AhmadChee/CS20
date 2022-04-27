


public class Circle 
{

	public static final double PI = 3.14;
	
	private double radius;
	
	public Circle()//constructor method
	{
		radius = 1; //default radius
				
	   
	}
	
	public Circle(double r)//constructor method2
	{
		radius = r;
		
		
	}
	
	public void setRadius(double newRadius)
	{
		radius = newRadius;
	}
	
	
	public double getRadius()  

	{
		return(radius);
	}
	
	
	public double circumference(double r)
	{
		
		return( 2*PI*r);
	}
	
	public static void displayAreaformula()
	{
		System.out.println("The formula for the area of a circle is a=Pi*r*r");
	}
	
	

}
