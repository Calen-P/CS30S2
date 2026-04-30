package Vehicle;

import java.util.Scanner;

/**
 * Drive class.
 * 
 * Simulates a simple vehicle control system.
 * Allows the user to interact with different vehicles:
 * - Car
 * - Truck
 * - Minivan
 * 
 * Users can:
 * - Drive/stop vehicles
 * - Honk
 * - View vehicle information
 * - Check seat capacity, fuel economy, and cargo volume
 */
public class Drive {

    /**
     * Main method - program entry point.
     * 
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        // Create vehicle objects
        Car v1 = new Car("Mazda 5", 36300, 21, 28, 6, "5.58-44.4");
        Truck v2 = new Truck("Ford F-150", 70995, 20, 21, 3, "52.8 to 77.4");
        Minivan v3 = new Minivan("Toyota Sienna", 49370, 32, 36, 8, "33.5-75.2");
        
        // Scanner for user input
        Scanner input = new Scanner(System.in);
        
        // User menu choices
        String choice;   // Main menu choice
        String action = null; // Vehicle action choice (drive, stop, honk, etc.)
        
        // Vehicle selection number
        int vNum;
        
        // Default selected vehicle
        Vehicle v = v1;
        
        // Main program loop (runs until user quits)
        do
        {
            // Display main menu
            System.out.println(
                "(D)rive \\ (N)ame and Price \\ (S)eat Capacity \\ (F)uel Economy \\ (C)argo Volume \\ (Q)uit?"
            );
            
            System.out.println("Enter Your Choice: ");
            choice = input.next();
            
            // Continue if user does not quit
            if (!choice.equalsIgnoreCase("Q"))
            {
                // Ask user to choose vehicle
                System.out.println("Enter Vehicle Number (1, 2, 3): ");
                vNum = input.nextInt();
                
                // Assign selected vehicle
                switch (vNum)
                {
                    case 1: v = v1; break;
                    case 2: v = v2; break;
                    case 3: v = v3; break;
                    
                    // Note: no default case (invalid input not handled)
                }
                
                // DRIVE MODE
                if (choice.equalsIgnoreCase("D"))
                {
                    // Inner loop for vehicle actions
                    do
                    {
                        System.out.println(
                            "Do You Want to (D)rive, (S)top, (H)onk, or (T)urn Off Engine?"
                        );
                        
                        System.out.println("Enter Your Choice: ");
                        action = input.next();
                        
                        // HONK action
                        if (action.equalsIgnoreCase("H"))
                        {
                            System.out.println(v.honk());
                        }
                        
                        // DRIVE action
                        else if (action.equalsIgnoreCase("D"))
                        {
                            System.out.println(v.drive());
                        }
                        
                        // STOP action
                        else if (action.equalsIgnoreCase("S"))
                        {
                            System.out.println(v.stop());
                        }
                        
                    } 
                    while(!action.equalsIgnoreCase("T")); // Exit inner loop
                }
                
                // NAME AND PRICE option
                else if (choice.equalsIgnoreCase("N"))
                {
                    System.out.println(v.toString());
                }
                
                // SEAT CAPACITY option
                else if (choice.equalsIgnoreCase("S"))
                {
                    System.out.println(v.getSeatCap());
                }
                
                // FUEL ECONOMY option
                else if (choice.equalsIgnoreCase("F"))
                {
                    System.out.println(v.getFuelEco());
                }
                
                // CARGO VOLUME option
                else if (choice.equalsIgnoreCase("C"))
                {
                    System.out.println(v.getCarVol());        
                }
            }
        } 
        while(!choice.equalsIgnoreCase("Q")); // Exit program loop
        
        // Exit message
        System.out.print("Goodbye!");
        
        // Note: Scanner not closed (acceptable in simple console programs)
    }
}