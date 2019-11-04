package javaprograms;

import java.util.Scanner;

public class StringlengthUsingForEach {

	public static void main(String[] args) {

		int count=0;
		String str;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		str = sc.nextLine();
		System.out.println("The entered String is "+str);
		//to convert ti to character array
		char ch[] = str.toCharArray();
		for(char c : ch)
		{
			count++;
		}
		
		System.out.println("the length of the string is:"+count);
	}

}
