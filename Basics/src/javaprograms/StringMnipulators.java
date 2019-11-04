package javaprograms;

public class StringMnipulators {

	public static void main(String[] args) {


		//1.different ways of creating strings
		String s = new String("My String");
		String str = "Bangalore is a Garden City";
		String str1 = "Bangalore is a garden City";
		
		System.out.println(s);
		System.out.println(str);
		
		//2. to find length of the string
		int len = str.length();
		System.out.println("the length is:"+len);
		
		//4.to find the specific charcter at a given index
		System.out.println("the charcter in the index 10 is:"+str.charAt(10));
		
		//3. to find the index of a specific charcter
		int index = str.indexOf('a');
		System.out.println("the index of 'a' is:"+index);
		
		//5.suppose if there are 2 o in the string then we need that o index also to be printed
		//second occurance of 'a'
		int index1 = str.indexOf('a', index+1);
		System.out.println("the index of a is:"+index1);
		
		//6. to get the index of string
		System.out.println("the index of string garden is::"+str.indexOf("Garden"));
		
		//7.if the particular is not available it will return -1
		System.out.println("checking for the hello string:"+str.indexOf("hello"));
		
		//8. String comparison
		System.out.println("The two string comparison:"+str.equals(str1));
		
		//9. checking for the case sensitive strings
		System.out.println("case should be ignored:"+str.equalsIgnoreCase(str1));
		
		//10. To get substring, to get the small string from the biggest string
		//we have to pass 2 index , start index and ending index
		System.out.println("the substring is:"+str.substring(4, 8));
		
		//11. trim -- it will remove the spaces in front and end of the string
		// it is used only to remove spaces in front and end
		String str2 = "    hello world     ";
		System.out.println("the string after trim is:"+str2.trim());
		
		//12. replace method , to remove spaces inbetween string
		//replace first character with the second character
		System.out.println("to remove space inbetween string:"+str2.replace(" " , ""));

		//13 . Split Method -- 
		//it will split on the basis of the chacter passed
		String test = "hello_world_selenium_qtp";
		System.out.println("before split:"+test);
		String testsplit[] = test.split("_");
		for(int i=0;i<testsplit.length;i++)
		{
			System.out.println("Split method on test string:"+testsplit[i]);
		}
		
		//14. concating of string -- it will concat two strings
		System.out.println("after concatingating:"+str1.concat(str2));
		
		//15.  Adding / merging/concatinating two strings
		//we can concat string with any values like double, int, float , char values
		String x = "hello";
		String y = "world";
		int m = 100;
		int n = 200;
		System.out.println(x+y); //hellowowrld
		System.out.println(m+n); //300
		System.out.println(x+y+m+n); //helloword100200
		System.out.println(m+n+x+y); //300helloworld
		System.out.println(x+y+(m+n)); //hellowowrld300
		
		
	}

}
