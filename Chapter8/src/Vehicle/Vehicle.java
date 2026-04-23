package Vehicle;

import java.text.NumberFormat;

public abstract class Vehicle
{
	private String name;
	private double cost;
	private int fuelEconomyCity;
	private int fuelEconomyHwy;
	private int seatingCapacity;
	private String cargoVolume;
	
	public Vehicle(String n, double c, int city, int hwy, int seatCap, String carVol)
	{
		name = n;
		cost = c;
		fuelEconomyCity = city;
		fuelEconomyHwy = hwy;
		seatingCapacity = seatCap;
		cargoVolume = carVol;
	}
	
	public String drive()
	{
		return("Vroom Vroom!");
	}
	
	public String stop()
	{
		return("Screech!");
	}
	
	public String getFuelEco()
	{
		return("The " + name + " Has a Fuel Economy of " + fuelEconomyCity + " MPG in a City and " + fuelEconomyHwy + " MPG on a Highway");
	}
	
	public String getSeatCap()
	{
		return("The Seating Capacity of the " + name + " is " + seatingCapacity);
	}
	
	public String getCarVol()
	{
		return("The Cargo Volume Ranges From " + cargoVolume + " Cubic Feet");
	}
	
	public String toString()
	{
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		return("The Vehicle is Called " + name + " and Costs " + money.format(cost));
	}
	
	public abstract String honk();
}
