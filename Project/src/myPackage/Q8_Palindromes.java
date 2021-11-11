package myPackage;

import java.util.ArrayList;

//A program that stores strings in an ArrayList and saves all the palindromes in another ArrayList

public class Q8_Palindromes {
	public void palindromes() {
		String myArray[] = {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john", "refer", "billy", "did"};
		ArrayList<String> palindromes = new ArrayList<String>();
		
		String reverseWord = "";
		String word = "";
		
		for(int i=0; i<myArray.length; i++) {
			word = myArray[i];
			
			for(int j=0; j<word.length(); j++) {
				reverseWord = word.charAt(j) + reverseWord;
			}
			palindromes.add(reverseWord);
			reverseWord = "";
		}
		
		System.out.println("Palindromes:");
		for(int k=0; k<myArray.length; k++) {
			if(myArray[k].equals(palindromes.get(k))) {
				System.out.print(myArray[k] + ", ");
			}
		}
		System.out.println();
	}
}
