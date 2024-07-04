package basics.addition;

public class Arithmatic_operators {
	
	static void add(int a, int b) {
		int add = a + b;
		System.out.println(add);
	}
	
	static void subtract(int a, int b) {
		int subtract = a - b;
		System.out.println(subtract);
	}
	
	static void multiply(int a, int b) {
		int multiply = a * b;
		System.out.println(multiply);
	}
	
	static void divide(int a, int b) {
		int divide = a / b;
		System.out.println(divide);
	}
	
	public static void main(String[] args) {
		add(9,1);
		subtract(5,3);
		multiply(6,3);
		divide(9,3);
	}
	
	

}
