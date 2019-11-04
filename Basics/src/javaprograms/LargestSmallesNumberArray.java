package javaprograms;

import java.util.Arrays;

public class LargestSmallesNumberArray {

	public static void main(String[] args) {

		int[] numbers = {10,2,5,3,55,1};
		
		//initialize largest and smallest numbers with first element
		//it will be easy to compare 
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		//time complexity is O(n)
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>largest)
			largest = numbers[i];
		
			else if(numbers[i]<smallest)
			{
			smallest = numbers[i];
			}

		}		
		
		System.out.println("the given array is::" +Arrays.toString(numbers));
		System.out.println("the largest number is:"+largest);
		System.out.println("the smallest number is::"+smallest);
	
	}

}
