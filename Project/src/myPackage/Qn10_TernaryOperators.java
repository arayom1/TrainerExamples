package myPackage;

// A program to find the minimum of two numbers using ternary operators. 

public class Qn10_TernaryOperators {

	public static void main(String[] args) {

		int num1 = 4;
		int num2 = 2;
		int result;
		
		result = num1 > num2? num2: num1;
		
		System.out.println("The smallest number is: " + result);

	}

}
