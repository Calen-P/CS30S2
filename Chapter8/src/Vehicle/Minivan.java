package Vehicle;

public class Minivan extends Vehicle
{
	public Minivan(String n, double c, int city, int hwy, int seatCap, String carVol)
	{
		super(n, c, city, hwy, seatCap, carVol);
	}
	
	public String honk()
	{
		return("Wah Wah!");
	}
}
