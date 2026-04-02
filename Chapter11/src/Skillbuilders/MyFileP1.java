package Skillbuilders;
import java.io.File;        // Allows us to work with files (like checking if they exist)
import java.util.Scanner;  // Allows us to get input from the user

public class MyFileP1
{
	public static void main(String[] args) 
	{
		File textFile;              // This will represent the file the user enters
		String fileName;            // Stores the name of the file as text
		Scanner input = new Scanner(System.in);  // Scanner object to read user input
		
		// Ask the user to enter a file name
		System.out.println("Enter the file name: ");
		fileName = input.next();   // Reads the next word typed by the user
		
		// Create a File object using the name the user entered
		textFile = new File(fileName);
		
		// Check if the file actually exists on the computer
		if(textFile.exists())
		{
			System.out.println("File exists.");  // Runs if the file is found
		}
		else
		{
			System.out.println("File does not exists.");  // Runs if the file is NOT found
		}
	}
}