package javaprograms;

public class Fibonacci {
	
	
	public static void fiboCount(int num)
	{
		int fibo;
		int f1=0;
		int f2=1;
		
		
		for(int i=0;i<num;++i)
		{
			fibo = f1+f2;
			System.out.println("fibonacci series if: "+fibo);
			f1=f2;
			f2=fibo;
						
		}

		
	}
	
	public static void main(String[] args) {

		fiboCount(5);
		
		
		
	}

}
