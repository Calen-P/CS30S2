import java.io.File;        // Lets us create, delete, and check files
import java.io.IOException; // Needed to handle errors when creating a file
import java.util.Scanner;  // Lets us get input from the user

public class MyFileP2 {

	public static void main(String[] args)
	{
		File textFile;                          // Represents the file we are working with
		Scanner input = new Scanner(System.in); // Scanner to read user input
		String response;                        // Stores the user's choice (Keep/Delete)
		
		// Create a File object pointing to a specific path
		// Note: This is a relative path (depends on where your program is running)
		textFile = new File("../Chapter11/src/Test");
		
		// Check if the file already exists
		if(textFile.exists())
		{
			System.out.println("Test.txt file exists.");
		}
		else
		{
			try
			{
				// Attempt to create the file if it does not exist
				textFile.createNewFile();
				System.out.println("Test.txt file has been created.");
			}
			catch (IOException e) 
			{
				// Runs if an error occurs while creating the file
				System.out.println("File could not be created.");
    			System.err.println("IOException: " + e.getMessage()); // Shows error details
    		}
		}
		
		// Ask the user whether they want to keep or delete the file
		System.out.println("Would you like to (K)eep or (D)elete the file?");
		response = input.next();  // Read the user's response
		
		// Check if the user chose to delete (case-insensitive)
		if(response.equalsIgnoreCase("D"))
		{
			// Attempt to delete the file
			if(textFile.delete())
			{
				System.out.println("File has been deleted."); // Only prints if deletion worked
			}
		}
		else
		{
			// If user chooses anything other than "D", we keep the file
			System.out.println("File is kept and stays the same");
		}
	}

}