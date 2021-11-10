package myPackage;

public class Qn15_Interface {

	public static void main(String[] args) {
		Qn15_Interf qn15 = new Qn15_Implementation();
		Result(qn15);

	}
	public static void Result(Qn15_Interf q15) {
		System.out.println(q15.addition(5, 10));
		System.out.println(q15.multiplication(5, 10));
	}
}