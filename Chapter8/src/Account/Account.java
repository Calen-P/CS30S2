package Account;

/**
 * Abstract Account class representing a generic bank account.
 * 
 * Responsibilities:
 * - Stores account balance, customer information, and account ID
 * - Provides common operations such as deposit, withdrawal, and formatting
 * 
 * Note:
 * - This class is abstract and must be extended by specific account types
 */
 
import java.text.NumberFormat;

public abstract class Account {
    
    /** Current balance of the account */
    private double balance;
    
    /** Customer associated with this account */
    private Customer cust;
    
    /** Unique account ID */
    private String acctID;
    
    /**
     * Full constructor
     * 
     * Initializes account with balance and full customer information.
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
     * post: Account is created with initialized balance and customer data
     */
    public Account(double bal, String fName, String lName, String s, String c, String p, String pCode)
    {
        // Initialize account balance
        balance = bal;
        
        // Create new Customer object with full address details
        cust = new Customer(fName, lName, s, c, p, pCode);
        
        // Generate account ID using first initial and last name
        acctID = fName.substring(0,1) + lName;
    }
    

    /**
     * Constructor with account ID only
     * 
     * Creates an empty account with no customer details.
     * 
     * @param ID Account ID
     * 
     * pre: none  
     * post: Account is created with zero balance and empty customer data
     */
    public Account(String ID) {
        balance = 0;
        
        // Initialize empty customer object
        cust = new Customer("", "", "", "", "", "");
        
        // Assign provided account ID
        acctID = ID;
    }


    /** 
     * Gets the account ID.
     * 
     * @return account ID
     * 
     * pre: none  
     * post: Account ID is returned
     */
    public String getID() {
        return(acctID);
    }


    /** 
     * Gets the current balance.
     * 
     * @return current balance
     * 
     * pre: none  
     * post: Balance is returned
     */
    public double getBalance() {
        return(balance);
    }


    /** 
     * Deposits money into the account.
     * 
     * @param amt Amount to deposit
     * 
     * pre: amt >= 0 (not enforced in code)  
     * post: Balance is increased by amt
     */
    public void deposit(double amt) {
        balance += amt;
    }

    
    /** 
     * Withdraws money from the account.
     * 
     * Note:
     * - No validation is performed to check sufficient funds.
     * 
     * @param amt Amount to withdraw
     * 
     * pre: amt >= 0 (not enforced)  
     * post: Balance is decreased by amt
     */
    public void withdrawel(double amt) {
        balance -= amt;
    }
    
    /**
     * Abstract test method.
     * 
     * Must be implemented by subclasses to define account-specific behavior.
     * 
     * @param amt Amount used in test
     */
    abstract void test(double amt);
    

    /**
     * Updates the customer's address.
     * 
     * Delegates changes to the Customer object.
     * 
     * @param s New street
     * @param c New city
     * @param p New province/state
     * @param pCode New postal/ZIP code
     * 
     * pre: none  
     * post: Customer address fields are updated
     */
    public void changeAddress(String s, String c, String p, String pCode)
    {
        cust.changeStreet(s);
        cust.changeCity(c);
        cust.changeProvince(p);
        cust.changePostalCode(pCode);
    }

    /** 
     * Compares this account with another object.
     * 
     * @param acct Object to compare
     * @return true if account IDs match, false otherwise
     * 
     * pre: acct is an Account object (not checked explicitly)  
     * post: Returns comparison result
     */
    public boolean equals(Object acct) {
        
        // Cast object to Account (assumes correct type)
        Account testAcct = (Account)acct;
        
        // Compare account IDs
        if (acctID.equals(testAcct.acctID)) {
            return(true);
        } else {
            return(false);
        }
    }


    /** 
     * Returns a string representation of the account.
     * 
     * Includes:
     * - Account ID
     * - Customer details
     * - Formatted balance
     * 
     * @return formatted account information
     * 
     * pre: none  
     * post: String representation is returned
     */
    public String toString() {
        String accountString;
        
        // Formatter for currency display
        NumberFormat money = NumberFormat.getCurrencyInstance();

        // Build account string
        accountString = acctID + "\n";
        accountString += cust.toString();
        accountString += "Current balance is " + money.format(balance);
        
        return(accountString);
    }
}