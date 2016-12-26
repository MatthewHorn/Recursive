package me.matthorn.recursion;

public class RecursionProgram {

	/* 	The following is testing your ability to write both iterative and recursive
		functions that perform the same operations.  Be careful and read the
		instructions for each method.  This will tell you how to set up the
		recursive calls
	*/
	
	
	
	
	public static void main(String[] args) {
		
		Recursive recurse = new Recursive();
		Iterative iterate = new Iterative();
			
		System.out.println(iterate.factorial(5));
		System.out.println(" = " + iterate.afactorial(5));
		System.out.println(" = " + iterate.dfactorial(5));
		System.out.println(iterate.intBasesToIntPowers(3,5));
		iterate.fibonacciSequence(3, 7);
		System.out.println(iterate.fibonacciSeries(3,7));
		
		
		System.out.println(recurse.factorial(5));
		System.out.println(" = " + recurse.afactorial(5,1));
		System.out.println(" = " + recurse.dfactorial(5));
		System.out.println(recurse.intBasesToIntPowers(3,5));
		System.out.println(recurse.fibonacciSequence(3, 7, 1));
		System.out.println(recurse.fibonacciSeries(3,7));
		
		System.out.println(recurse.factorial(5));
		
		
	}

}
