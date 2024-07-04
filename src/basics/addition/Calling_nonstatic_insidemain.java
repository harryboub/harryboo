package basics.addition;

public class Calling_nonstatic_insidemain {
	

	    // Non-static method
	    void greet() {
	        System.out.println("Hello, this is a non-static method!");
	    }

	    
	    public static void main(String[] args) {
	        
	    	Calling_nonstatic_insidemain example = new Calling_nonstatic_insidemain();

	        // Call the non-static method using the instance
	        example.greet();
	    }
	}
