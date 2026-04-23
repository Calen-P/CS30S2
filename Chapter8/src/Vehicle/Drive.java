package Vehicle;

import java.util.Scanner;

public class Drive {

	public static void main(String[] args)
	{
		Car v1 = new Car("Mazda 5", 36300, 21, 28, 6, "5.58-44.4");
		Truck v2 = new Truck("Ford F-150", 70995, 20, 21, 3, "52.8 to 77.4");
		Minivan v3 = new Minivan("Toyota Sienna", 49370, 32, 36, 8, "33.5-75.2");
		
		Scanner input = new Scanner(System.in);
		
		String choice, action = null;
		int vNum;
		
		Vehicle v = v1;
		
		do
		{
			System.out.println("(D)rive \\ (N)ame and Price \\ (S)eat Capacity \\ (F)uel Economy \\ (C)argo Volume \\ (Q)uit?");
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
						System.out.println("Do You Want to (D)rive, (S)top, (H)onk, or (T)urn Off Engine?");
						System.out.println("Enter Your Choice: ");
						action = input.next();
						
						if (action.equalsIgnoreCase("H"))
						{
							System.out.println(v.honk());
						}
						
						else if (action.equalsIgnoreCase("D"))
						{
							System.out.println(v.drive());
						}
						
						else if (action.equalsIgnoreCase("S"))
						{
							System.out.println(v.stop());
						}
						
					} while(!action.equalsIgnoreCase("T"));
				}
				
				else if (choice.equalsIgnoreCase("N"))
				{
					System.out.println(v.toString());
				}
				
				else if (choice.equalsIgnoreCase("S"))
				{
					System.out.println(v.getSeatCap());
				}
				
				else if (choice.equalsIgnoreCase("F"))
				{
					System.out.println(v.getFuelEco());
				}
				
				else if (choice.equalsIgnoreCase("C"))
				{
					System.out.println(v.getCarVol());		
				}
			}
		} while(!choice.equalsIgnoreCase("Q"));
		System.out.print("Goodbye!");
	}
}
