package myPackage;

/*
A program that defines an interface having an addition, subtraction, multiplication 
and division methods. It creates a class that implements this interface and 
provides appropriate functionality to carry out the required operations.
*/

public class Qn15_Implementation implements Qn15_Interf {
	public double addition(double a, double b) {
		return a + b;
	}

	public double subtraction(double a, double b) {
		return a - b;
	}

	public double multiplication(double a, double b) {
		return a * b;
	}

	public double division(double a, double b) {
		return a / b;
	}

}
