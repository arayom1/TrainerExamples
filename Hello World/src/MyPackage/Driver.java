package MyPackage;

public class Driver {
	
	public static void main(String[] args) {
		System.out.print("Hello world");
		
		//object instantation 
		MyThing mt = new MyThing();
		
		System.out.println("\nSay hi to my object, it has a value of " + mt.mySmallNumber);
		
		mt.PrintMyValues();
	}

}
