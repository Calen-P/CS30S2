package Skillbuilders;
import java.io.File;                 // Represents a file
import java.io.FileInputStream;     // Reads raw bytes from a file
import java.io.FileNotFoundException; // Handles missing file errors
import java.io.FileOutputStream;    // Writes raw bytes to a file
import java.io.IOException;         // Handles input/output errors
import java.io.ObjectInputStream;   // Reads objects from a file
import java.io.ObjectOutputStream;  // Writes objects to a file
import java.util.Scanner;           // Gets user input

public class Roster {

	public static void main(String[] args)
	{
		File stuNameFile;                          // File where student objects will be stored
		Scanner userInput = new Scanner(System.in); // Reads user input
		
		String fileName;        // Name of the file
		String firstName, lastName; // Student name parts
		int numStudent;         // Number of students to input
		
		// =======================
		// Get file name and number of students
		// =======================
		
		System.out.println("Enter the File Name: ");
		fileName = userInput.nextLine(); // Reads full line (good for spaces)
		
		stuNameFile = new File(fileName); // Create file object
		
		System.out.println("Enter Number of Students: ");
		numStudent = userInput.nextInt();
		
		try
		{
			// =======================
			// Write objects to the file
			// =======================
			
			FileOutputStream out = new FileOutputStream(stuNameFile); // Byte stream to file
			ObjectOutputStream writeStu = new ObjectOutputStream(out); // Object stream
			
			// Loop to collect student data
			for (int i = 0; i < numStudent; i++)
			{
				System.out.println("Enter Student First Name: ");
				firstName = userInput.next();
				
				System.out.println("Enter Student Last Name: ");
				lastName = userInput.next();
				
				// Create a StuName object and write it to the file
				// This is called "serialization"
				writeStu.writeObject(new StuName(firstName, lastName));
			}
			
			// Close the output stream
			writeStu.close();
			System.out.println("Data Has Been Written to File");
			
			// =======================
			// Read objects from the file
			// =======================
			
			FileInputStream in = new FileInputStream(stuNameFile); // Byte input stream
			ObjectInputStream readStuName = new ObjectInputStream(in); // Object input stream
			
			// Read the same number of objects back
			for (int i = 0; i < numStudent; i++)
			{
				// Read object, cast it back to StuName, and print it
				System.out.println((StuName)readStuName.readObject());
			}
			
			// Close input stream
			readStuName.close();
		}
		
		catch (FileNotFoundException e) 
		{
			// Runs if the file cannot be found or created
			System.out.println("File Does not Exist.");
			System.err.println("IOException: " + e.getMessage());
		}
		
		catch (IOException e) 
		{
			// Runs if there is a problem writing/reading the file
			System.out.println("File Could Not Be Created.");
			System.err.println("IOException: " + e.getMessage());
		}
		
		catch (ClassNotFoundException e)
		{
			// Runs if Java can't recognize the class when reading objects
			System.out.println("Class could not be used to cast object.");
			System.err.println("ClassNotFoundException: " + e.getMessage());
		}
	}

}