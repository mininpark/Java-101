public class List {
	
	public Node head;
	
	public void PrintList()
	{
		Node n;
		n = head;
		
		//System.out.println();
		
		while (n != null)
		{
			//System.out.print(n.data);
			n.data.print(); //print start data

			if (n.next != null)
			{
				System.out.println("~~~~~~~~~~~~~~");
			}

			n = n.next;
		}
	}
	
	
	public void insertAtHead(Entry d)
	{
		Node n = new Node();
		n.next = head;
		n.data = d; 
		this.head = n;
	}
	// we create the Node with new Node() and set the value in d 

	public Entry find(String key) //find a key in entry
	{
		Node n; 
		n = head; 
		while (n != null) // as long as we have a refenrence to a node, we can check
		{
			if (n.data.key.equals(key)) // if (n.data==key)
				return n.data; //if key.data is equals to key, retrun true
			n = n.next;		// else, we go to next element
		}
		return null; // we didn't find it
	}
	
	public boolean isInList(String s) // to check, if the data equal to string s
	{
		Entry k;

		k = find(s);

		if (k==null)
			return false;
		return true;

	/*	Node n; //we need reference 
		n = head; // we are in List, where we start(initialize) is head of list
		while (n != null) // as long as we have a refenrence to a node, we can check
		{
			if (n.data.equals(s)) // if (n.data==s)
				return true; //if n.data is equals to s, retrun true
			n = n.next;		// else, we go to next element
		}
		return false; // if the reference empty (null), return false -> we didn't find it
	*/
}	
	
	public void delete(String s)
	{
		Node n; //go to position where we want to do
		n = head; // start in head
		
		if (n==null) // empty list: if n == null we can't delete anything, so just return
			return;
			
		if (n.data.key.equals(s)) // delete
			head = n.next;
	
		while (n.next != null) // how long we do as long as n.next!=null
		{
			if (n.next.data.key.equals(s)) {
				n.next = n.next.next;
				return;
			}
			n = n.next; //if not, we go one element further
		}
		return;
	}
}