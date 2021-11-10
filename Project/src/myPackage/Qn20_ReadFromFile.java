package myPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//A program that would read from file and print it out to the screen.

public class Qn20_ReadFromFile {

	public static void main(String[] args) throws IOException {
		try {
		      File file = new File("Data.txt");
		      Scanner scan = new Scanner(file);
		      
		      
		      while (scan.hasNextLine()) {
		    	  String data = scan.nextLine();
		    	  
//		    	  String[] splitString = data.split(":");
//		    	  for(String i: splitString) {
//		    		  System.out.println(splitString); 
//		    	  }
		    	  System.out.println(data); 
			       
		      }
		      scan.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}
