
public class TestCircle 
{

	public static void main(String[] args) 
	{
		Circle spot1 = new Circle();
		
		Circle spot2 = new Circle(4);
		
		spot1.setRadius(3);
		System.out.println("Circle radius " + spot1.getRadius());
		System.out.println("Circle circumference: " + spot1.circumference(3));
		System.out.println("Circle area " + spot1.area(3));
		spot1.displayAreaformula();
		
		
		System.out.println("\n \n \n");
		
		spot2.setRadius(4);
		System.out.println("Circle radius " + spot2.getRadius());
		System.out.println("Cirlce circumference: " + spot2.circumference(4));
		System.out.println("Circle area " + spot2.area(4));
		spot2.displayAreaformula();
		
		System.out.println("\n \n \n");
		
		
		if (spot1.equals(spot2))
		{
			System.out.println("Objects are equal.");
		}
		
		else 
		{
			System.out.println("Objects are not equal.");
		}
		
		
		
		
		
		
		
		
	}

}
