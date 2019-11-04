package collectionsconcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Selenium");
		ll.add("QTP");
		ll.add("Test");
		ll.add("RPA");
		ll.add("RFT");
		
		//to print entire linkedlist elements
		System.out.println("contents of linked list are:"+ll);
		
		//to add First element
		ll.addFirst("Maddy");
		
		//Adding Last element
		ll.addLast("Gowda");
		
		System.out.println(ll);
		
		//get() Method
		System.out.println(ll.get(1));
		
		//Set() Method -- to set an value for the particular index
		ll.set(0, "Mahi");
		System.out.println("after adding an element into the 0 index:"+ll);
		
		//remove first and last element
		ll.removeFirst();
		System.out.println("after removinf first entry:"+ll);
		
		//remove last
		ll.removeLast();
		System.out.println("After removing last entry:"+ll);
		
		//to remove particular entry based on index
		//if we don't specify the index, it will remove first(0th) element
		ll.remove(0);
		System.out.println(ll);
		
		//How to Ierate or print all the vaues of LinkedList
		//1. for loop
		//2. While loop
		//3. Advanced for loop
		//using iterator
		
		//1. using for loop
		System.out.println("********using for lop************************");
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("*************Using Advane=ced for Loop***************");
		
		//2. using Advaned for loop ie., for-each loop
		for(String name:ll)
		{
			System.out.println(name);
		}
		
		
		//3. using While Loop
		System.out.println("*********using WHile loop*****************");
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num++;
		}
		
		
		System.out.println("*******Using Iterator***********************");
		//4. Using iterator
		Iterator<String> it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
