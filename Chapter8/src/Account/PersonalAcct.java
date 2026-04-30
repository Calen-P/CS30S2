package Account;

import java.text.NumberFormat;

/**
 * PersonalAcct class.
 * 
 * Represents a personal bank account with:
 * - Minimum balance requirement
 * - Withdrawal validation
 * - Fee applied when balance drops below threshold
 * 
 * Inherits from Account class.
 */
public class PersonalAcct extends Account
{
    /** Formatter for displaying currency values */
    NumberFormat money = NumberFormat.getCurrencyInstance();
    
    /**
     * Constructor
     * 
     * Initializes a Personal Account with balance and customer details.
     * 
     * @param bal Initial balance
     * @param fName Customer first name
     * @param lName Customer last name
     * @param s Street address
     * @param c City
     * @param p Province/State
     * @param pCode Postal/ZIP code
     * 
     * pre: none  
     * post: Personal account is created and initialized
     */
    public PersonalAcct(double bal, String fName, String lName, String s, String c, String p, String pCode)
    {
        // Call superclass constructor
        super(bal, fName, lName, s, c, p, pCode);
    }
    
    /**
     * Test method (implementation of abstract method from Account).
     * 
     * Handles withdrawal logic specific to personal accounts:
     * - Checks if sufficient funds exist
     * - Applies withdrawal
     * - Applies fee if balance falls below minimum threshold
     * 
     * @param amt Amount to withdraw
     * 
     * pre: amt >= 0 (not enforced)  
     * post:
     * - Balance reduced if sufficient funds
     * - Fee applied if balance < 100
     * - Updated balance displayed
     */
    void test(double amt)
    {
        double balance;
        
        // Retrieve current balance from superclass
        balance = super.getBalance();
        
        // Check if sufficient funds exist
        if (amt <= balance)
        {
            // Perform withdrawal
            super.withdrawel(amt);
        }
        else
        {
            // Insufficient funds message
            System.out.println("Not enough money in account.");
        }
        
        // Check if balance falls below minimum threshold
        if (super.getBalance() < 100)
        {
            // Apply penalty fee
            super.withdrawel(2);
            
            // Notify user of fee
            System.out.println("Your Account Has Gone Below the Minimum, and $2 Have Been Charged.");
        }
        
        // Display updated balance
        System.out.println("Your Balance is Now: " + money.format(super.getBalance()));
    }
}