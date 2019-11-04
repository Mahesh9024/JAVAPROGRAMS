package javaprograms;

public class SecondSmallestElement {

	
	public static void secondsmallest(int arr[])
	{
		int smallest = arr[0];
		int secondsmallest = arr[0];
		
		System.out.println("The array elements are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"\t");
		}
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				secondsmallest = smallest;
				smallest = arr[i];
			}
		 else if(arr[i]<secondsmallest)
		{
			secondsmallest = arr[i];
		}
		}
		System.out.println("The second smallest element is:"+secondsmallest);
	}
	
		
	public static void main(String[] args) {

	int arr[] = {2,4,3,1,5,7};
	secondsmallest(arr);
		
		
	}

}
