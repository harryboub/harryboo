package basics.addition;
import java.util.Scanner;

public class Sum_of_the_four_numbers {
	

	    // Method to calculate the sum of four numbers
	    public static int sumOfFourNumbers(int a, int b, int c, int d) 
	    {
	        return a + b + c + d;
	    }

	    public static void main(String[] args) 
	    {
	        //Scanner object
	        Scanner scanner = new Scanner(System.in);

	        //user enters four numbers
	        System.out.print("Enter the first number:");
	        int num1 = scanner.nextInt();
	        
	        System.out.print("Enter the second number:");
	        int num2 = scanner.nextInt();
	        
	        System.out.print("Enter the third number:");
	        int num3 = scanner.nextInt();
	        
	        System.out.print("Enter the fourth number:");
	        int num4 = scanner.nextInt();

	        // Calculate the sum of the four numbers
	        int sum = sumOfFourNumbers(num1, num2, num3, num4);

	        // Display the result
	        System.out.println("The sum of the four numbers is: " + sum);


	    }
	}

