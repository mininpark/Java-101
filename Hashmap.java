
public class Hashmap {
	// HashMaps aim to combine the benefits of both lists and arrays & save in BUCKETS
	// list: easy insertion of elements
	// arrays: direct acces

	private List[] hashtable; //what kind of type of hashtable? List of array
	// A-Z IDs mapped to 0,...,25
	// nobody else does't need to know about the hashtable --> private

	// Constructor = Function to initalize Data strucutre
	Hashmap() //void init(); for crating object e.g.) Hashmap h = new Hashmap(); h.init();
	{ //put datas in hashmap
		hashtable = new List[26];
		for (int i=0; i<26; i++)
			hashtable[i] = new List(); //create new element
	}
	
	private int hash(String s) //hash function private
	{
		char c = s.charAt(0); // it takes first charactes of string
		// c = s[0] the java way to say this..
		if( (c>='a') && (c<='z')) //all the characters are between small a and z
		{
			return c-'a';
		}
		if( (c>='A') && (c<='Z')) //all the characters are between big A and Z
		{
			return c-'A';
		}
		return 0; //if something different comes, returns 0 (e.g. !, ö, ä, ü)
	}
	
	public void insert(Entry s)
	{
		int h=hash(s.key);
		hashtable[h].insertAtHead(s); //to enter the Head bucket
	}
	
	public Entry get(String s) 
	{	
		int h=hash(s);
		return hashtable[h].find(s);
	}
	
	public void delete(String s)
	{
		int h=hash(s);
		hashtable[h].delete(s);
	}
	
	public void printHashmap()
	{
		System.out.println();
		
		for (int i=0; i<26; i++) 
		{
			System.out.print("ID: "+(char)(i+'A')+" Bucket: ");
			hashtable[i].PrintList(); //print the buckets
			System.out.println();
		}
	}	
}