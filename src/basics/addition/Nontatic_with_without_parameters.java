package basics.addition;

public class Nontatic_with_without_parameters {
	
	void greet() {
		System.out.println("Hello");
	}
	
	void message(String name) {
		System.out.println("Hello" + name);
	}
	
	
	
	public static void main(String[] args) {
		Nontatic_with_without_parameters example = new Nontatic_with_without_parameters();
		example.greet();
		example.message(" alice");
		
	}

}
