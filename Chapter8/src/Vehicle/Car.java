package Vehicle;

public class Car extends Vehicle
{
	public Car(String name, double cost)
	{
		super(name, cost);
	}
	
	public String honk()
	{
		return("Beep Beep!");
	}
	
	public int capacity()
	{
		return(6);
	}
}
