import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.NumberFormat;

public class Stats2 {

	public static void main(String[] args)
	{
		File dataFile = new File("../Chapter11/src/StudentList");
		FileReader in;
		FileWriter out;
		BufferedWriter writeFile;
		Scanner input = new Scanner(System.in);
		double score;
		int number;
		String name, response;
		
		System.out.println("Would you like to make a new file (y/n)?");
		response = input.next();
		
		if(response.equalsIgnoreCase("Y") && dataFile.exists())
		{
			System.out.println("StudentList.txt file exists. Would you like to Delete it (y/n)?");
			response = input.next();
			
			if(response.equalsIgnoreCase("Y"))
			{
				if(dataFile.delete())
				{
					System.out.println("File has been deleted");
				}
				
				else
				{
					System.out.println("This Failed");
				}
			}
			else
			{
				System.out.println("File is kept and stays the same.");
			}
		}
			
		else
		{
			try
			{
				dataFile.createNewFile();
				System.out.println("Test.txt file has been created.");
			}
			catch (IOException e) 
			{
				System.out.println("File could not be created.");
    			System.err.println("IOException: " + e.getMessage());
    		}
		}
		
		try
		{
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			System.out.println("How many entries would you like to enter?");
			number = input.nextInt();
			
			for (int i = 0; i <= number; i++)
			{
				System.out.println("Enter Student Name: ");
				name = input.next();
				
				System.out.println("Enter Test Score: ");
				score = input.nextDouble();
				writeFile.write(name);
				writeFile.newLine();
				writeFile.write(String.valueOf(score));
				writeFile.newLine();
			}
			System.out.println("Data Written to File");
			writeFile.close();
			out.close();
		}
		
		catch (IOException e)
		{
			System.out.println("Problem Writing to File.");
			System.err.println("IOException: " + e.getMessage());
		}
	}
}
