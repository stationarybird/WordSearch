import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

 public class WordSearchRunner {
	public static void wsMain(String fileName) throws FileNotFoundException
	{
    Scanner fileRead = new Scanner(new File(fileName));
    System.out.println("Starting main");
    System.out.println("Done with array\n");
    int rows = fileRead.nextInt();
    int cols = fileRead.nextInt();
    WordSearch wordsearch = new WordSearch(rows,cols);
    System.out.print("[");
    for (int r = 0; r < rows; r++){
      if (r == 0){
        System.out.print("[");
      }
      else{
        System.out.print(" [");
      }
      
      for(int c = 0; c < cols; c++){
        
        String words = fileRead.next();
        if (c == (cols-1)){
          System.out.print(words);
        }
        else{
          System.out.print(words + " ");
        }

        
        wordsearch.setSpot(words, r, c);
        
      }
    if (r == (rows-1)){
      System.out.print("]");
    }
      else{
        
      
    System.out.print("]\n");
      }
    }
    System.out.println("]\n");
    int numwords = fileRead.nextInt();
    for (int n = 0; n < numwords; n++){
      String word = fileRead.next();
      boolean answer = wordsearch.inGrid(word);
      System.out.println(word + " -> " + answer);
    }
		// instantiate Scanner object to read in from file
		
		// read in rows
		
		// read in columns
		
		// instantiate WordSearch object passing in number of rows & columns for 2D array
		
		// loop through the rows in the file
		
			// loop through the columns in the file
			
				// read in value from file using local variable
				
				// pass row, column, and value into the 2D array
				
		// read number of words to search for from file
		
		// loops through the words
		
			// read in word from file
			
			// method call to search for the word in the 2D array
			
			// print out word to search for and true/false
			
	}
}