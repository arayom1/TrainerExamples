package myPackage;

//A program to determine if an integer is even without using the modulus operator. 

public class Q6_EvenIntegers {

	public void evenIntegers(int num) {
		
		if((num / 2) * 2 == num) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
}
