package myPackage;

//A program to print all prime numbers.

public class Q9_PrimeNumbers {

	public static void main(String[] args) {
		
		int myArray[] = {1,2,3,4,5,6,7,8,9};
		for(int i=0; i<myArray.length; i++) {
			if(myArray[i] %  2 == 1 && myArray[i] /  1 == myArray[i]) {
				System.out.println(myArray[i] + " is prime");
			}
		}

	}

}
