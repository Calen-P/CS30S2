package Account;

import java.text.NumberFormat;

public class PersonalAcct extends Account
{
	NumberFormat money = NumberFormat.getCurrencyInstance();
	
	public PersonalAcct(double bal, String fName, String lName, String s, String c, String p, String pCode)
	{
		super(bal, fName, lName, s, c, p, pCode);
	}
	
	void test(double amt)
	{
		double balance;
		
		balance = super.getBalance();
		
	 	if (amt <= balance)
	 	{
	 		super.withdrawel(amt);
	 		
	 		if (super.getBalance() < 100)
	 		{
	 			super.withdrawel(2);
	 			System.out.println("Your Account Has Gone Below the Minimum, and $2 Have Been Charged.");
	 		}
	 		
	 		System.out.println("Your Balance is Now: " + money.format(super.getBalance()));
	 	}
	 	
	 	else
	 	{
	 		System.out.println("Not enough money in account.");
	 	}
	}
}
