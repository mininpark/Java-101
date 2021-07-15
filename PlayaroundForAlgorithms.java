
public class PlayaroundForAlgorithms {
/*
	static int minimum(int [] a)
	{
		int min;
		
		min = a[0];
		for (int i=1; i < a.length; i++)
		{
			if (min > a[i])
				min = a[i];
		}
		return min;
	}
	
	
	static int factorial(int n)
	{
		// 1! = 1; n! = n*(n-1)!
		
		// we are no longer scared about recursion, so we don't use a loop here
		
		//	System.out.println("Factorial parameter "+n);
		
		if (n <= 1)
			return 1;
		else
		{
			System.out.println("n : "+n+"* factorial( "+ n +"-1 )");
			return n*factorial(n-1);
		}
		/*
		int k=1;
		int r=1;
		
		while(k<=n)
		{
			r = r*k;
			k++;
		}
		return r;
		
	}
	
	
	public static void main(String[] args) {
		/*
		int [] b = {11,2,5,4,7, 17,21,13};
	
		int m = minimum(b);
		int l = 7;
		
		while (l>0)
			System.out.println("The factorial of "+l+" is "+factorial(l--));
	}
}

//List.java
public static void main(String[] args) { 
	List l;

	l = new List();

	l.insertAtHead("Anton");
	l.insertAtHead("Joshua");
	l.insertAtHead("Baby");
	l.insertAtHead("Anton");
	l.insertAtHead("Moritz");
	l.insertAtHead("Anton");

	l.PrintList();
	System.out.println();

	System.out.println(l.isInList("Joshua"));
	System.out.println(l.isInList("Mina"));

	while (l.isInList("Anton"))
	{
		l.delete ("Anton");
		l.PrintList();
		System.out.println();
	}
}
*/
//test hashmap
public static void main(String[] args) {
/*
	Hashmap h; 
	
		h = new Hashmap();
	
		h.insert("Aloha");
		h.insert("aloha");
		h.insert("Guose");
		h.insert("Mina");
		h.insert("Kal Max");
		h.insert("Leopard");
		h.insert("Zebra");
		h.insert("Vogel");
		h.insert("Ägyten");
		h.insert("Übung");
		h.insert("!");
	
	
		h.printHashmap();
	
		System.out.println(h.get("Pony"));
		System.out.println(h.get("Zebra"));

		h.delete("Vogel");
		h.printHashmap();

	*/

//Entry
	Hashmap l;
	l = new Hashmap();

	Entry e;

	e = new Entry("Becker", "Christian Becker", 621183449, "68159 Mannheim", "park@gmail.com"); 
/* instead of each inserting 
	e.key = "1234";
	e.name = "Mina";
*/
	l.insert(e);

	e = new Entry("Becker", "Christian Becker", 621183449, "68159 Mannheim", "park@gmail.com"); 
	l.insert(e);

	e = new Entry("Beier", "Julian Beier", 4711, "68159 Mannheim", "julian@gmail.com"); 
	l.insert(e);

	e = new Entry("Semmy", "Camilie Semmy", 156489, "68159 Mannheim", "camilie@gmail.com"); 
	l.insert(e);

	l.printHashmap();

//	l. PrintList();

	e = l.get("Beyer");

	if (e == null)
		System.out.println("Not found");
	else
		e.print();


}
}
