package Mastery;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Random;
import java.util.Scanner;

public class WordGuessClean {

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		final String FLAG = "!";

		//Create a File object with the name of your file is the parameter
		File wordList;

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
		
		//try
		{
			
			//readFile = new BufferedReader(in);
		}
	}

}
