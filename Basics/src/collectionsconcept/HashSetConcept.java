package collectionsconcept;

import java.util.HashSet;

public class HashSetConcept {

	public static void main(String[] args) {


		//to handle window objects we can use set interface
		HashSet<String> hs = new HashSet<String>();
		
		//to add the values
		hs.add("Selenium");
		hs.add("QTP");
		hs.add("QWERTY");
		hs.add("QWERTY");
		hs.add("a");
		hs.add("welcometobangalore");
		System.out.println(hs);
		
		//to iterate the values 
		for(String name : hs)
		{
			
			System.out.println(name); 
		
		}
	}

}
