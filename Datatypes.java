public class Datatypes {
	/*
	* A simple example for data types
	*/
	public static void main(String[] args) {
		/*
		* An array of strings
		*/		
		String[] friends = { "Anna", "Bernhard", "Charlie", "Fred" }; 

		for (int i = 0; i < friends.length; i++)						
			System.out.println(friends[i]);								

		/*
		* An array of integers
		*/	
		int[] primes = { 1, 2, 3, 5, 7, 11, 13, 17 };

		for (int i = 0; i < primes.length; i++)
			System.out.println(primes[i]);
		
		/*
		* An array of chars
		*/	
		char[][] board;
		board = new char[4][5];
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 5; j++)
				if (i == j)
					board[i][j] = 'x'; // "a" is a string 'a' is a character!
				else
					board[i][j] = '.';

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++)
				System.out.print(board[i][j]);
			System.out.println();
		}
	}
}
