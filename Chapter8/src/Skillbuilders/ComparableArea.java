package Skillbuilders;

public class ComparableArea extends Rectangle implements Comparable
{
	public int compareTo(Object p)
	{
		Puck testPuck = (Puck)p;
		
		if (super.area() < testPuck.getWeight())
		{
			return -1;
		}
		
		else if (weight == testPuck.getWeight())
		{
			return 0;
		}
		
		else
		{
			return 1;
		}
	}
}
