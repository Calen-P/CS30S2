package Mastery;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Random;

public class WordGuess 
{

	public static void main(String[] args) 
	{
		final String FLAG = "!";

		//Create a File object with the name of your file is the parameter
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
		String wordSoFar = "", updatedWord = "";
		String letterGuess, wordGuess = "";
		int numGuesses = 0;	
		
		

		/* select secret word */
		try {
				//initialize the file reader object to name of the file object
				in = new FileReader(wordList);
               
               //initialize the BufferedReader object to the name of the file reader as a parameter
				readFile = new BufferedReader(in);

				//Get the number of words in the file using readFile
				while((wordList = readFile.readLine()) != null)
				{
					numWords += 1;
				}
				
               
               //update the word to guess to the random object and number of words read plus one
				wordToGuess = random.nextInt(numWords) + 1;
				
               //iterate through the word to guess slots
                       //update the secret word from the lines read from the file
              
               //close your BufferedReader object
				in.close();
               //close your FileReader object
				readFile.close();
				
   	} catch (IOException e) 
       {
   			System.out.println("File could not be created.");
   			System.err.println("IOException: " + e.getMessage());
		} catch (/* ?? */) 
       {
			/* ?? */
   	}



		/* begin the game */
		System.out.println("WordGuess game.\n");

       //iterate through the secret word, and update the word so far variable to represent using dashes 
       //the length of the secret word
       //output the word so far using dashes
	



		/* allow player to make guesses*/

		do {
			//?? prompt for a letter


			/* increment number of guesses */
			//?

			/* player correctly guessed a letter--extract string in wordSoFar up to the letter
			 * guessed and then append guessed letter to that string. Next, extract rest of
			 * wordSoFar and append after the guessed letter
			 */
			
            //???





			/* display guessed letter instead of dash */
			    //??


		} while (!letterGuess.equals(FLAG) && !wordSoFar.equals(secretWord));



       
		/* finish game and display message and number of guesses */
		
       //??
	}
//}