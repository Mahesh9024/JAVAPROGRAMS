package javaprograms;

public class SecondLargestElement {

	public static void secondLargest(int[] arr)
	{
		int largest = arr[0];
		int secondlargest = arr[0];
		
		
		System.out.println("The given array is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"\t");
		}
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondlargest = largest;
				largest = arr[i];
			}
			else if(arr[i]>secondlargest)
			{
				secondlargest = arr[i];
			}
		}
		System.out.println("the second largest element in an array is:"+secondlargest);
	}
	
	
	public static void main(String[] args) {

		
		int arr[] = {1,4,33,2,54,76,9,2};
		secondLargest(arr);
		
		int arr1[] = {22, 33, 44, 55, 66, 77};
		secondLargest(arr1);
		
		
	}

}
