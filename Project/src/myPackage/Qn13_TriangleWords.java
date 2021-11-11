package myPackage;

//A program to display the triangle of words using any type of loop. 

public class Qn13_TriangleWords {

	public void triangleWords() {
		int characterCount = 0;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print( (characterCount % 2) + " ");
				++characterCount;
			}
			System.out.println();
		}
		
	}
}
