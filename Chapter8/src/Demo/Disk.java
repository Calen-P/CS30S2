package Demo;

public class Disk extends Circle
{
	private double thickness;
	
	//Overload Constructor Method
	public Disk(double r, double t)
	{
		super(r);
		thickness = t;
	}
	
	public void setThickness(double newT) //Modifier
	{
		thickness = newT;
	}
	
	public double getThickness() //Accessor
	{
		return(thickness);
	}
	
	public double volume()
	{
		double v;
		
		v = super.area() * thickness;
		
		return(v);
	}
	
	public boolean equals(Object obj)
	{
		Disk testObj = (Disk)obj;
		
		if (testObj.getRadius() == super.getRadius() && testObj.getThickness() == thickness)
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
		String diskString;
		
		diskString = "The Disk Has a Radius of " + super.getRadius() + " and a thickness of " + thickness;
		
		return diskString;
	}
}
