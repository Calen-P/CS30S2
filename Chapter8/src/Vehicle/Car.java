package Vehicle;

public class Car extends Vehicle
{
	public Car(String name, double cost)
	{
		super(name, cost);
	}
	
	public void honk()
	{
		System.out.print("Beep Beep!");
	}
}
