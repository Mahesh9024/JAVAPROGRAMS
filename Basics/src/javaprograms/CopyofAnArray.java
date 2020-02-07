package javaprograms;

public class CopyofAnArray {

	public static void main(String[] args) {

		int array1[] = new int[] {1,4,6,4,32,5};
		int array2[] = new int[array1.length];
		
		System.out.println("The array1 elements are :");
		for(int i=0;i<array1.length;i++)
		{
			System.out.println(array1[i]);
		}

		//to copy an elements
		for(int i=0;i<array1.length;i++)
		{
			array2[i]=array1[i];
		}
		
		System.out.println("Array2 elements are:");
		for(int i=0;i<array2.length;i++)
		{
			System.out.println(array2[i]);
		}
		
	}

}
