package Vehicle;

/**
 * Minivan class.
 * 
 * Represents a minivan vehicle type.
 * Extends the Vehicle superclass and provides minivan-specific behavior.
 */
public class Minivan extends Vehicle
{
    /**
     * Constructor
     * 
     * Initializes a Minivan object using the Vehicle superclass constructor.
     * 
     * @param n Vehicle name/model
     * @param c Cost of the vehicle
     * @param city City fuel economy
     * @param hwy Highway fuel economy
     * @param seatCap Seating capacity
     * @param carVol Cargo volume
     * 
     * pre: none  
     * post: Minivan object is created and initialized
     */
    public Minivan(String n, double c, int city, int hwy, int seatCap, String carVol)
    {
        // Call superclass constructor to initialize inherited fields
        super(n, c, city, hwy, seatCap, carVol);
    }
    
    /**
     * Returns the sound a minivan makes when honking.
     * 
     * @return String representing honk sound
     * 
     * pre: none  
     * post: String "Wah Wah!" is returned
     */
    public String honk()
    {
        return("Wah Wah!");
    }
}