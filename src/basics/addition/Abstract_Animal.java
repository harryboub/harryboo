package basics.addition;

//	// Abstract class
//	abstract class Animal {
//	    // Abstract method (does not have a body)
//	    abstract void makeSound();
//
//	    // Regular method
//	    void sleep() {
//	        System.out.println("Zzz...");
//	    }
//	}

	// Subclass (inherits from Animal)
	class Dog  {
	    // The body of the abstract method is provided here
	    void makeSound() {
	        System.out.println("Woof");
	    }
	}

	public class Abstract_Animal {
	    public static void main(String[] args) {
	        // Abstract_Animal animal = new Abstract_Animal(); // This will cause an error since Animal is abstract

	        Dog dog = new Dog();
	        dog.makeSound(); // Outputs: Woof
//	        dog.sleep();     // Outputs: Zzz...
	    }
	}

