public class binarySearch {
	public static void main(String[] args) {
		int b[] = { 2, 5, 6, 3, 4, 17, 9, 12 };
		// int b[]={2, 3, 4, 5, 6, 9, 12, 17};
		
		 System.out.println("The position of 12 is "+binary_search(b,12));
		 System.out.println("The position of 2 is "+binary_search(b,2));
		 System.out.println("The position of 9 is "+binary_search(b,9));
		 System.out.println("The position of 17 is "+binary_search(b,17));
		 System.out.println("The position of 23 is "+binary_search(b,23));
		
		/*
		* int b1[]={2, 3, 4, 5, 6, 9, 12, 17};
		* 
		* System.out.println("The position of 12 is "+binary_search(b1,12));
		* System.out.println("The position of 2 is "+binary_search(b1,2));
		* System.out.println("The position of 9 is "+binary_search(b1,9));
		* System.out.println("The position of 17 is "+binary_search(b1,17));
		* System.out.println("The position of 23 is "+binary_search(b1,23));
		*/
	}
	
	
	/*
	* binary search algorithm
	* Note: the search algorithms either return the index of the element or -1
	*/
	public static int binary_search(int[] a, int e) {
		int lo, mid, hi;
		lo = 0;
		hi = a.length - 1;

		while (lo <= hi) {
			mid = (lo + hi) / 2;
			
			if (a[mid] == e)
				return mid;
			else if (e < a[mid])
				hi = mid - 1;
			else if (e > a[mid])
				lo = mid + 1;
		}
		return -1;
	}
}
