package javaprograms;

public class PalindromeStrings {
	
	public static void isPalindrome(String str)
	{
		String temp = str;
		int len = str.length();;
		String rev = "";
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		
		if(temp.equals(rev))
		{
			System.out.println("the given string is palindrome");
		}
		else
		{
			System.out.println("the goiven strings are not palindrome");
		}
	}
	

	public static void main(String[] args) {

		isPalindrome("malayalam");
		isPalindrome("kanak");
		isPalindrome("bangalore");
		
		
		
	}

}
