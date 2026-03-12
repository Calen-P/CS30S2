import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Roster {

	public static void main(String[] args)
	{
		File stuNameFile;
		Scanner userInput = new Scanner(System.in);
		
		String fileName;
		String firstName, lastName;
		int numStudent;
		
		//Get the file name and number from the user
		
		System.out.println("Enter the File Name: ");
		fileName = userInput.nextLine();
		stuNameFile = new File(fileName);
		
		System.out.println("Enter Number of Students: ");
		numStudent = userInput.nextInt();
		
		try
		{
			//Write Objects to the File
			
			FileOutputStream out = new FileOutputStream(stuNameFile);
			ObjectOutputStream writeStu = new ObjectOutputStream(out);
			
			for (int i = 0; i < numStudent; i++)
			{
				System.out.println("Enter Student First Name: ");
				firstName = userInput.next();
				
				System.out.println("Enter Student Last Name: ");
				lastName = userInput.next();
				
				writeStu.writeObject(new StuName(firstName, lastName));
			}
			writeStu.close();
			System.out.println("Data Has Been Written to File");
			
			//Read and Display Objects
			
			FileInputStream in = new FileInputStream(stuNameFile);
			ObjectInputStream readStuName = new ObjectInputStream(in);
			
			for (int i = 0; i < numStudent; i++)
			{
				System.out.println((StuName)readStuName.readObject());
			}
			readStuName.close();
		}
		
		catch (FileNotFoundException e) 
		{
			System.out.println("File Does not Exist.");
			System.err.println("IOException: " + e.getMessage());
		}
		
		catch (IOException e) 
		{
			System.out.println("File Could Not Be Created.");
			System.err.println("IOException: " + e.getMessage());
		}
		
		catch (ClassNotFoundException e)
		{
			 System.out.println("Class could not be used to cast object.");
			 System.err.println("ClassNotFoundException: " + e.getMessage());
		}
	}

}
