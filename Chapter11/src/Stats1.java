import java.io.BufferedReader;     // Reads text efficiently (line by line)
import java.io.File;              // Represents a file
import java.io.FileNotFoundException; // Handles case when file is missing
import java.io.FileReader;        // Reads characters from a file
import java.io.IOException;       // Handles general input/output errors
import java.text.NumberFormat;    // Used to format numbers (like percentages)

public class Stats1 {

	public static void main(String[] args)
	{
		// Create a File object pointing to the file location
		File dataFile = new File("../Chapter11/src/Test2");
		
		FileReader in;           // Will read raw characters from the file
		BufferedReader readFile; // Will read lines from the file
		
		// Create a formatter to display numbers as percentages
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		// Variables to store each student's name and score (as text)
		String studentName, score;
		
		double scoreValue;      // Score converted into a number
		double lowScore = 100;  // Start with highest possible low score
		double highScore = 0;   // Start with lowest possible high score
		double avgScore;        // Will store the average
		double totalScore = 0;  // Sum of all scores
		
		int numScore = 0;       // Counts how many scores we read
		
		try
		{
			// Open the file for reading
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			// Read file line by line
			// Each loop reads one student name and one score
			while((studentName = readFile.readLine()) != null)
			{
				score = readFile.readLine(); // Read the next line (the score)
				
				// Print the name and score
				System.out.println(studentName + " " + score);
				
				numScore += 1; // Increase count of scores
				
				// Convert score from String to double
				scoreValue = Double.parseDouble(score);
				
				// Add score to total
				totalScore += scoreValue;
				
				// Check if this is the new lowest score
				if (scoreValue < lowScore)
				{
					lowScore = scoreValue;
				}
				
				// Check if this is the new highest score
				if (scoreValue > highScore)
				{
					highScore = scoreValue;
				}
			}
			
			// Calculate average score
			avgScore = totalScore / numScore;
			
			// Print results as percentages (divide by 100 to convert to decimal)
			System.out.println("Low score = " + percent.format(lowScore/100));
			System.out.println("High score = " + percent.format(highScore/100));
			System.out.println("Average = " + percent.format(avgScore/100));
			
			// Close file resources (important!)
			readFile.close();
			in.close();
		}
		catch(FileNotFoundException e)
		{
			// Runs if the file cannot be found
			System.out.println("File does not exist.");
			System.err.println("fileNotFoundException: " + e.getMessage());
		}
		catch (IOException e) 
		{
			// Runs if there is a problem reading the file
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
		}
	}
}