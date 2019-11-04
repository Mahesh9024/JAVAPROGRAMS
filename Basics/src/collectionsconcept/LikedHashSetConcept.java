package collectionsconcept;

import java.util.LinkedHashSet;

public class LikedHashSetConcept {

	public static void main(String[] args) {

		
		//it maintains insertion order

		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		ls.add("Selenium");
		ls.add("QWERTY");
		ls.add("JAVA");
		ls.add("HELLO");
		ls.add("HELLO");//duplicate values
		
		System.out.println(ls);
		
		//to iterate all the values
		for(String name : ls)
		{
			System.out.println(name);
		}
		
		
		
	}

}
