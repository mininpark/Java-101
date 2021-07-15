//data management
public class Entry {
    public String key; //one identifying key for datas --> Data element key

    public String name;
    public int telefon;
    public String Address;
    public String email;

    //Counstructor
    public Entry(String k, String n, int telefon, String adr, String email)
    {
        key = k;
        name = n;
        this.telefon = telefon;
        Address = adr;
        this.email = email;

    }
    public void print()
    {
        System.out.println("Key:"+key);
        System.out.println("Name: "+name);
        System.out.println("Address: "+Address);
        System.out.println("Telefon-Nr: "+telefon);
        System.out.println("Email: "+email);
    }
    int value;
}