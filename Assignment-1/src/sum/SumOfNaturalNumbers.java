/**
 * Program to find sum of first n natural numbers.
 */
package sum;

import java.util.Scanner;

/**
 * @author vinaypatel 
 * 
 * class SumOfNaturalNumbers
 */
public class SumOfNaturalNumbers {

	// sc for input
	static Scanner sc = new Scanner(System.in);

	/**
	 * method to handle Sum of n Natural Numbers
	 * 
	 * @param n
	 * @return sum
	 */
	static int naturalNumberSum(int n) {
		int sum = 0;
		// executes until the condition becomes false
		for (int i = 1; i <= n; i++)
			// adding the value of i to the sum variable
			sum = sum + i;
		return sum;
	}

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int n;// Natural number
		char a;

		// exception handling
		try {

			do {
				System.out.println("enter a natural number to get sum of n number: ");
				n = sc.nextInt();

				if (n == 0) {
					// if input is 0
					System.out.println("Zero is not a Natural Number" + "\n" + "Enter a Natural Number: ");
					n = sc.nextInt();
					System.out.println("Sum of " + n + " Natural Numbers is: " + naturalNumberSum(n));
				} 
				else {
					// else result
					System.out.println("Sum of " + n + " Natural Numbers is: " + naturalNumberSum(n) + "\n");
				}
				
				System.out.println("To sum again press 'y' or 'n' to exit."); // ask to sum again
				a = sc.next().charAt(0);
			
			}
			while (a == 'y');

			System.out.println("Thank You for using my program");// end of program

		} catch (Exception e) {// catch the if error caused
			System.out.println("something went wrong!");
		}
	}

}
