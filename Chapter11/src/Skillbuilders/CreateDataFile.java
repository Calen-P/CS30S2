package Skillbuilders;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateDataFile {

	public static void main(String[] args)
	{
		File dataFile = new File("../Chapter11/src/Test3");
		FileWriter out;
		BufferedWriter writeFile;
		Scanner input = new Scanner(System.in);
		double score;
		String name;
		
		try
		{
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			for (int i = 0; i < 5; i++)
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
