package Vehicle;

public class Minivan extends Vehicle
{
	public Minivan(String name, double cost)
	{
		super(name, cost);
	}
	
	public void honk()
	{
		System.out.print("Wah Wah!");
	}
}
