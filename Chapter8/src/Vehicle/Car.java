package Vehicle;

/**
 * Car class.
 * 
 * Represents a car vehicle type.
 * Extends the Vehicle superclass and adds car-specific behavior.
 */
public class Car extends Vehicle
{
    /**
     * Constructor
     * 
     * Initializes a Car object using values from the Vehicle superclass.
     * 
     * @param n Vehicle name/model
     * @param c Cost of the vehicle
     * @param city City fuel efficiency
     * @param hwy Highway fuel efficiency
     * @param seatCap Seating capacity
     * @param carVol Cargo volume (or vehicle volume specification)
     * 
     * pre: none  
     * post: Car object is created and initialized via Vehicle constructor
     */
    public Car(String n, double c, int city, int hwy, int seatCap, String carVol)
    {
        // Call superclass constructor to initialize inherited fields
        super(n, c, city, hwy, seatCap, carVol);
    }
    
    /**
     * Returns the sound a car makes when honking.
     * 
     * @return String representing horn sound
     * 
     * pre: none  
     * post: String "Beep Beep!" is returned
     */
    public String honk()
    {
        return("Beep Beep!");
    }
}