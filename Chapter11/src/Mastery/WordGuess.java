/*

Program: WordGuess.java          Last Date of this Revision: April 02, 2026

Purpose:
 * - Reads a list of words from a file
 * - Randomly selects one as the secret word
 * - Allows the user to guess letters or the full word
 * - Tracks number of guesses and displays results
Author: Calen Plana
School: CHHS
Course: Computer Programming CS30
 

*/

package Mastery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class WordGuess {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // Special flag to allow full-word guess
        final String FLAG = "!";

        // File containing word list
        File wordList = new File("../Chapter11/src/Mastery/Words");

        // File reading objects
        BufferedReader reader;

        // Random number generator
        Random random = new Random();

        // Game variables
        int numWords = 0;
        int wordToGuess;
        String secretWord = "";
        String wordSoFar = "";
        String letterGuess;
        String wordGuess = "";
        int numGuesses = 0;

        /**
         * STEP 1: Select a random word from the file
         */
        try {
            // First pass: count number of words
            reader = new BufferedReader(new FileReader(wordList));
            while (reader.readLine() != null) {
                numWords++;
            }
            reader.close();

            // Second pass: retrieve random word
            reader = new BufferedReader(new FileReader(wordList));

            wordToGuess = random.nextInt(numWords) + 1;

            for (int i = 0; i <= wordToGuess; i++) {
                secretWord = reader.readLine();
            }

            // Convert to uppercase for consistent comparison
            secretWord = secretWord.toUpperCase();

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file.");
            System.err.println("IOException: " + e.getMessage());
        }

        /**
         * STEP 2: Initialize game display
         */
        System.out.println("WordGuess game.\n");

        // Create dashed version of the secret word
        for (int i = 0; i < secretWord.length(); i++) {
            wordSoFar += "-";
        }

        System.out.println(wordSoFar);

        /**
         * STEP 3: Main game loop (letter guessing)
         */
        do {
            // Prompt user for input
            System.out.print("Enter a letter (" + FLAG + " to guess entire word): ");
            letterGuess = userInput.nextLine().toUpperCase();

            // Exit loop if user wants to guess full word
            if (letterGuess.equals(FLAG)) {
                break;
            }

            // Increment guess counter
            numGuesses++;

            /**
             * Check if guessed letter exists in secret word
             * If yes, reveal positions in wordSoFar
             */
            if (secretWord.contains(letterGuess)) {
                StringBuilder updatedWord = new StringBuilder(wordSoFar);

                for (int i = 0; i < secretWord.length(); i++) {
                    if (String.valueOf(secretWord.charAt(i)).equals(letterGuess)) {
                        updatedWord.setCharAt(i, letterGuess.charAt(0));
                    }
                }

                wordSoFar = updatedWord.toString();
            }

            // Display updated progress
            System.out.println(wordSoFar + "\n");

        } while (!letterGuess.equals(FLAG) && !wordSoFar.equals(secretWord));

        /**
         * STEP 4: Full word guess (if user entered FLAG)
         */
        if (letterGuess.equals(FLAG)) {
            System.out.print("What is your guess? ");
            wordGuess = userInput.nextLine().toUpperCase();
        }

        /**
         * STEP 5: Determine win or loss
         */
        if (wordGuess.equals(secretWord) || wordSoFar.equals(secretWord)) {
            System.out.println("You won!");
        } else {
            System.out.println("Sorry. You lose.");
        }

        /**
         * STEP 6: Display game summary
         */
        System.out.println("The secret word is " + secretWord);
        System.out.println("You made " + numGuesses + " guesses.");

        // Close scanner
        userInput.close();
    }
}