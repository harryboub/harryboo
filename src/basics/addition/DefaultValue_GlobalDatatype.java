package basics.addition;

public class DefaultValue_GlobalDatatype {
	
	// Global (class-level) variables
    byte byteVar;
    short shortVar;
    int intVar;
    long longVar;
    float floatVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;
    String stringVar; // Reference type
    
   // Method to display the default values
    void displayDefaultValues() {
        System.out.println("Default value of byte: " + byteVar);
        System.out.println("Default value of short: " + shortVar);
        System.out.println("Default value of int: " + intVar);
        System.out.println("Default value of long: " + longVar);
        System.out.println("Default value of float: " + floatVar);
        System.out.println("Default value of double: " + doubleVar);
        System.out.println("Default value of char: '" + charVar + "'");
        System.out.println("Default value of boolean: " + booleanVar);
        System.out.println("Default value of String: " + stringVar);
    }
    
    public static void main(String[] args) {
       
    	DefaultValue_GlobalDatatype defaultValues = new DefaultValue_GlobalDatatype();
        defaultValues.displayDefaultValues();
    }

}
