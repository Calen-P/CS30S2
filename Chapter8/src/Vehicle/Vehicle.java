package Vehicle;

public abstract class Vehicle
{
	private String name;
	private double cost;
	
	public Vehicle(String n, double c)
	{
		name = n;
		cost = c;
	}
	
	public String drive()
	{
		return("Vroom Vroom!");
	}
	
	public String stop()
	{
		return("Screech!");
	}
	
	public String toString()
	{
		return("The Vehicle is Called " + name + " and Costs " + cost);
	}
	
	public abstract String honk();
	
	public abstract int capacity();
	
}
