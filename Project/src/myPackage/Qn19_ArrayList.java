package myPackage;

import java.util.ArrayList;

public class Qn19_ArrayList {

	public static void main(String[] args) {
		int evenNumbers = 0;
		int oddNumbers = 0;
		int nonPrimes = 0;
		String primeNum = "";
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
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
		//System.out.println("Numbers that aren't prime: " + nonPrimes);
	}
}


