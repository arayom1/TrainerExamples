package myPackage;

import java.util.ArrayList;

/*
A program that creates an ArrayList and insert integers 1 through 10.
It displays the ArrayList. Add all the even numbers and display all the results.
Add all the odd numbers and display all the results. Remove the prime numbers from
the ArrayList and print out the remaining ArrayList.
*/

public class Qn19_ArrayList {
	
	ArrayList<Integer> list;
	
	public void primeArrayList(){
		int evenNumbers = 0;
		int oddNumbers = 0;
		
		list = new ArrayList<Integer>();
		
		for (int i = 1; i <= 10; ++i) {
			list.add(i);
		}
		
		System.out.println("Integers 1 through 10: " + list);
		
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i)%2 == 0) {
				evenNumbers = evenNumbers + list.get(i);
			}
			
			else if(list.get(i)%2 == 1) {
				oddNumbers = oddNumbers + list.get(i);
			}
		}
		
		System.out.println("The sum of even numbers: " + evenNumbers);
		System.out.println("The sum of odd numbers: " + oddNumbers);
		trimPrimes();
		System.out.print("The remaining non prime numbes are: [");
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println("]");
	}

	public boolean isPrime(int num) {
		if (num == 0 || num == 1)
			return false;
		
		for (int i = 2; i < num; ++i) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
	
	public void trimPrimes() {
		for (int i = 0; i < list.size(); ++i) {
			if (isPrime(list.get(i))) {
				list.remove(i);
				// Subtract one to account for the removal of a prime
				--i;
			}
		}
	}
}


