package myPackage;

//A program that have concrete subclass that inherits three abstract methods from a superclass.

public class Qn18_Subclass extends Qn18_AbstractClass{

	public boolean hasUppercaseLetter(String str) {
		
		char[] characters = str.toCharArray();
		
		for (char c : characters) {
			int numerical = (int) c;
			
			if (numerical >= 65 && numerical <= 90)
				return true;
		}
		
		return false;
	}

	public String toUpperCase(String str) {
		
		char[] characters = str.toCharArray();
		
		for (int i = 0; i < characters.length; ++i) {
			if ( (int)characters[i] > 90 )
				characters[i] -= 32;
		}
		
		return new String(characters);
	}

	public int stringToInt(String str) {
		
		char[] characters = str.toCharArray();
		int total = 0;
		
		for (char c : characters) {
			total += (int)c;
		}
		
		return total + 10;
	}

}
