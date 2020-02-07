package javaprograms;

public class PrimeNumbers {

	//The Prime Number is a number which can be divided by itself and 1
	//ex 2, 3, 5, 7, 9,11,13
	//1 and 0 are not a prime numbers
	
	public static  boolean isPrimenumber(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num % i == 0)
			{
			return false;
			}
		}
		return true;
	}
	
	public static void getPriemNumbers(int num)
	{
		for(int k=2; k<=num; k++)
		{
			if(isPrimenumber(k));
			System.out.println(k + "");
		}
	}
	public static void main(String[] args) {

		System.out.println("The given number is Prime Number:"+isPrimenumber(2));
		System.out.println("The given number is Prime Number:"+isPrimenumber(3));
		System.out.println("The given number is Prime Number:"+isPrimenumber(5667));
		System.out.println("The given number is Prime Number:"+isPrimenumber(4));
		getPriemNumbers(7);
	}

}
