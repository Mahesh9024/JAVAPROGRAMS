package javaprograms;

public class FactorialWithRecursion {

	//Recursive: the function calls itself is called recursive function
	//Time Complexity is O(n)
	public static int fact(int num)
	{
		if(num==0)
		{
			return 1;
		}
		else
			return (num * fact(num-1));
	}
	
	
	public static void main(String[] args) {

		
		System.out.println(fact(5));
		System.out.println(fact(6));
		System.out.println(fact(0));
		System.out.println(fact(1));
		
	}

}
