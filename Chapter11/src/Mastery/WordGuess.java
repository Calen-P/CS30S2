package Mastery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Random;
import java.util.Scanner;

public class WordGuess 
{

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		final String FLAG = "!";

		//Create a File object with the name of your file as the parameter
		File wordList = new File("../Chapter11/src/Mastery/Words");

		//Declare a File reader object
		FileReader in;

		//Declare a BufferedReader object
		BufferedReader readFile;

		//Create a random number object
		Random random = new Random();

		int numWords = 0;
		int wordToGuess;
		String secretWord = "";
		String wordSoFar = "";
		String letterGuess, wordGuess = "";
		int numGuesses = 0;	
		
		

		/* select secret word */
		try
		{
				//initialize the file reader object to name of the file object
				in = new FileReader(wordList);
               
               //initialize the BufferedReader object to the name of the file reader as a parameter
				readFile = new BufferedReader(in);

				//Get the number of words in the file using readFile
				while((wordSoFar = readFile.readLine()) != null)
				{
					numWords += 1;
				}
				in.close();
				
				in = new FileReader(wordList);
				
				readFile = new BufferedReader(in);
               //update the word to guess to the random object and number of words read plus one
				wordToGuess = random.nextInt(numWords) + 1;
				
               //iterate through the word to guess slots
				for (int i = 0; i <= wordToGuess; i++)
				{
					//update the secret word from the lines read from the file
					secretWord = readFile.readLine();
					System.out.println(secretWord);
				}
				
				secretWord = secretWord.toUpperCase(); 
              
               //close your BufferedReader object
				in.close();
               //close your FileReader object
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



		/* begin the game */
		System.out.println("WordGuess game.\n");

       //iterate through the secret word, and update the word so far variable to represent using dashes 
       //the length of the secret word
       //output the word so far using dashes
		wordSoFar = "";
		
		for (int i = 0; i < secretWord.length(); i++)
		{
			wordSoFar += "-";
		}
	



		/* allow player to make guesses*/

		do
		{
			//?? prompt for a letter
			System.out.print("Enter a letter (" + FLAG + " to guess entire word): ");
        	letterGuess = userInput.nextLine().toUpperCase();
        	
        	if (letterGuess.equals(FLAG)) {
            	break;
        	}

			/* increment number of guesses */
			numGuesses ++;
			//?
			
			char[] phraseLetters = letterGuess.toCharArray();

			/* player correctly guessed a letter--extract string in wordSoFar up to the letter
			 * guessed and then append guessed letter to that string. Next, extract rest of
			 * wordSoFar and append after the guessed letter
			 */
			if (secretWord.contains(letterGuess)) {
            	StringBuilder updated = new StringBuilder(wordSoFar);
            	for (int i = 0; i < secretWord.length(); i++) {
                	if (String.valueOf(secretWord.charAt(i)).equals(letterGuess)) {
                    	updated.setCharAt(i, letterGuess.charAt(0));
                	}
            	}
            	wordSoFar = updated.toString();
        	}

        	// Display updated word
        	System.out.println(wordSoFar + "\n");

    	} while (!letterGuess.equals(FLAG) && !wordSoFar.equals(secretWord));

    	// If the flag was used, allow full word guess
    	if (letterGuess.equals(FLAG)) {
        	System.out.print("What is your guess? ");
        	wordGuess = userInput.nextLine().toUpperCase();
    	}

    	// Final check for win or loss
    	if (wordGuess.equals(secretWord) || wordSoFar.equals(secretWord)) {
        	System.out.println("You won!");
    	} else {
        	System.out.println("Sorry. You lose.");
    	}

    	// Game summary
    	System.out.println("The secret word is " + secretWord);
    	System.out.println("You made " + numGuesses + " guesses.");

    	userInput.close(); // Clean up the Scanner
	}
}