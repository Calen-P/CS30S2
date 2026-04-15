package Vehicle;

import java.util.Scanner;

public class Drive {

	public static void main(String[] args)
	{
		Car v1 = new Car("Mazda 5", 36300);
		Truck v2 = new Truck("Ford F-150", 70995);
		Minivan v3 = new Minivan("Toyota Sienna", 49370);
		
		Scanner input = new Scanner(System.in);
		
		String choice, action;
		int vNum;
		
		Vehicle v = v1;
		
		do
		{
			System.out.println("Do You Want to (D)rive, Retrieve (I)nformation, or (Q)uit?");
			System.out.println("Enter Your Choice: ");
			choice = input.next();
			
			if (!choice.equalsIgnoreCase("Q"))
			{
				System.out.println("Enter Vehicle Number (1, 2, 3): ");
				
				vNum = input.nextInt();
				
				switch (vNum)
				{
					case 1: v = v1; break;
					case 2: v = v2; break;
					case 3: v = v3; break;
				}
				
				if (choice.equalsIgnoreCase("D"))
				{
					do
					{
						
					} while(!action.equalsIgnoreCase("S"));
				}
			}
		} while(!choice.equalsIgnoreCase("Q"));
	}
}
