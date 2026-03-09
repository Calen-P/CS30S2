import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;

public class Stats1 {

	public static void main(String[] args)
	{
		File dataFile = new File("../Chapter11/src/Test2");
		FileReader in;
		BufferedReader readFile;
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		String studentName, score;
		
		double scoreValue;
		double lowScore = 100;
		double highScore = 0;
		double avgScore;
		double totalScore = 0;
		
		int numScore = 0;
		
		try
		{
			in = new FileReader(dataFile);
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
