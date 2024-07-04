package basics.addition;

public class Nested_If_Else {

	
	public static void main(String[] args) {
		
		 int n1 = 150, n2 = 180, n3 = 170;
		 
	        if (n1 >= n2) 
	        {
	            if (n1 >= n3)
	            {
	                System.out.println("Student with height: " + n1 + " is the tallest.");
	            }
	            else 
	            {
	                System.out.println("Student with height: " + n3 + " is the tallest.");
	            }
	        } else 
	        {
	            if (n2 >= n3)
	            {
	                System.out.println("Student with height: " + n2 + " is the tallest.");
	            }
	            else
	            {
	                System.out.println("Student with height: " + n3 + " is the tallest.");
	            }
	        }
		
	}
}
