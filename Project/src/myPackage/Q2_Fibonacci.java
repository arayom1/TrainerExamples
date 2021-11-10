package myPackage;

// A program to display the first 25 Fibonacci numbers beginning at 0.

public class Q2_Fibonacci {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int i = 0;
		int output = 0;
		
		while(i<25) {
			System.out.println(num1);
			output = num1 + num2;
			num1 = num2;
			num2 = output;
			++i;
		}
		 
	}
}



//while (i <= 25) {
//	 if(num == 0) {
//		 output = 0;
//		 System.out.println("#" + num + "--> " + output);
//	 }
//	 else if (num == 1) {
//		 output = 1;
//		 System.out.println("#" + num + "--> " + output);
//	 }
//	 else {
//		 output = (num-1) + (num-2); 
//		 System.out.println(num + ":" + (num-1) + "+" + (num-2) + "=" + output);
//		 //System.out.println("#" + i + "--> " + output);
//	 }
//	 num++;
//}	
