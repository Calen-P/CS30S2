package Vehicle;

public class Truck extends Vehicle
{
	public Truck(String name, double cost)
	{
		super(name, cost);
	}
	
	public String honk()
	{
		return("Honk Honk!");
	}
	
	public int capacity()
	{
		return(5);
	}
}
