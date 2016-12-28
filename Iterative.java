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
		// TODO: The following algorithm starts at the very beginning of the
		// sequence, then moves forward, eventually printing out terms that are
		// greater than (or equal to) s. Is this how it should be done?
		
		int a = 1, b = 1;	// Some great names there
		while (n > 0) {
			
			// Swap a and b with some magic
			a ^= b;
			b ^= a;
			a ^= b;
			
			// That swap trick works with any two opposite operations, so this
			// will do just the same:
			// a = a + b;
			// b = a - b;
			// a = a - b;
			// but a) Overflow (or underflow) can mess with the algorithm and
			// b) XOR is its own opposite operation. Also, that swap is
			// potentially dangerous if a and b may be two pointers to the same
			// value, but Java isn't good enough to have references, so we're
			// good to use it here.
			
			b += a;
			
			if (b >= s) {
				--n;
				System.out.printf("%d ", b);
			}
			
		}
		System.out.print('\n');
		return b;
	}
	
	/**fibonacciSeries
	 * @param int s, int n
	 * NO LIMIT (WITHIN REASON) ON LOCAL VARIABLE
	 *  returns the sums the first n digits of a fibonacci sequence 
	 *  with a start value of s 
	 */
	public int fibonacciSeries(int s, int n) {
		// TODO: Same deal as in the fibonacciSequence method
		int a = 1, b = 1, sum = 0;
		while (n > 0) {
			a ^= b;
			b ^= a;
			a ^= b;
			
			b += a;
			
			if (b >= s) {
				--n;
				sum += b;
				System.out.printf("%d ", b);
			}
		}
		System.out.print('\n');
		return sum;
	}
	
}
