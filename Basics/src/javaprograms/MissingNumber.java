package javaprograms;

public class MissingNumber {

	public static void main(String[] args) {

		//This program will find missing number in a array
		//all numbers should be in sequence order
		//int a[] = {1,2,3,5};
		//sum = 11
		//total sum of sequence is 1+2+3+4+5 = 15
		//to find missing number 15-11 = 4 
		
		int a[] = {1,2,3,4,5,7};
		
		//to find sum of series
		int sum = 0;
		int len = a.length;
		for(int i=0; i<len;i++) //starts fro 0 to < 6
		{
			sum = sum + a[i];
		}
		
		System.out.println("the sum of numbers is:"+sum);

		//to find sum of series of sequence
		int sum1 = 0;
		for(int j=1;j<=7;j++)
		{
			sum1 = sum1 + j;
		}
		System.out.println("the sum os sewuence is:"+sum1);
	
		
		//to find missing number
		System.out.println("the missing nuber is :::"+(sum1-sum));
		
	}

}
