package basics.addition;

public class non_static_with_witout_parameters {
	
	    // Constructor
	     non_static_with_witout_parameters() {
	        System.out.println("Constructor called.");
	    }

	    // Static method
	     static void staticMethod() {
	        System.out.println("Static method called.");
	    }

	    // Non-static method without parameters
	     void greet() {
	        System.out.println("Hello, world!");
	    }

	    // Non-static method with parameters
	    public void greet(String name) {
	        System.out.println("Hello, " + name + "!");
	    }

	    public static void main(String[] args) {
	        //static method
	        staticMethod();

	        // Calling the constructor
	        non_static_with_witout_parameters example = new non_static_with_witout_parameters();

	        // Calling the non-static method without parameters
	        example.greet();
	        
	        // Calling the non-static method with parameters
	        example.greet("Alice");
	    }
	}

	
