package myPackage;
//Question: output structure is different  


//A program to display the triangle of words using any type of loop. 

public class Qn13_TriangleWords {

	public static void main(String[] args) {
		
		int characterCount = 0;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print( (characterCount % 2) + " ");
				
//				if (j % 2 == 0 ) {
//					System.out.print("0");
//				}else {
//					System.out.print("1");
//				}
				++characterCount;
			}
			System.out.println();
		}
	}

}
