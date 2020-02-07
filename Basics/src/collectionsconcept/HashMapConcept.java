package collectionsconcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {


		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		//to store values
		hm.put(1, "Selenium");
		hm.put(2, "JAVA");
		hm.put(3,"QTP");
		hm.put(4, "QTP");
		
		System.out.println(hm);
		System.out.println("***********");
		////to fetch values
		System.out.println(hm.get(2));
		System.out.println(hm.get(4)); 
		System.out.println(hm.get(5));//it will not thorw any exception, instead it will print null
		System.out.println("*********************");
		
		//to iterate all the key
		//we have to use entry set
		for(Entry m : hm.entrySet())
		{
			System.out.println(m.getKey()+ ":" +m.getValue());
			
		}
		
		//To remove aparticular key
		hm.remove(2);
		System.out.println("After removal");
		System.out.println(hm);
		
		//Employee concept
		HashMap<Integer, Employees> emp = new HashMap<Integer, Employees>();
		
		Employees e1 = new Employees("Maddy",26,"QA");
		Employees e2 = new Employees("Raj",22,"DEV");
		Employees e3 = new Employees("Gowda",33,"JAVA");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//to iterate all the values
		for(Entry<Integer, Employees> n: emp.entrySet())
		{
			int key = n.getKey();
			Employees e = n.getValue();
			System.out.println("Employee "+key+ ": info" );
		//	String empname = e.name;
		//	System.out.println(empname);
			System.out.println(e.name + ":" +e.age + ":" +e.dept );
		}
		
			
	}



}
