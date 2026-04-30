package Account;

/**
 * Customer class.
 * 
 * Represents a bank customer with:
 * - Name information
 * - Address details (street, city, province, postal code)
 */
public class Customer {
    
    /** Customer first and last name */
    private String firstName, lastName;

    /** Customer address fields */
    private String city, street, province, postalCode;

    
    /**
     * Constructor
     * 
     * Initializes a Customer object with full name and address.
     * 
     * @param fName First name
     * @param lName Last name
     * @param s Street address
     * @param c City
     * @param p Province/State
     * @param pCode Postal/ZIP code
     * 
     * pre: none  
     * post: Customer object is created with initialized data
     */
    public Customer(String fName, String lName, String s, String c, String p, String pCode)
    {
        // Assign name values
        firstName = fName;
        lastName = lName;

        // Assign address values
        street = s;
        city = c;
        province = p;
        postalCode = pCode;
    }
    
    /**
     * Updates the customer's street address.
     * 
     * @param s New street
     * 
     * pre: none  
     * post: Street value is updated
     */
    public void changeStreet(String s)
    {
        street = s;
    }
    
    /**
     * Updates the customer's city.
     * 
     * @param c New city
     * 
     * pre: none  
     * post: City value is updated
     */
    public void changeCity(String c)
    {
        city = c;
    }

    /**
     * Updates the customer's province/state.
     * 
     * @param p New province/state
     * 
     * pre: none  
     * post: Province value is updated
     */
    public void changeProvince(String p)
    {
        province = p;
    }

    /**
     * Updates the customer's postal/ZIP code.
     * 
     * @param pCode New postal/ZIP code
     * 
     * pre: none  
     * post: Postal code value is updated
     */
    public void changePostalCode(String pCode)
    {
        postalCode = pCode;
    }


    /** 
     * Returns a String representation of the Customer object.
     * 
     * Includes:
     * - Full name
     * - Full address
     * 
     * @return formatted customer information
     * 
     * pre: none  
     * post: String representation is returned
     */
    public String toString() {
        String custString;

        // Combine all customer details into one formatted string
        custString = firstName + " " + lastName + " " 
                   + street + " " + city + " " 
                   + province + " " + postalCode + "\n";
        
        return(custString);
    }
}