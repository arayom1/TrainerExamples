package MyPackage;

public class Driver {

	public static void main(String[] args) {
		String myMessage = "Hello!"; // also called string literal.named for the manually entered value 
		int runIterations = 5;
		
		for (int i = 0; i < runIterations; ++i) {
			System.out.println(myMessage + ": " + i);
		}
		
		int j = 0;
		while (j < runIterations) {
			System.out.println("J is still going! J = " + j);
			++j;
		}
		
		boolean done = false;
		while (!done) {
			
		}
	}

}
