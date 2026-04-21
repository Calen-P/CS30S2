package Account;

import java.text.NumberFormat;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args)
	{
		PersonalAcct acct1 = new PersonalAcct(100, "Calen", "Plana", "1", "Calgary", "Alberta", "A1B 2C3");
		BusinessAcct acct2 = new BusinessAcct(500, "Calen", "Plana", "1", "Calgary", "Alberta", "A1B 2C3");
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		Scanner input = new Scanner(System.in);
		
		String choice, street, city, province, postalCode;
		String ID;
		int select;
		double amount;
		
		Account acct = acct1;
		
		do
		{
			System.out.println("Please Select (B)alance, (W)ithdraw, (D)eposit, (C)hange Address, or (Q)uit: ");
			choice = input.next();
			
			if (!choice.equalsIgnoreCase("Q"))
			{
				System.out.println("Please Select '1' for Personal Account or '2' for Business Account: ");
				select = input.nextInt();
				
				switch (select)
				{
					case 1: acct = acct1; break;
					case 2: acct = acct2; break;
				}
				
				if (choice.equalsIgnoreCase("B"))
				{
					System.out.println(acct.toString());
				}
				
				else if (choice.equalsIgnoreCase("W"))
				{
					System.out.println("Enter Amount You Would Like to Withdraw: ");
					amount = input.nextDouble();
					acct.withdrawal(amount);
				}
				
				else if (choice.equalsIgnoreCase("D"))
				{
					System.out.println("Enter Amount You Would Like to Deposit: ");
					amount = input.nextDouble();
					acct.deposit(amount);
				}
				
				else if (choice.equalsIgnoreCase("C"))
				{
					System.out.println("Please Enter Your New Street: ");
					street = input.next();
					
					System.out.println("Please Enter Your New City: ");
					city = input.next();
					
					System.out.println("Please Enter Your New Province: ");
					province = input.next();
					
					System.out.println("Please Enter Your New Postal Code: ");
					postalCode = input.next();
					
					acct.changeAddress(street, city, province, postalCode);
					System.out.println("Your Account Information is Now: " + acct.toString());
				}
			}
			
		} while (!choice.equalsIgnoreCase("Q"));
		
		System.out.println("Have a Nice Day!");
	}

}
