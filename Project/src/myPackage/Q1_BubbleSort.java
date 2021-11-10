package myPackage;

// A program that perform a bubble sort.

public class Q1_BubbleSort {
	public static void main(String[] args) {
		int myArray[] = {1,0,5,6,3,2,3,7,9,8,4};
		
		int arrayLength1 = myArray.length;
		for (int i = 0; i < arrayLength1-1; i++) {
			for (int j = 0; j < arrayLength1-i-1; j++) {
				if (myArray[j] > myArray[j+1]) {
					int temp = myArray[j];
					myArray[j] = myArray[j+1];
					myArray[j+1] = temp;
				}
			}
		}
		
		int arrayLength2 = myArray.length;
		for (int i=0; i<arrayLength2; ++i)
            System.out.print(myArray[i] + " ");
        System.out.println();
	}
}
