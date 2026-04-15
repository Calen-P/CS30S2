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
	
	public void ignition()
	{
		System.out.println("Vroom Vroom!");
	}
	
	public void turnOff()
	{
		System.out.println("Vroom-Pfft!");
	}
	
	public void drive()
	{
		System.out.println("Nyoom!");
	}
	
	public void stop()
	{
		System.out.println("Screech!");
	}
	
	public String toString()
	{
		return("The Vehicle is Called " + name + " and Costs " + cost);
	}
	
	public abstract void honk();
	
}
