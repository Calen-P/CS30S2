package Account;

import java.text.NumberFormat;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args)
	{
		NumberFormat money = NumberFormat.getCurrencyInstance();
		Scanner input = new Scanner(System.in);
		
		String choice, firstName, lastName, street, city, province, postalCode;
		double balance;
		
		Account acct;
		
		do
		{
			System.out.println("Please Select (M)ake an Account, (B)alance, (W)ithdraw, (D)eposit, (C)hange Address, or (Q)uit: ");
			choice = input.next();
			
			if (choice.equalsIgnoreCase("M"))
			{
				System.out.println("Do You Want to Make a (P)ersonal or (B)usiness Account: ");
				choice = input.next();
				
				System.out.print("Enter Balance: ");
				balance = input.nextDouble();
				
				System.out.print("Enter First Name: ");
				firstName = input.next();
				
				System.out.print("Enter Last Name: ");
				lastName = input.next();
				
				System.out.print("Enter Street: ");
				street = input.next();
				
				System.out.print("Enter City: ");
				city = input.next();
				
				System.out.print("Enter Province: ");
				province = input.next();
				
				System.out.print("Enter Postal Code: ");
				postalCode = input.next();
				
				if (choice.equalsIgnoreCase("P"))
				{
					PersonalAcct newPAcct = new PersonalAcct(balance, firstName, lastName, street, city, province, postalCode);
				}
			}
			
			else if (!choice.equalsIgnoreCase("M") || !choice.equalsIgnoreCase("Q"))
			{
				System.out.println("Temporary");
			}
			
		} while (!choice.equalsIgnoreCase("Q"));
		
		System.out.println("Have a Nice Day!");
	}

}
