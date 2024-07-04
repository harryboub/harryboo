package inheritance;

public class Test {

	

	    public static void main(String[] args) {
	        // Example with an integer array
	        int[] numbers = {1, 2, 3, 4, 5};

	        // Update the value at index 2
	        numbers[2] = 10;

	        // Print the updated array
	        System.out.print("Updated array: ");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	        System.out.println();  // Output: Updated array: 1 2 10 4 5
	    }
	}

