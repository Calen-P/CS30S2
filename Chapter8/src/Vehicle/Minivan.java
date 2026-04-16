package Vehicle;

public class Minivan extends Vehicle
{
	public Minivan(String name, double cost)
	{
		super(name, cost);
	}
	
	public String honk()
	{
		return("Wah Wah!");
	}
	
	public int capacity()
	{
		return(8);
	}
}
