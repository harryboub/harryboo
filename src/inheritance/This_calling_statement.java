package inheritance;

//This calling statement calls constructors from the same class

class Example {


    public Example(int a) 
    {
        System.out.println("No-arg constructor");
    }

    public Example(int a, int b) 
    {
        this(10); // Calls the parameterized constructor with one provided value
        System.out.println("Single parameter constructor");
    }

    public Example(int a, double b) {
        this(10,20);
        System.out.println("Two-parameter constructor: x = " + x + ", y = " + y);
    }
}


public class This_calling_statement {
	public static void main(String[] args) {
        Example example2 = new Example(5);
        Example example3 = new Example(5, 10);
	}

}
