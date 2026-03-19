package Mastery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountVowels 
{

   public static void main(String[] args) 
   {
       File textFile;
       FileReader in;
       BufferedReader readFile;
       String fileName;
       String lineInFile, lowercaseText;
       char letter;
       String vowels = "aeiou";
       int vowelSum = 0;
       
       Scanner Input = new Scanner(System.in);

       /* prompt the user for the name of the file */
       System.out.println("Enter the File Name: ");
       fileName = Input.next();
       

       /* count the vowels in the file */
       try {
                //new File object required
    	   		//new File reader object required
    	   		//new BufferedReader object required
    	   
    	   		textFile = new File(fileName);
	   			in  = new FileReader(textFile);
	   			readFile = new BufferedReader(in);

                //read the lines from the file
    	   		while ((lineInFile = readFile.readLine()) != null)
    	   		{
    	   			//as lines are read convert them to lower case
    	   			lowercaseText = lineInFile.toLowerCase();
    	   			
    	   			//iterate through the lower case text
    	   			for (int i = 0; i < lowercaseText.length(); i++)
    	   			{
    	   				//using the String class 
                        //check if each character traverse through is a vowel
                        //update total vowels
    	   				letter = lowercaseText.charAt(i); 
    	   				
    	   				String convert = Character.toString(letter);
    	   				
    	   				if (vowels.contains(convert.toLowerCase()))
    	   				{
    	   					vowelSum++;
    	   				}
    	   			}
    	   		}
    	   		
    	   	//user wants to know the number of vowels inside a file name
           		System.out.println("The Number of Vowels in " + fileName + " is " + vowelSum);

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
   }
}
