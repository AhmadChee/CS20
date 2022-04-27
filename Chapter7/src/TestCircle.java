
public class TestCircle 
{

	public static void main(String[] args) 
	{
		Circle spot = new Circle();
		
		Circle c2 = new Circle(4);
		
		spot.setRadius(3);
		System.out.println("Circle radius " + spot.getRadius());
		System.out.println("Circle circumference: " + spot.circumference(3));
		Circle.displayAreaformula();
		
		
		
		
		
		
	}

}
