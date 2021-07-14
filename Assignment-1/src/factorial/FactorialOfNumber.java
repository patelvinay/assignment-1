/**
 * Program to get factorial of n numbers.
 */
package factorial;

import java.util.Scanner;

/**
 * @author vinaypatel
 *
 * class FactorialOfNumber
 */
public class FactorialOfNumber {

	static int n;
	static char a;
	static Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {

			do {
				System.out.println("Enter the number: ");

				n = sc.nextInt();// We will find the factorial of this number


				long factorial = 1;
				int i = 1;
				
				while (i <= n) {
					factorial = factorial * i;
					i++;
				}
				System.out.println("Factorial of " + n + " is: " + factorial);

				System.out.println("To get new Factorial, press 'y' or 'n' to exit.");
				a = sc.next().charAt(0);

			} while (a == 'y');
			System.out.println("Thank You for using my program");// end of program
		} catch (Exception e) {// catch the if error caused
			System.out.println("something went wrong!");
		}
	}
}
