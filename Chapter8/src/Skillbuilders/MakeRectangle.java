package Skillbuilders;

import java.util.Scanner;

public class MakeRectangle {

	public static void main(String[] args)
	{
		double length;
		double width;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please Enter a Length: ");
		length = userInput.nextDouble();
		
		System.out.println("Please Enter a Width: ");
		width = userInput.nextDouble();
		
		Rectangle r1 = new Rectangle(length, width);
		Rectangle r2 = new Rectangle();
		
		System.out.println("The Area of the Rectangle is " + r1.area() + ", and the Perimeter is " + r1.perimeter());
		r1.displayAreaFormula();

		if (r1.compareTo(r2) == 1)
		{
			System.out.println("The Rectangles are the Same");
		}
		
		else
		{
			System.out.println("The Rectangles are not the Same");
		}
	}

}
