package myPackage;

/*
A program with a substring method that accepts a string and an integer 
and returns the substring contained between 0 and integer-1 inclusive. 
*/

public class Q5_Substring {
	
	public void substring(int idx) {
		
		String str = "example";
		
		char[] charArray = str.toCharArray();
		char[] substringArray = new char[idx];
		
		for(int i=0; i<idx; ++i) {
			substringArray[i] = charArray[i];
		}
		System.out.println(substringArray);
	}
}
