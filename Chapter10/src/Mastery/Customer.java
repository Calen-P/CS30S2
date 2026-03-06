/*

Program: Customer.java         Last Date of this Revision: March 06, 2026

Purpose: This class represents a bank customer.
Each customer has a first name and a last name.
The class stores the customer's basic identifying information
and provides a method to return the customer's name as a string.

Author: Calen Plana
School: CHHS
Course: Computer Programming CS30
 

*/

package Mastery;

/**
 * Customer
 * 
 * 
 * 
 * Author: [Your Name]
 * Course: CS30
 */
public class Customer 
{
	/** Customer's first name */
	private String firstName;

	/** Customer's last name */
	private String lastName;
		
	
	/**
	 * Constructor
	 * 
	 * Creates a Customer object with a first and last name.
	 * 
	 * Precondition: none
	 * Postcondition: A Customer object is created with the
	 * provided first and last names.
	 */
	public Customer(String fName, String lName) 
	{
		firstName = fName;
		lastName = lName;
	}
	

	/**
	 * Returns a string representation of the Customer object.
	 * 
	 * Precondition: none
	 * Postcondition: A string containing the customer's
	 * full name has been returned.
	 * 
	 * @return String containing the customer's first and last name
	 */
	public String toString() 
	{
		String custString;

		// Format the customer's full name
		custString = " " + firstName + " " + lastName + " ";  

		return(custString);
	}
}
