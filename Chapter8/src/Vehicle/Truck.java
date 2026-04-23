package Vehicle;

public class Truck extends Vehicle
{
	public Truck(String n, double c, int city, int hwy, int seatCap, String carVol)
	{
		super(n, c, city, hwy, seatCap, carVol);
	}
	
	public String honk()
	{
		return("Honk Honk!");
	}
}
