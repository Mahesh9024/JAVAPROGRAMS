package javaprograms;

public final class SwapTwoStrings {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println("the string vales before swapping is::");
		System.out.println("str1 value is::"+str1);
		System.out.println("str2 value is::"+str2);
		
		//1. append a and b
		str1 = str1+str2; //HelloWorld
		//System.out.println(str1);
		
		//2. store initial string str1 in string str2
		str2 = str1.substring(0,str1.length()-str2.length()); //it will starts from inex 0 till 5 element
		//0 is index nad 5 indicates how many elements
		
		//3. store initial str2 in to string str1
		str1 = str1.substring(str2.length());
		System.out.println("*********************************");
		System.out.println("After swapping string are::");
		System.out.println("str1 value is::"+str1);
		System.out.println("str2 value is::"+str2);
		
	}

}
