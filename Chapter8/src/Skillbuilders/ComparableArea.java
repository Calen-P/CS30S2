package Skillbuilders;

public class ComparableArea extends Rectangle
{
	private double area;
	
	public ComparableArea(Object obj)
	{
		Rectangle testRect = (Rectangle)obj;
		
		area = testRect.area();
	}
	
	public int compareToArea(Object r)
	{
		Rectangle testRect = (Rectangle)r;
		
		if (area == testRect.area())
		{
			return 0;
		}
		
		else if (area < testRect.area())
		{
			return -1;
		}

		else
		{
			return 1;
		}
	}
}
