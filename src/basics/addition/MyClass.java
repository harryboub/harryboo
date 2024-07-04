package basics.addition;

public class MyClass {
    // Constructor
    public MyClass() {
        System.out.println("Constructor called.");
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Static method called.");
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("Non-static method called.");
    }

    public static void main(String[] args) {
        // Calling the static method
    	staticMethod();

        // To call constructor
        MyClass example = new MyClass();
        
        // To call the non-static method
        example.nonStaticMethod();
    }
}
