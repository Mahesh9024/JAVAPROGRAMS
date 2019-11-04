package collectionsconcept;

import java.util.ArrayList;

public class ArrayLIstConcept {

	public static void main(String[] args) {

		//Static Array
		int a[] = new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		
		//a[4]=5  error , because array idex out of boud exception 
		//So , Use Dynamic Array , ArrayList
		
		ArrayList arr = new ArrayList();
		
		//To add an elements to the array
		arr.add(20);
		arr.add(30);
		arr.add(40);
		
		//to fetch array
		System.out.println("The array element is :"+arr.get(2));
		
		//again we cana dd into the array
		arr.add(50);
		arr.add("selenium");
		arr.add('A');
		System.out.println(arr.get(4));
		
		//in abvove array we are getting warning symbol because it's non-generic
		//Above examples are non-generic types of arraylist
		//because we cans tore any type of data into the array
		
		//To store only the particular type of array , we have to use generics like below example
		//here we will not et any warning symbols
		ArrayList<String> li = new ArrayList<String>();
		
		//li.add(20); error, becuase it's generic now and we should store only String type of data into the array Object
		li.add("selenoum");
		li.add("Java");
		li.add("C++");
		li.add("C");
		
		//to print all the values
		for(int i=0;i<li.size();i++)
		{
			System.out.println("The String array are:"+li.get(i));
		}
		
		//Integer Array Generic type
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(321);
		
		//When we are not sure about the data, we can pass e
		//ArrayList<E> arr3 = new ArrayList<E>();
		
		//addall method -- it will add all the element from one araylist to another arraylist
		ArrayList<String> str1 = new ArrayList<String>();
		str1.add("selenium");
		str1.add("Java");
		str1.add("Ruby");
		
		System.out.println("*****************");
		
		ArrayList<String> str2 = new ArrayList<String>();
		str2.add("Perl");
		str2.add("Python");
		
		str1.addAll(str2);
		for(int j=0;j<str1.size();j++)
		{
			System.out.println(str1.get(j));
		}
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		//removeAll() - Method will remove all the entries from the particular arrayList
		str1.removeAll(str2);
		for(int i=0;i<str1.size();i++)
		{
			System.out.println(str1.get(i));
		}
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
		
		//retainAll() -- this method will print or store only the common values or unique values
		ArrayList<String> str3 = new ArrayList<String>();
		str3.add("Pen");
		str3.add("Pencil");
		str3.add("eraser");
		
		ArrayList<String> str4 = new ArrayList<String>();
		str4.add("Pen");
		str4.add("page");
		str4.add("Lines");
		
		str3.retainAll(str4);
		for(int i=0;i<str3.size();i++)
		{
			System.out.println(str3.get(i));
		}
		
		
	}

}
