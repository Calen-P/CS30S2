package Skillbuilders;
import java.io.BufferedReader;     // Reads text from a file efficiently (line by line)
import java.io.BufferedWriter;     // Writes text to a file efficiently
import java.io.File;              // Represents a file
import java.io.FileReader;        // Reads characters from a file
import java.io.FileWriter;        // Writes characters to a file
import java.io.IOException;       // Handles input/output errors
import java.text.NumberFormat;    // Formats numbers (like percentages)
import java.util.Scanner;         // Gets user input

public class Stats2 {

	public static void main(String[] args)
	{
		File dataFile;              // Represents the file
		FileReader in;              // For reading file
		BufferedReader readFile;    // For reading lines from file
		NumberFormat percent = NumberFormat.getPercentInstance(); // Formats output as %
		FileWriter out;             // For writing to file
		BufferedWriter writeFile;   // For writing lines to file
		
		Scanner userinput = new Scanner(System.in); // Reads user input
		
		String fileName, studentName, score; // Stores user input data
		int numStudent; // Number of students to input
		
		double scoreValue;      // Score converted to number
		double lowScore = 100;  // Start with highest possible low
		double highScore = 0;   // Start with lowest possible high
		double avgScore;        // Will store average
		double totalScore = 0;  // Sum of scores
		
		int numScore = 0;       // Counts how many scores are processed
		
		// Ask user for file name
		System.out.println("Enter the File Name: ");
		fileName = userinput.next();
		
		// Ask user how many students they want to enter
		System.out.println("Enter Number of Students: ");
		numStudent = userinput.nextInt();
		
		try
		{
			// Create file and prepare to write to it
			dataFile = new File(fileName);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			// Loop to collect student data
			for (int i = 0; i < numStudent; i++)
			{
				System.out.println("Enter Student Name: ");
				studentName = userinput.next(); // Reads one word
				
				System.out.println("Enter Test Score: ");
				score = userinput.next(); // Reads score as text
				
				// Write name and score to file (each on its own line)
				writeFile.write(studentName);
				writeFile.newLine();
				writeFile.write(score);
				writeFile.newLine();
			}
			
			// Close writing streams (VERY important)
			writeFile.close();
			out.close();
			
			System.out.println("Data Written to File");
		}
		
		catch (IOException e) 
		{
			// Runs if file cannot be written
			System.out.println("File Does Not Exist.");
			System.err.println("IOException: " + e.getMessage());
		}
		
		// =======================
		// Read data from file and process it
		// =======================
		
		try
		{
			// Open file for reading
			dataFile = new File(fileName);
			in  = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			// Read file line by line
			// Each loop reads: student name + score
			while((studentName = readFile.readLine()) != null)
			{
				score = readFile.readLine(); // Next line is the score
				
				// Display what was read
				System.out.println(studentName + " " + score);
				
				numScore += 1; // Count scores
				
				// Convert score from String to double
				scoreValue = Double.parseDouble(score);
				
				// Add to total
				totalScore += scoreValue;
				
				// Update lowest score if needed
				if (scoreValue < lowScore)
				{
					lowScore = scoreValue;
				}
				
				// Update highest score if needed
				if (scoreValue > highScore)
				{
					highScore = scoreValue;
				}
			}
			
			// Calculate average
			avgScore = totalScore / numScore;
			
			// Display results as percentages
			System.out.println("Low score = " + percent.format(lowScore/100));
			System.out.println("High score = " + percent.format(highScore/100));
			System.out.println("Average = " + percent.format(avgScore/100));
			
			// Close reading streams
			readFile.close();
			in.close();
		}
		
		catch (IOException e) 
		{
			// Runs if file cannot be read
			System.out.println("File could not be created.");
			System.err.println("IOException: " + e.getMessage());
		}
	}

}