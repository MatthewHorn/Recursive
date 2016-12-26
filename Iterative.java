package me.matthorn.recursion;

public class Iterative {

	/**factorial
	 * @param int n
	 * AT MOST ONE LOCAL VARIABLE
	 *  returns the factorial of n 
	 */
	public int factorial(int n) {
		int total = 1;
		while (n > 1) total *= n--;
		return total;
	}

	/**afactorial
	 * @param int n
	 * AT MOST TWO LOCAL VARIABLES
	 *  returns the factorial of n after printing the numbers to be
	 *  multiplied in ascending order 
	 *  example: 1 * 2 * 3 * 4 * 5
	 */
	public int afactorial(int n) {
		int total = 1, index = 1;
		while (index <= n) {
			System.out.printf("%d%s", index, index == n ? "" : " * ");
			total *= index++;
		}
		return total;
	}

	/**dfactorial
	 * @param int n
	 * AT MOST ONE LOCAL VARIABLE
	 *  returns the factorial of n after printing the numbers to be
	 *  multiplied in descending order 
  	 *  example: 5 * 4 * 3 * 2 * 1
	 */
	public int dfactorial(int n) {
		int total = 1;
		while (n >= 1) {
			System.out.printf("%d%s", n, n > 1 ? " * " : "");
			total *= n--;
		}
		System.out.print('\n');
		return total;
	}

	/**intBasesToIntPowers
	 * @param int b, int exp
	 * AT MOST ONE LOCAL VARIABLE
	 *  returns the value of the base (b) to the exp (exp) 
	 */
	public int intBasesToIntPowers(int b, int exp) {
		int total = b;
		while (exp-- > 1) total *= b;
		return total;
	}
	
	/**fibonacciSequence
	 * @param int s, int n
	 * NO LIMIT (WITHIN REASON) ON LOCAL VARIABLE
	 *  prints out the fibonacci sequence with a start value of s and 
	 *  provides the first n terms 
	 */
	public int fibonacciSequence(int s, int n) {
		// "NO LIMIT (WITHIN REASON) ON LOCAL VARIABLE"
		//	 int[] smallArray = new int[1024 * 1024 * 256];
		// (tip: don't uncomment that - that's a gigabyte of RAM)
		int a, b;
	}
	
	/**fibonacciSeries
	 * @param int s, int n
	 * NO LIMIT (WITHIN REASON) ON LOCAL VARIABLE
	 *  returns the sums the first n digits of a fibonacci sequence 
	 *  with a start value of s 
	 */
	
}
