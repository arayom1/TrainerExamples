package myPackage;

//A program to print all prime numbers.

public class Q9_PrimeNumbers {

	public void primeNumbers() {
		int numbers = 100;
		boolean isPrimeNumber = true;
		String primeNumber = "";
		
		for (int i = 2; i <= numbers; i++) {
			isPrimeNumber = verifyNumber(i);
            if (isPrimeNumber) {
            	primeNumber = primeNumber + i + ", ";
            }
		}
		System.out.println("The prime numbers are: ");
		System.out.println(primeNumber);
	}
	
	public static boolean verifyNumber(int num) {
		int remainder;
		for (int i = 2; i <= num / 2; i++) {
			remainder = num % i;
			if (remainder == 0) {
                return false;
            }
		}
		return true;
	}
}
