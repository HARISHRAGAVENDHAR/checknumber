package checknumber;
import java.util.Scanner;
public class checknumber {
	public static void main(String[] args) {
		  Scanner Scanner = new Scanner(System.in);
	        System.out.println("Enter a number: ");
	        double number = Scanner.nextDouble();

	        if (number > 0) {
	            System.out.println("The number is positive.");
	        } else if (number < 0) {
	            System.out.println("The number is negative.");
	        } else {
	            System.out.println("The number is zero.");
	        }
	    }

	}


