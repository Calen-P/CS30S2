package Vehicle;

import java.text.NumberFormat;

/**
 * Abstract Vehicle class.
 * 
 * Represents a generic vehicle with common properties such as:
 * - Name
 * - Cost
 * - Fuel economy (city and highway)
 * - Seating capacity
 * - Cargo volume
 * 
 * This class serves as a superclass for specific vehicle types
 * such as Car, Truck, and Minivan.
 */
public abstract class Vehicle
{
    /** Vehicle name/model */
    private String name;
    
    /** Vehicle cost in dollars */
    private double cost;
    
    /** Fuel economy in city driving (MPG) */
    private int fuelEconomyCity;
    
    /** Fuel economy on highway (MPG) */
    private int fuelEconomyHwy;
    
    /** Number of seats in the vehicle */
    private int seatingCapacity;
    
    /** Cargo volume range */
    private String cargoVolume;
    
    /**
     * Constructor
     * 
     * Initializes a Vehicle object with all attributes.
     * 
     * @param n Vehicle name
     * @param c Vehicle cost
     * @param city City fuel economy
     * @param hwy Highway fuel economy
     * @param seatCap Seating capacity
     * @param carVol Cargo volume
     * 
     * pre: none  
     * post: Vehicle object is created and initialized
     */
    public Vehicle(String n, double c, int city, int hwy, int seatCap, String carVol)
    {
        name = n;
        cost = c;
        fuelEconomyCity = city;
        fuelEconomyHwy = hwy;
        seatingCapacity = seatCap;
        cargoVolume = carVol;
    }
    
    /**
     * Simulates driving the vehicle.
     * 
     * @return String representing driving sound
     * 
     * pre: none  
     * post: Returns "Vroom Vroom!"
     */
    public String drive()
    {
        return("Vroom Vroom!");
    }
    
    /**
     * Simulates stopping the vehicle.
     * 
     * @return String representing stopping sound
     * 
     * pre: none  
     * post: Returns "Screech!"
     */
    public String stop()
    {
        return("Screech!");
    }
    
    /**
     * Returns fuel economy information.
     * 
     * @return formatted string with city and highway MPG
     * 
     * pre: none  
     * post: Fuel economy information is returned
     */
    public String getFuelEco()
    {
        return("The " + name + " Has a Fuel Economy of " 
                + fuelEconomyCity + " MPG in a City and " 
                + fuelEconomyHwy + " MPG on a Highway");
    }
    
    /**
     * Returns seating capacity information.
     * 
     * @return formatted string with seating capacity
     * 
     * pre: none  
     * post: Seating capacity information is returned
     */
    public String getSeatCap()
    {
        return("The Seating Capacity of the " + name + " is " + seatingCapacity);
    }
    
    /**
     * Returns cargo volume information.
     * 
     * @return formatted string with cargo volume range
     * 
     * pre: none  
     * post: Cargo volume information is returned
     */
    public String getCarVol()
    {
        return("The Cargo Volume Ranges From " + cargoVolume + " Cubic Feet");
    }
    
    /**
     * Returns a string representation of the vehicle.
     * 
     * Includes:
     * - Vehicle name
     * - Cost (formatted as currency)
     * 
     * @return formatted vehicle information
     * 
     * pre: none  
     * post: Vehicle description is returned
     */
    public String toString()
    {
        // Formatter for currency display
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        return("The Vehicle is Called " + name + " and Costs " + money.format(cost));
    }
    
    /**
     * Abstract method for vehicle horn sound.
     * 
     * Must be implemented by subclasses.
     * 
     * @return sound of vehicle horn
     */
    public abstract String honk();
}