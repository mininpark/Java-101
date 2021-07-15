public class naiveSearch {
	public static void main(String[] args) {
		int b[] = { 2, 5, 6, 3, 4, 17, 9, 12 };

		System.out.println("The position of 12 is " + naive_search(b, 12));
		System.out.println("The position of 2 is " + naive_search(b, 2));
		System.out.println("The position of 9 is " + naive_search(b, 9));
		System.out.println("The position of 17 is " + naive_search(b, 17));
		System.out.println("The position of 23 is " + naive_search(b, 23));
	}
	
	
	/*
	* A naive search algorithm
	*/
	public static int naive_search(int[] a, int e) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == e) {
				return i;
			}
		}
		return -1;
	}
}
