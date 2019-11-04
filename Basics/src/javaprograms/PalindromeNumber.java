package javaprograms;

public class PalindromeNumber {

	public static void palindrome(int num)
	{
		int revnum =  0;
		//int sum = 0;
		int t=num;
		while(num!=0)
		{
			
			revnum = revnum * 10;
			revnum = revnum + num%10;
			num = num/10;
		}
		System.out.println("the given number is:"+t);
		System.out.println("The reverse number is:"+revnum);
		 if(t==revnum)
		 {
			 System.out.println("the number is palindrome number");
		 }
		 else
		 {
			 System.out.println("not a palindrome");
		 }
	}	
	public static void main(String[] args) {

		palindrome(124421);
		palindrome(1234);
		palindrome(0);
		palindrome(55);
	}
	

}
