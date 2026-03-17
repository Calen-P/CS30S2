package Mastery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class WordGuessClean 
{

	public static void main(String[] args) 
	{
		String words;
		File wordList = new File("../Chapter11/src/Mastery/Words");
		FileReader in;
		BufferedReader readFile;
		String wordSoFar = "";
		int numWords = 0;
		int wordToGuess;
		Random random = new Random();
		String secretWord = "";
		
		try
		{
			in = new FileReader(wordList);
           
			readFile = new BufferedReader(in);

			while((wordSoFar = readFile.readLine()) != null)
			{
				System.out.println(wordSoFar);
				numWords += 1;
			}
			
			in.close();
			
			
			wordToGuess = random.nextInt(numWords) + 1;
			System.out.println("Test 1");
			
			in = new FileReader(wordList);
			
			readFile = new BufferedReader(in);
			
			
			for (int i = 0; i < wordToGuess; i++)
			{
				System.out.println("Test 2");
				secretWord = wordSoFar; //This line is the problem
			}
			
			
			
			in.close();
			readFile.close();
			
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