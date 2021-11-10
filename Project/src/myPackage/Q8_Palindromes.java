package myPackage;

import java.util.ArrayList;

//A program to

public class Q8_Palindromes {

	public static void main(String[] args) {
		
		String myArray[] = {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john", "refer", "billy", "did"};
		//String palindromes[] = {""};
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
	}

}
