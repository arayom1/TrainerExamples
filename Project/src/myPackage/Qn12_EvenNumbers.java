package myPackage;
//Question: line 20

//A program to store numbers from 1 to 100 in an array. 
//Print out all even numbers from the array. 
//Use the enhanced FOR loop for printing out the numbers.

public class Qn12_EvenNumbers {

	public static void main(String[] args) {

		int myArray[] = new int[100];
		for(int i =0; i<myArray.length; i++) {
			myArray[i] = i+1;
			//System.out.println(myArray[i]);
		}
		
		System.out.println("Even Numbers: ");
		for(int j: myArray) {
			if(j % 2 == 1) {
				System.out.print(myArray[j] + " ");
			}
			
		}

	}

}
