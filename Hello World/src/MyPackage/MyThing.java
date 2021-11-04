package MyPackage;

public class MyThing {
	
	//primitive data types
	byte myByte = 1; //8 bits
	short mySmallNumber = 5; // 16 bits (half of int)
	int myWholeNumber; // 32 bits
	long myBigNumber; // 64 bits
	float myDecimal = 1.05f; // 32 bits
	double myPreciseDecimal; // 64 bits
	
	boolean trueOrFlase; // 1 byte or 8 bits
	char myCharacter; //16 bits
	
	// reference - holds the memory address of object
	Object o; // reference 
	
	//My first method
	public void PrintMyValues() {
		System.out.println("My values are: " + myByte);
	}
	
}
