package myPackage;

//A program to compute

public class Q5_Substring {
	public static void main(String[] args) {
		//String Substring(String str, int idx) {
			String str = "example";
			int idx = 4;
			char[] charArray = str.toCharArray();
			char[] substringArray = new char[idx];
			
			for(int i=0; i<idx; ++i) {
				substringArray[i] = charArray[i];
			}
			
			//return new String(substringArray);
			System.out.println(substringArray);
			
		//}
		
	}
	

}
