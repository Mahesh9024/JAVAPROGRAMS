package javaprograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		String[] str = {"java","javaScript","Phyton","Java","Ruby","java","Ruby"};
		
		int len = str.length;
		
		//1.Method 
		//here time complexity is O(n*n)
		//worst approach because it takes more time
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(str[i].equalsIgnoreCase(str[j]))
				{
					System.out.println("the duplicate string is:"+str[i]);
				}
				
			}
		}
		
		System.out.println("********************************");
		
		//2.Method
		//time complexity is O(n)
		//here we are using HasSet
		//set object cannot store duplicate values
		Set<String>  store = new  HashSet<String>();
		
		for(String name : str)
		{
			if(store.add(name) == false)
			{
				System.out.println("duplicate element is:"+name);
			}
		}
	
	
		//3.Method
		//using HashMap
	
	
	
	}

}
