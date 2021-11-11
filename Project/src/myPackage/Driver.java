package myPackage;

//Project 2

public class Driver {

	public static void main(String... args) {
		
		System.out.println("------------------------------------");
		System.out.println("***Question 1***");
		Q1_BubbleSort q1 = new Q1_BubbleSort();
		q1.bubbleSort();
		
		System.out.println("------------------------------------");
		System.out.println("***Question 2***");
		Q2_Fibonacci q2 = new Q2_Fibonacci();
		q2.fibonacci();
		
		System.out.println("------------------------------------");
		System.out.println("***Question 3***");
		Q3_ReverseString q3 = new Q3_ReverseString();
		q3.reverseString();
		
		System.out.println("------------------------------------");
		System.out.println("***Question 4***");
		Q4_Factorial q4 = new Q4_Factorial();
		q4.factorial(5);
		
		System.out.println("------------------------------------");
		System.out.println("***Question 5***");
		Q5_Substring q5 = new Q5_Substring();
		q5.substring(4);

		System.out.println("------------------------------------");
		System.out.println("***Question 6***");
		Q6_EvenIntegers q6 = new Q6_EvenIntegers();
		q6.evenIntegers(7);
		
		System.out.println("------------------------------------");
		System.out.println("***Question 7***");
		Q7_Comparator q7 = new Q7_Comparator();
		q7.comparator();
		
		System.out.println("------------------------------------");
		System.out.println("***Question 8***");
		Q8_Palindromes q8 = new Q8_Palindromes();
		q8.palindromes();
		
		System.out.println("------------------------------------");
		System.out.println("***Question 9***");
		Q9_PrimeNumbers q9 = new Q9_PrimeNumbers();
		q9.primeNumbers();
		
		System.out.println("------------------------------------");
		System.out.println("***Question 10***");
		Qn10_TernaryOperators q10 = new Qn10_TernaryOperators();
		q10.ternaryOperators();
		
		System.out.println("------------------------------------");
		System.out.println("***Question 11***");
		Qn11_AccessPackage q11 = new Qn11_AccessPackage();
		q11.accessPackage();
		
		System.out.println("------------------------------------");
		System.out.println("***Question 12***");
		Qn12_EvenNumbers q12 = new Qn12_EvenNumbers();
		q12.evenNumbers();
		
		System.out.println("------------------------------------");
		System.out.println("***Question 13***");
		Qn13_TriangleWords q13 = new Qn13_TriangleWords();
		q13.triangleWords();
		
		System.out.println("------------------------------------");
		System.out.println("***Question 14***");
		Qn14_SwitchCase q14 = new Qn14_SwitchCase();
		q14.switchCase(3);
		
		System.out.println("------------------------------------");
		System.out.println("***Question 15***");
		Qn15_Interface q15 = new Qn15_Interface();
		q15.Interfaces();
		
		System.out.println("------------------------------------");
		System.out.println("***Question 16***");
		Qn16_NumberOfCharacters.count("bobby");
		
		System.out.println("------------------------------------");
		System.out.println("***Question 17***");
		System.out.println("Check at the end.");
		
		System.out.println("------------------------------------");
		System.out.println("***Question 18***");
		Qn18_Subclass q18 = new Qn18_Subclass();
		System.out.println(q18.hasUppercaseLetter("Bob"));
		System.out.println(q18.hasUppercaseLetter("bob"));
		System.out.println(q18.hasUppercaseLetter("the quick brown fox jumps over the lazy dog"));
		System.out.println(q18.hasUppercaseLetter("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		System.out.println(q18.toUpperCase("the quick brown fox jumps over the lazy dog"));
		System.out.println(q18.stringToInt("Bob"));	
		
		System.out.println("------------------------------------");
		System.out.println("***Question 19***");
		Qn19_ArrayList q19 = new Qn19_ArrayList();
		q19.primeArrayList();
		
		System.out.println("------------------------------------");
		System.out.println("***Question 20***");
		Qn20_ReadFromFile q20 = new Qn20_ReadFromFile();
		q20.readFromFile();
		
		System.out.println("------------------------------------");
		System.out.println("***Question 17***");
		Qn17_InterestRate q17 = new Qn17_InterestRate();
		q17.interestRate();
	}

}
