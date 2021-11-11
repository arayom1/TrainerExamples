package myPackage;

import anotherPackage.Variables;

/*
A program that would access two float-variables from a class that exists in another package. 
Note, you will need to create two packages to demonstrate the solution.
*/

public class Qn11_AccessPackage {

	public void accessPackage() {
		Variables variables = new Variables();
		System.out.println("First Variable: " + variables.floatNum1);
		System.out.println("Second Variable: " + variables.floatNum2); 
	}
}



