package Skillbuilders;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment {

	public static void main(String[] args)
	{
		File textFile;
		FileReader in;
		BufferedReader readFile;
		textFile = new File("../Chapter11/src/Instructions");
		
		String message;
		
		try
		{
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			
			while ((message = readFile.readLine()) != null)
			{
				System.out.println(message);
				message = readFile.readLine();
				System.out.println(message);
			}
			
			readFile.close();
			in.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File does not exist.");
			System.err.println("fileNotFoundException: " + e.getMessage());
		}
		catch (IOException e) 
		{
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
		}
		
	}

}
