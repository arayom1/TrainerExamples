package myPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//A program that would read from file and print it out to the screen.

public class Qn20_ReadFromFile {
	
	public void readFromFile(){
		String firstName, lastName, state;
		int age;
		
		try {
		      File file = new File("Data.txt");
		      Scanner scan = new Scanner(file);
		      scan.useDelimiter(":|\\n");
		      
		      while (scan.hasNext()) {
		    	  
		    	  firstName = scan.next();
		    	  lastName = scan.next();
				  age = Integer.parseInt(scan.next());
				  state = scan.next();
				  
				  System.out.println("Name: " + firstName + " " + lastName);
				  System.out.println("Age: " + age);
				  System.out.println("State: " + state); 
		      }
		      scan.close();
		      
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}
