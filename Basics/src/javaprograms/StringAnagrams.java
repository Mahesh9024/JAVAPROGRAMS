package javaprograms;

import java.util.Arrays;

public class StringAnagrams {

	
	public static void isAnagrams(String name1, String name2)
	{
		boolean status = true;
		
		int len1 = name1.length();
		int len2 = name2.length();
		
		if(len1!=len2)
		{
			status=false;
		}
		
			
		//since string is immutable in java, So we have to convert it to charcter first
		char[] a = name1.toLowerCase().toCharArray();
		char[] b = name2.toLowerCase().toCharArray();
		
		//sorting using built-in sort function
		Arrays.sort(a);
		Arrays.sort(b);
		
		status = Arrays.equals(a, b);
		
		/*
		 * for(int i=0;i<a.length;i++) { if(a[i]==b[i]) {
		 * System.out.println("both words are anagrams:"); } }
		 */
		
		if(status)
		{
			System.out.println("The " +name1+ " And " +name2+ " are Anagrams");
		}
		
		else
		{
			System.out.println("The " +name1+ " And " +name2+ " are not Anagrams");
		}
	}
	
	
	public static void main(String[] args) {


		isAnagrams("keep","peeK");
		
	}

}


