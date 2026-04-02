/*

Program: CountVowels.java          Last Date of this Revision: April 02, 2026

Purpose:
 * - Prompts the user for a file name
 * - Reads the file line by line
 * - Counts the number of vowels (a, e, i, o, u)
 * - Displays the total number of vowels found
Author: Calen Plana
School: CHHS
Course: Computer Programming CS30
 

*/

package Mastery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {

        // File handling objects
        File textFile;
        BufferedReader reader;

        // User input and processing variables
        String fileName;
        String line;
        String vowels = "aeiou";
        int vowelCount = 0;

        Scanner input = new Scanner(System.in);

        // Prompt user for file name
        System.out.println("Enter the File Name: ");
        fileName = input.next();

        /**
         * Read file and count vowels
         */
        try {
            // Initialize file and reader
            textFile = new File(fileName);
            reader = new BufferedReader(new FileReader(textFile));

            // Read file line by line
            while ((line = reader.readLine()) != null) {

                // Convert line to lowercase for consistent comparison
                String lowerCaseLine = line.toLowerCase();

                // Loop through each character in the line
                for (int i = 0; i < lowerCaseLine.length(); i++) {

                    char letter = lowerCaseLine.charAt(i);

                    // Check if the character is a vowel
                    if (vowels.contains(Character.toString(letter))) {
                        vowelCount++;
                    }
                }
            }

            // Output result
            System.out.println("The Number of Vowels in " + fileName + " is " + vowelCount);

            // Close reader
            reader.close();

        } catch (IOException e) {
            // Handles both FileNotFoundException and general IO issues
            System.out.println("Error reading file.");
            System.err.println("IOException: " + e.getMessage());
        }
    }
}