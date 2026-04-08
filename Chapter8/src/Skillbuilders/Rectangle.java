package Skillbuilders;

public class Rectangle implements Comparable
{
	private double length;
	private double width;
	
	public Rectangle()
	{
		length = 1;
		width = 1;
	}
	
	public Rectangle(double l, double w)
	{
		length = l;
		width = w;
	}
	
	public void setLength(double l)
	{
		length = l;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public void setWidth(double w)
	{
		width = w;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double area()
	{
		double rectArea;
		
		rectArea = length * width;
		
		return rectArea;
	}
	
	public double perimeter()
	{
		double rectPerimeter;
		
		rectPerimeter = (2 * length) + (2 * width);
		
		return rectPerimeter;
	}
	
	public void displayAreaFormula()
	{
		System.out.println("The Formula for the Area of a Rectangle is A = l * w");
	}
	
	public String toString()
	{
		String rectString;
		
		rectString = "The Rectangle Has a Length of " + length + " and a Width of " + width;
		
		return rectString;
	}
	
	public int compareTo(Object r)
	{
		Rectangle testRect = (Rectangle)r;
		
		if (length == testRect.getLength() && width == testRect.getWidth())
		{
			return 1;
		}
		
		else
		{
			return -1;
		}
	}
}
