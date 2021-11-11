package myPackage;

//A program that reverse a string without using reverse().

public class Q3_ReverseString {
	
	public void reverseString() {
		String word = "example";
		String reverseWord1 = "";
		String reverseWord2 = "";
		char letter;
		
		for(int i = 0; i < word.length(); i++) {
			letter = word.charAt(i);
			reverseWord1 = letter + reverseWord1;
		}
		
		//Alternative option
		for( int j = word.length(); j > 0; j--) {
			letter = word.charAt(j-1);
			reverseWord2 = reverseWord2 + letter;
		}
		
		System.out.println("Reverse options");
		System.out.println("1st option: " + reverseWord1);
		System.out.println("2nd option: " + reverseWord2);
	}
}
