/*

Program: Bank.java         Last Date of this Revision: March 06, 2026

Purpose: This class manages a collection of bank accounts.
It allows accounts to be created, deleted, and modified through
deposits and withdrawals. It also allows users to check balances.
Accounts are stored in an ArrayList and searched using the
account ID.

Author: Calen Plana
School: CHHS
Course: Computer Programming CS30
 

*/

package Mastery;

import java.util.ArrayList;

public class Bank 
{
	/**
	 * List containing all bank accounts.
	 */
	private ArrayList accounts;
		
	
	
	/**
	 * Constructor Method
	 * 
	 * Initializes the bank with an empty list of accounts.
	 */
	public Bank()
	{
		accounts = new ArrayList();
	}
	

	/** 
	 * Adds a new account to the bank.
	 * 
	 * Precondition: none
	 * Postcondition: A new account has been added to the bank's
	 * list of accounts.
	 * 
	 * @param fName Customer's first name
	 * @param lName Customer's last name
	 * @param balance Initial account balance
	 * @return The unique account ID for the newly created account
	 */
	public String addAccount(String fName, String lName, double balance) 
	{
		// Create a new account object
		Account newAcct = new Account(balance, fName, lName);

		// Add the account to the bank's account list
		accounts.add(newAcct);

		// Return the generated account ID
		return(newAcct.getID());
	}

	
	/** 
	 * Deletes an existing account.
	 * 
	 * Precondition: none
	 * Postcondition: If the account exists, it is removed from
	 * the list of accounts.
	 * 
	 * @param acctID The ID of the account to delete
	 * @return A message indicating whether the account was removed
	 */
	public String deleteAccount(String acctID) 
	{
		int acctIndex;
		Account acctToMatch;
		
		// Create temporary account object to search for matching ID
	 	acctToMatch = new Account(acctID);

	 	// Find the index of the account in the ArrayList
	 	acctIndex = accounts.indexOf(acctToMatch);

	 	// If the account exists, remove it
	 	if (acctIndex > -1) 
	 	{
	 		accounts.remove(acctIndex);
	 		return("Account removed.");
	 	} 

	 	// Otherwise the account was not found
	 	else 
	 	{
	 		return("Account does not exist.");
	 	}
	}
	
	
	/** 
	 * Performs a transaction on an existing account.
	 * 
	 * Transaction codes:
	 * 1 = Deposit
	 * 2 = Withdrawal
	 * 
	 * Precondition: transCode must be 1 or 2.
	 * Postcondition: The account balance has been updated.
	 * 
	 * @param transCode Type of transaction (1 = deposit, 2 = withdrawal)
	 * @param acctID Account ID to modify
	 * @param amt Amount to deposit or withdraw
	 * @return Updated account information or an error message
	 */
	public String transaction(int transCode, String acctID, double amt) 
	{
		int acctIndex;
		Account acctToMatch, acct;
		
		// Create temporary account object for searching
	 	acctToMatch = new Account(acctID);

	 	// Locate the account in the list
	 	acctIndex = accounts.indexOf(acctToMatch);

	 	if (acctIndex > -1) 
	 	{
	 		// Retrieve the account object
	 		acct = (Account)accounts.get(acctIndex);

	 		// Deposit transaction
	 		if (transCode == 1) 
	 		{
	 			acct.deposit(amt);

	 			// Replace with updated account
	 			accounts.set(acctIndex, acct);

	 			return(acct.toString());
	 		} 

	 		// Withdrawal transaction
	 		else if (transCode == 2) 
	 		{
	 			acct.withdrawal(amt);

	 			// Replace with updated account
	 			accounts.set(acctIndex, acct);
	 			
	 			// Check if withdrawal was successful
	 			if (acct.withdrawal(amt) == true)
	 			{
	 				return(acct.toString());
	 			}
	 			
	 			else
	 			{
	 				return("Not enough money in account.");
	 			}
	 		}
	 	}

	 	// Account not found
	 	return("Account does not exist.");
	}


	/** 
	 * Displays account information including current balance.
	 * 
	 * Precondition: none
	 * Postcondition: The account information has been returned
	 * if the account exists.
	 * 
	 * @param acctID Account ID to search for
	 * @return Account information or an error message
	 */
	public String checkBalance(String acctID) 
	{
		int acctIndex;
		Account acctToMatch, acct;
		
		// Create temporary account object for searching
	 	acctToMatch = new Account(acctID);

	 	// Find the account's position in the list
	 	acctIndex = accounts.indexOf(acctToMatch);

	 	if (acctIndex > -1) 
	 	{
	 		// Retrieve account information
	 		acct = (Account)accounts.get(acctIndex);

	 		return(acct.toString());
	 	} 

	 	// Account not found
	 	else 
	 	{
	 		return("Account does not exist.");
	 	}
	}
}
