package javaprograms;

public class StringReverse {

	public static void main(String[] args) {

		String str = "My name is Maddy";
		int count = 0;
		char[] ch = str.toCharArray();
		System.out.println(ch);
		//to find the string length
		try
		{
		for(int i=0;ch[i]!='\0';i++)
		{
			count++;
			
		}
		}
		catch(Exception e)
		{
		System.out.println("the lenght of the given string is:"+count);
		}
		
		String rev = "";
		//char ch1[] = rev.toCharArray();
		for(int k=count-1;k>=0;k--)
		{
			 rev = rev + str.charAt(k);
			
		}
		 
	System.out.println("the string afetr reverse is:"+rev);
	}

}
