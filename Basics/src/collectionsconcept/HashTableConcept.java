package collectionsconcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {

		//it stores the value basis on key and value combination
		//it is synchronised -- only one thread can access the hashTable at a time
		// so only it's called thread-safe
		//it uses hashcode to store the object
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "Selenium");
		ht.put(2,"Java");
		ht.put(3, "QTP");
		
		//craete a clone or shallow copy of hashtable
		//what ever values are avalbe in ht are also availbel in h1
		Hashtable h1 = new Hashtable();
		h1 = (Hashtable)ht.clone();
		
		System.out.println("The values from ht:"+ht);
		System.out.println("The values from h1:"+h1);
		
		//To clear all the hashTable use clear() method
		
		ht.clear();
		System.out.println("The values from ht:"+ht);
		System.out.println("The values from h1:"+h1);
		
		//contains() - to check whetehr the particluar value is avialable or not
		Hashtable<String, String> h2 = new Hashtable<String, String>();
		h2.put("A" ,"Maddy");
		h2.put("B", "Gow");
		h2.put("C", "asdf");
		
		if(h2.containsValue("Maddy"))
		{
			System.out.println("Value is Found");
		}
		else
		{
			System.out.println("Not Found");
		}
		
		
		//Print all the values from HashTable using Enumeration -- elements()
		Enumeration e = h2.elements();
		System.out.println("Print values from h2 using enumeration:");
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		//to get all the values from hashTable using -- entrySet()
		System.out.println("Print all the values using entryset");
		Set s = h2.entrySet()		;
		System.out.println(s);
		
		//checking both the hashTable are qual or not
		if(h1.equals(h2))
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
		//To get the value based on Key
		System.out.println("based on key:"+h2.get("B"));
	
		//HashCode() -- to get the hashcode of the particular hashTable
		System.out.println("HashCode of h2 HashTable:"+h2.hashCode());
		
		//The amin difference between hashMap and hashTable is 
		//hashMap can contain 1 null key and multiple null values, it's non-synchronised
		//but, hashTable cannot contain any null key or null values, it's synchronised
		
	}
}