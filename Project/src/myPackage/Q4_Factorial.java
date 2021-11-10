package myPackage;

// A program to compute N factorial.

public class Q4_Factorial {
	public static void main(String[] args) {
		int num = 5;
		int result = 1;
		
		for(int i=1; i<=num; i++) {
			result = result*i;
		}
		System.out.println("Factorial of " + num + ": " + result);
	}
}
