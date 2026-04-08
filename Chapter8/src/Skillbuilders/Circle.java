package Skillbuilders;

public class Circle
{
	private static double PI = 3.14;
	private double radius;
	
	//Default Constructor Method
	public Circle()
	{
		radius = 1;
	}
	
	//Overload the Default Constructor
	public Circle(double r)
	{
		radius = r;
	}
	
	public void setRadius(double newR) //Modifier
	{
		radius = newR;
	}
	
	public double getRadius() //Accessor
	{
		return(radius);
	}
	
	public double area()
	{
		double circleArea;
		
		circleArea = PI * radius * radius;
		return(circleArea);
	}
	
	public boolean equals(Object obj)
	{
		Circle testObj = (Circle)obj;
		
		if (testObj.getRadius() == radius)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		String circleString;
		
		circleString = "The Circle Has a Radius of " + radius;
		
		return circleString;
	}
}
