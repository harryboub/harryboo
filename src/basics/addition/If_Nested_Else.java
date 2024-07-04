package basics.addition;

public class If_Nested_Else {
		
	    public static void main(String[] args) {
	    	int number = 25;
	        String size;

	        if (number > 0) 
	        {
	            if (number <= 10) 
	            {
	                size = "Small";
	            } 
	            else if (number <= 20) 
	            {
	                size = "Medium";
	            } 
	            else 
	            {
	                size = "Large";
	            }
	        } 
	        else 
	        {
	            size = "Invalid";
	        }

	        System.out.println("The size category is: " + size);
	    
	    }
	}

