package javaprograms;

public class Factorial {

	//This program is to find the factorial of a given  number
	//fact of number is = 5*4*3*1 = 120
	//fact of 1 = 1
	//fact of 0 = 1
	
	public static void factorial(int number)
	{
		if(number==0)
		{
			System.out.println("factorial of a given number is:"+number);
		}
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact = fact*i;
		}
		
		System.out.println("the factorial of a number: "+number+ "is:" +fact);
	}
	
	public static void main(String[] args) {

		factorial(5);
		factorial(1);
		factorial(0);
		
		
	}

}
