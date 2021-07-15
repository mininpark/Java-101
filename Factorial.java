public class Factorial {
	public static void main(String[] args) {
		
		int number = 7;
		
		int recursion = recursiveFactorial(number);
		System.out.println("Result of the recursive algorithm: " + recursion);
		
		int loop = loopFactorial(number);
		System.out.println("Result of the loop algorithm: " + loop);
		 
		System.out.println("---------------------------------");

		for (int j = 1; j <= number; j++)
			System.out.println("Factorial of " + j + " is " + recursiveFactorial(j));

		 
	/*
	* Computing the factorial with a recursive algorithm
	*/		 
	}
	
	public static int recursiveFactorial(int n) {
		
		if (n == 1) 
			return 1; 
		else 
			return n * recursiveFactorial(n - 1);
	}

	/*
	* Computing the factorial with a loop
	*/		 
	public static int loopFactorial(int n) {

		int f = 1;
		for (int i = 1; i <= n; i++)
			f = f * i;
		return f;
	}
}
