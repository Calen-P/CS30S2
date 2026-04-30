package UEmployee;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * University class.
 * 
 * Simulates a simple employee system that allows the user to:
 * - View employee information
 * - View employee salary
 * 
 * Works with Faculty and Staff objects through polymorphism
 * using the UEmployee superclass.
 */
public class University {

    /**
     * Main method - program entry point.
     * 
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        // Create Faculty employee objects
        Faculty emp1 = new Faculty("Henry Cavil", 110000, "Professor");
        Faculty emp2 = new Faculty("Tony Stark", 90000, "Associate Professor");
        
        // Create Staff employee objects
        Staff emp3 = new Staff("Jennifer Lopez", 80000, "IT Support");
        Staff emp4 = new Staff("Sarah Lance", 70000, "Secretary");
        
        // Formatter for displaying salary as currency
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        // Variables for user input
        String choice;   // Menu choice (E, S, Q)
        int empNum;      // Employee selection (1–4)
        
        // Default selected employee
        UEmployee emp = emp1;
        
        // Scanner for reading user input
        Scanner input = new Scanner(System.in);
        
        // Main program loop (runs until user quits)
        do
        {
            // Display menu options
            System.out.println("Please Pick (E)mployee, (S)alary, or (Q)uit: ");
            
            // Read user choice
            choice = input.next();
            
            // Continue if user does not choose to quit
            if (!choice.equalsIgnoreCase("Q"))
            {
                // Prompt for employee selection
                System.out.println("Enter Employee Number (1, 2, 3, 4): ");
                
                empNum = input.nextInt();
                
                // Select employee based on user input
                switch (empNum)
                {
                    case 1: emp = emp1; break;
                    case 2: emp = emp2; break;
                    case 3: emp = emp3; break;
                    case 4: emp = emp4; break;
                    
                    // Note: no default case (invalid input not handled)
                }
                
                // EMPLOYEE INFO OPTION
                if (choice.equalsIgnoreCase("E"))
                {
                    // Print employee details (calls toString())
                    System.out.println(emp);
                }
                
                // SALARY OPTION
                else if (choice.equalsIgnoreCase("S"))
                {
                    // Print formatted salary
                    System.out.println(money.format(emp.getSalary()));
                }
            }
        } 
        while (!choice.equalsIgnoreCase("Q")); // Loop until user quits
        
        // Exit message
        System.out.println("Goodbye!");
        
        // Note: Scanner not closed (acceptable in simple programs)
    }
}