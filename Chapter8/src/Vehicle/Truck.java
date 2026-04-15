package Vehicle;

public class Truck extends Vehicle
{
	public Truck(String name, double cost)
	{
		super(name, cost);
	}
	
	public void honk()
	{
		System.out.print("Honk Honk!");
	}
}
