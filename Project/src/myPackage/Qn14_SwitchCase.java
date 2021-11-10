package myPackage;

import java.time.LocalDate;

//A program that demonstrate the switch case.

public class Qn14_SwitchCase {

	public static void main(String[] args) {
		int function = 3;
		String myString = "I am learning Core Java";
		switch (function) {
		case 1:
			System.out.println("The sqaure root of 9 is: " + Math.sqrt(9));
		    break;
		case 2:
			LocalDate localDate = LocalDate.now(); 
			System.out.println("Todays date is: " + localDate);
		    break;
		case 3:
			String[] arraySplit = myString.split("\\s");
			    for (int i=0; i < arraySplit.length; i++){
			      System.out.println(arraySplit[i]);
			    }
			break;
		}
		    
	}
}
