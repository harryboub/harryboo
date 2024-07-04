package basics.addition;

public class Else_If_block {
	
	public static void main(String[] args) {
		int number = 15;

        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is negative.");
        } else if (number == 0) {
            System.out.println("Number is zero.");
        } else if (number % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
	}

}
