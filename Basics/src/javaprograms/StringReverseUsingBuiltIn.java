package javaprograms;

public class StringReverseUsingBuiltIn {

	public static void main(String[] args) {

		String str = "Bangalore is a garden city";
		
		int len = str.length();
		
		System.out.println("The length of the string is:"+len);
		
		System.out.println("the entered string is:"+str);
		StringBuilder str1 = new StringBuilder();
		str1.append(str);
		str1.reverse();
		
		System.out.println("the reverse of a String is:"+str1);
		
		
		
		
	}

}
