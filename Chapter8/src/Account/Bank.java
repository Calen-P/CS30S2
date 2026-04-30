package Account;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Bank class containing the main method.
 * 
 * Simulates basic banking operations for Personal and Business accounts.
 * Allows user to:
 * - View balance
 * - Withdraw money
 * - Deposit money
 * - Change address
 */
public class Bank {

    /**
     * Main method - program entry point.
     * 
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        // Create a personal account with initial balance and customer info
        PersonalAcct acct1 = new PersonalAcct(
            100, "Calen", "Plana", "1", "Calgary", "Alberta", "A1B 2C3"
        );
        
        // Create a business account with initial balance and customer info
        BusinessAcct acct2 = new BusinessAcct(
            500, "Calen", "Plana", "6", "Edmonton", "Alberta", "E4F 5G6"
        );
        
        // Formatter for displaying currency values
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        // Scanner for user input
        Scanner input = new Scanner(System.in);
        
        // Variable declarations
        String choice;        // User menu choice (B, W, D, C, Q)
        String street;        // New street input
        String city;          // New city input
        String province;      // New province input
        String postalCode;    // New postal code input
        
        int select;           // Account selection (1 or 2)
        double amount;        // Amount for deposit/withdraw
        
        // Default account selection (personal account)
        Account acct = acct1;
        
        // Main program loop - continues until user chooses to quit
        do
        {
            // Display menu options
            System.out.println(
                "Please Select (B)alance, (W)ithdraw, (D)eposit, (C)hange Address, or (Q)uit: "
            );
            
            // Read user choice
            choice = input.next();
            
            // Continue only if user does not choose to quit
            if (!choice.equalsIgnoreCase("Q"))
            {
                // Ask user to select account type
                System.out.println(
                    "Please Select '1' for Personal Account or '2' for Business Account: "
                );
                
                select = input.nextInt();
                
                // Switch account based on user selection
                switch (select)
                {
                    case 1: 
                        acct = acct1; 
                        break;
                        
                    case 2: 
                        acct = acct2; 
                        break;
                        
                    // Note: no default case (invalid input not handled)
                }
                
                // BALANCE OPTION
                if (choice.equalsIgnoreCase("B"))
                {
                    // Display account information
                    System.out.println(acct.toString());
                }
                
                // WITHDRAW OPTION
                else if (choice.equalsIgnoreCase("W"))
                {
                    // Prompt for withdrawal amount
                    System.out.println("Enter Amount You Would Like to Withdraw: ");
                    
                    amount = input.nextDouble();
                    
                    // Calls abstract test method (implemented in subclasses)
                    acct.test(amount);
                }
                
                // DEPOSIT OPTION
                else if (choice.equalsIgnoreCase("D"))
                {
                    // Prompt for deposit amount
                    System.out.println("Enter Amount You Would Like to Deposit: ");
                    
                    amount = input.nextDouble();
                    
                    // Perform deposit
                    acct.deposit(amount);
                    
                    // Display updated balance
                    System.out.println(
                        "Your Balance is Now: " + money.format(acct.getBalance())
                    );
                }
                
                // CHANGE ADDRESS OPTION
                else if (choice.equalsIgnoreCase("C"))
                {
                    // Prompt for new address fields
                    System.out.println("Please Enter Your New Street: ");
                    street = input.next();
                    
                    System.out.println("Please Enter Your New City: ");
                    city = input.next();
                    
                    System.out.println("Please Enter Your New Province: ");
                    province = input.next();
                    
                    System.out.println("Please Enter Your New Postal Code: ");
                    postalCode = input.next();
                    
                    // Update address via Account method
                    acct.changeAddress(street, city, province, postalCode);
                    
                    // Display updated account info
                    System.out.println(
                        "Your Account Information is Now: " + acct.toString()
                    );
                }
            }
            
        } while (!choice.equalsIgnoreCase("Q")); // Loop until user quits
        
        // Exit message
        System.out.println("Have a Nice Day!");
        
        // Note: Scanner is not closed (common in simple console programs)
    }
}