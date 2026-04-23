package Account;

import java.text.NumberFormat;

public class BusinessAcct extends Account
{
	NumberFormat money = NumberFormat.getCurrencyInstance();
	
	public BusinessAcct(double bal, String fName, String lName, String s, String c, String p, String pCode)
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
	 	}
		 	
	 	else
	 	{
	 		System.out.println("Not enough money in account.");
	 	}
	 	
	 	if (super.getBalance() < 500)
 		{
 			super.withdrawel(2);
 			System.out.println("Your Account Has Gone Below the Minimum, and $10 Have Been Charged.");
 		}
	 	
	 	System.out.println("Your Balance is Now: " + money.format(super.getBalance()));
	}
}
