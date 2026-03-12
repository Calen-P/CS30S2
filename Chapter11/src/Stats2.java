import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class Stats2 {

	public static void main(String[] args)
	{
		File dataFile;
		FileReader in;
		BufferedReader readFile;
		NumberFormat percent = NumberFormat.getPercentInstance();
		FileWriter out;
		BufferedWriter writeFile;
		
		Scanner userinput = new Scanner(System.in);
		
		String fileName, studentName, score;
		int numStudent;
		
		double scoreValue;
		double lowScore = 100;
		double highScore = 0;
		double avgScore;
		double totalScore = 0;
		
		int numScore = 0;
		
		System.out.println("Enter the File Name: ");
		fileName = userinput.next();
		
		System.out.println("Enter Number of Students: ");
		numStudent = userinput.nextInt();
		
		try
		{
			dataFile = new File(fileName);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			for (int i = 0; i < numStudent; i++)
			{
				System.out.println("Enter Student Name: ");
				studentName = userinput.next();
				
				System.out.println("Enter Test Score: ");
				score = userinput.next();
				
				writeFile.write(studentName);
				writeFile.newLine();
				writeFile.write(score);
				writeFile.newLine();
			}
			writeFile.close();
			out.close();
			System.out.println("Data Written to File");
		}
		
		catch (IOException e) 
		{
			System.out.println("File Does Not Exist.");
			System.err.println("IOException: " + e.getMessage());
		}
		
		//Read data from file and process
		
		try
		{
			dataFile = new File(fileName);
			in  = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			while((studentName = readFile.readLine()) != null)
			{
				score = readFile.readLine();
				System.out.println(studentName + " " + score);
				
				numScore += 1;
				scoreValue = Double.parseDouble(score);
				totalScore += scoreValue;
				
				if (scoreValue < lowScore)
				{
					lowScore = scoreValue;
				}
				
				if (scoreValue > highScore)
				{
					highScore = scoreValue;
				}
			}
			
			avgScore = totalScore / numScore;
			
			System.out.println("Low score = " + percent.format(lowScore/100));
			System.out.println("High score = " + percent.format(highScore/100));
			System.out.println("Average = " + percent.format(avgScore/100));
			
			readFile.close();
			in.close();
		}
		
		catch (IOException e) 
		{
			System.out.println("File could not be created.");
			System.err.println("IOException: " + e.getMessage());
		}
	}

}