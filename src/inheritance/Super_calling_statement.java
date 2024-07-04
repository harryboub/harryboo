package inheritance;


//Super calling class calls constructors from different classes 
class Parent {
    public Parent() {
        System.out.println("Parent class no-arg constructor");
    }

    public Parent(String message) {
        System.out.println("Parent class constructor with message: " + message);
    }
}

class Child extends Parent {
    public Child() {
        super(); // Calls the no-arg constructor of the Parent class
        System.out.println("Child class no-arg constructor");
    }

    public Child(String message) {
        super(message); // Calls the parameterized constructor of the Parent class
        System.out.println("Child class constructor with message: " + message);
    }
}


public class Super_calling_statement {
	public static void main(String[] args) {
		//calls the parent and child non para constructor
		Child c1 = new Child();
		//calls the parent and child para constructor
		Child c2 = new Child("hey");
	}

}
