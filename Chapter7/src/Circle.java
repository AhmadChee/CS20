/*
 
Program: Circle.java      Last Date of this Revision: April 28
 
 
Purpose: Modify the circle class to include a member method 
named circumference. The circumference() method should return 
the circumference of the circle (2*PI*r). Include an overloaded 
constructor that accepts the radius of the Circle object. Also 
include a class named displayAreaformula. Override the equals()
and toString() method. 
 
Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 

*/


public class Circle 
{

	public static final double PI = 3.14;// PI number value 
	
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
	
	
	public double circumference(double r)//member method circumference 
	 {
		
		return( 2*PI*r);//formula for circumference of a circle
	 }
	
	public double area(double r)//method for area of a circle
	 {
		return(PI*(r*r));//formula for area of a circle
	 }
	
	public static void displayAreaformula()//class method displayAreaformula
	 {
		System.out.println("The formula for the area of a circle is a=Pi*r*r");
	 }
	
	

}


//Screen Dump on Test Circle