package Vehicle;

public class Car extends Vehicle
{
	public Car(String n, double c, int city, int hwy, int seatCap, String carVol)
	{
		super(n, c, city, hwy, seatCap, carVol);
	}
	
	public String honk()
	{
		return("Beep Beep!");
	}
}
