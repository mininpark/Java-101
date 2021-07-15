public class multiplication {


	public static void main(String[] args) {
//		int x = 13;
//		int y = 17;
//		System.out.println("The product of " + x + " and " + y + " is " + multiply(x, y));
		int [] arr  = {5,10,17,22};
		for(int i = 0; i < arr.length; i++)
			System.out.println(test(arr)[i]);
	}
	

	/*
	* A simple example for a function: multiplication
	*/
	public static int multiply(int a, int b) {
		int result = 0;
		for (int i = 0; i < a; i++)
			result = result + b;
		return result;
	}

	
	public static int[] test(int[] values) {
		int[] result = new int[values.length];
		int lastRelevant = 0;
		for (int n = 0; n < values.length; n++) {
			boolean relevant = true;
			for (int i = 2; i < values[n]; i++) {
					if ((values[n] % i) == 0) {
						relevant = false;
					}
			}
			if (relevant) {
				result[lastRelevant] = values[n];
				lastRelevant++;
			}
		}
		return result;
	}	
}
