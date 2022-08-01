import java.util.Scanner;

//Programming Challenge 1 from Chapter 4
//of Starting out with >>> Java, Tony Gaddis

public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int userValue;
		int totalSum = 0;
		
		System.out.print("Enter in a nonzero integer value to find the " +
							"sum of every number until the number entered: ");
		userValue = in.nextInt();
		
		while (userValue <= 0) {
			System.out.print("That is not a nonzero integer. Enter in a " +
								"numner greater than zero: ");
			userValue = in.nextInt();
		}
		
		for (int test = 1; test <= userValue; test++) {
			totalSum += test;
		}
		
		System.out.println("The number entered was " + userValue +
							" and the total value is " + totalSum);
	}
}