package basics.addition;

public class method_overloading_constructor_overloading {
	

	    // Constructor Overloading
	method_overloading_constructor_overloading() {
	        System.out.println("Default constructor called.");
	    }

	method_overloading_constructor_overloading(int a, int b) {
	        System.out.println("Constructor with two parameters called. Sum: " + (a + b));
	    }

	method_overloading_constructor_overloading(int a, int b, int c) {
	        System.out.println("Constructor with three parameters called. Sum: " + (a + b + c));
	    }

	    // Method Overloading
	    void add(int a, int b) {
	        System.out.println("Addition of two integers: " + (a + b));
	    }

	    void add(double a, double b) {
	        System.out.println("Addition of two doubles: " + (a + b));
	    }

	    void add(int a, int b, int c) {
	        System.out.println("Addition of three integers: " + (a + b + c));
	    }
	

	
	    public static void main(String[] args) {
	        // Constructor Overloading
	    	method_overloading_constructor_overloading calc1 = new method_overloading_constructor_overloading();
	    	method_overloading_constructor_overloading calc2 = new method_overloading_constructor_overloading(10, 20);
	    	method_overloading_constructor_overloading calc3 = new method_overloading_constructor_overloading(10, 20, 30);

	        // Method Overloading
	        calc1.add(5, 10);
	        calc1.add(5.5, 10.5);
	        calc1.add(1, 2, 3);
	    }
	}
