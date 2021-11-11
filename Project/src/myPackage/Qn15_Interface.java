package myPackage;

/*
A program that defines an interface having an addition, subtraction, multiplication 
and division methods. It creates a class that implements this interface and 
provides appropriate functionality to carry out the required operations.
*/

public class Qn15_Interface {

	public void Interfaces() {
		Qn15_Interf qn15 = new Qn15_Implementation();
		Result(qn15);
	}

	public static void Result(Qn15_Interf q15) {
		System.out.println("The sum is: " + q15.addition(10, 5));
		System.out.println("The difference is: " + q15.subtraction(10, 5));
		System.out.println("The quotient is: " + q15.division(10, 5));
		System.out.println("The product is: " + q15.multiplication(10, 5));
	}
}