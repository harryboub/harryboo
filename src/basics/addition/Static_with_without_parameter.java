package basics.addition;

public class Static_with_without_parameter {
	
	static void greet() {
		System.out.println("hello");
	}
	
	static void message(String text) {
		System.out.println("hello" + text);
	}
	
	public static void main(String[] args) {
		
		greet();
		message(" alice");
		
	}

}
