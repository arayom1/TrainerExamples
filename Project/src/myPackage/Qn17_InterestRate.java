package myPackage;

import java.util.Scanner;

//A program that calculates the simple interest on the principal, 
//rate of interest and number of years provided by the use. 

public class Qn17_InterestRate {

	public static void main(String[] args) {
		int principal;
		int rate;
		int time;
		int interest;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter principal: ");
		principal = input.nextInt();
		System.out.println("Enter rate: ");
		rate = input.nextInt();
		System.out.println("Enter time: ");
		time = input.nextInt();
		
		interest = principal*rate*time;
		System.out.println("---------------------");
		System.out.println("The interest is : " + interest);

	}

}
