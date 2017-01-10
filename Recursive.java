package me.matthorn.recursion;

public class Recursive {

	/**factorial
	 * @param int n
	 * NO LOCAL VARIABLES
	 *  returns the factorial of n 
	 */
	public int factorial(int n) {
		return n == 1 ? 1 : n * factorial(n - 1);
	}

	/**afactorial
	 * @param int n, int m
	 * NO LOCAL VARIABLES
	 *  returns the factorial of n after printing the numbers to be
	 *  multiplied in ascending order
  	 *  example: 1 * 2 * 3 * 4 * 5
	 */
	public int afactorial(int n, int m) {
		if (n == 1) {
			System.out.printf("%d", m);
			return 1;
		} else {
			System.out.printf("%d * ", m);
			return n * afactorial(n - 1, m + 1);
		}
	}
		
	/**dfactorial
	 * @param int n
	 * NO LOCAL VARIABLES
	 *  returns the factorial of n after printing the numbers to be
	 *  multiplied in descending order 
	 *  example: 5 * 4 * 3 * 2 * 1
	 */
	public int dfactorial(int n) {
		if (n == 1) {
			System.out.print('1');
			return 1;
		} else {
			System.out.printf("%d * ", n);
			return n * dfactorial(n - 1);
		}
	}
	
	/**intBasesToIntPowers
	 * @param int b, int exp
	 * NO LOCAL VARIABLE
	 *  returns the value of the base (b) to the exp (exp) 
	 */
	public int intBasesToIntPowers(int b, int exp) {
		if (exp == 1)
			return b;
		else
			return b * intBasesToIntPowers(b, exp - 1);
	}
		
	/**fibonacciSequence
	 * @param NO LIMIT (WITHIN REASON)
	 * NO LIMIT (WITHIN REASON) ON LOCAL VARIABLE
	 *  since all iterative functions can be done recursively...
	 *  print out the fibonacci sequence with a start value of s and 
	 *  provides the first n terms 
	 */
	public void fibonacciSequence(int s, int r, int n) {
		// "since all iterative functions can be done recursively..."
		// Doubt it.
		System.out.printf("%d%s", r, n == 1 ? "\n" : ", ");
		if (n > 1) fibonacciSequence(r, s + r, n - 1);
	}

	/**fibonacciSeries
	 * @param int s, int n
	 * NO LIMIT (WITHIN REASON) ON LOCAL VARIABLE
	 *  returns the sums the first n digits of a fibonacci sequence 
	 *  with a start value of s 
	 */
	//public int fibonacciSeries(int)
	
}
