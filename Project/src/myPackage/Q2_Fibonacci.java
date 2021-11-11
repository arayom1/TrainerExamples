package myPackage;

// A program to display the first 25 Fibonacci numbers beginning at 0.

public class Q2_Fibonacci {
	
	public void fibonacci() {
		int num1 = 0;
		int num2 = 1;
		int i = 0;
		int output = 0;
		
		while(i<25) {
			System.out.print(num1 + " ");
			output = num1 + num2;
			num1 = num2;
			num2 = output;
			++i;
		}
		System.out.println();
	}
}
