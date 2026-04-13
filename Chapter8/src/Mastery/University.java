package Mastery;

import java.text.NumberFormat;
import java.util.Scanner;

public class University {

	public static void main(String[] args)
	{
		Faculty emp1 = new Faculty("Henry", 110000, "Professor");
		Faculty emp2 = new Faculty("Tony", 90000, "Associate Professor");
		Staff emp3 = new Staff("Jennifer", 80000, "IT Support");
		Staff emp4 = new Staff("Allan", 70000, "Secretary");
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		String choice;
		int empNum;
		UEmployee emp = emp1;
		
		Scanner input = new Scanner(System.in);
		
		do
		{
			System.out.println("Please Pick (E)mployee, (S)alary, or (Q)uit: ");
			
			choice = input.next();
			
			if (!choice.equalsIgnoreCase("Q"))
			{
				System.out.println("Enter Employee Number (1, 2, 3, 4): ");
				
				empNum = input.nextInt();
				
				switch (empNum)
				{
					case 1: emp = emp1; break;
					case 2: emp = emp2; break;
					case 3: emp = emp3; break;
					case 4: emp = emp4; break;
				}
				
				if (choice.equalsIgnoreCase("E"))
				{
					System.out.println(emp);
				}
				
				else if (choice.equalsIgnoreCase("S"))
				{
					System.out.println(money.format(emp.getSalary()));
				}
			}
		} while (!choice.equalsIgnoreCase("Q"));
		
		System.out.println("Goodbye!");
	}
}
