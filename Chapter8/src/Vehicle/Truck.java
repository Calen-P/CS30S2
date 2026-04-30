package Vehicle;

/**
 * Truck class.
 * 
 * Represents a truck vehicle type.
 * Extends the Vehicle superclass and provides truck-specific behavior.
 */
public class Truck extends Vehicle
{
    /**
     * Constructor
     * 
     * Initializes a Truck object using the Vehicle superclass constructor.
     * 
     * @param n Vehicle name/model
     * @param c Cost of the vehicle
     * @param city City fuel economy
     * @param hwy Highway fuel economy
     * @param seatCap Seating capacity
     * @param carVol Cargo volume
     * 
     * pre: none  
     * post: Truck object is created and initialized
     */
    public Truck(String n, double c, int city, int hwy, int seatCap, String carVol)
    {
        // Call superclass constructor to initialize inherited fields
        super(n, c, city, hwy, seatCap, carVol);
    }
    
    /**
     * Returns the sound a truck makes when honking.
     * 
     * @return String representing honk sound
     * 
     * pre: none  
     * post: String "Honk Honk!" is returned
     */
    public String honk()
    {
        return("Honk Honk!");
    }
}