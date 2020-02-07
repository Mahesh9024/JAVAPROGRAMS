package patterns;

public class StarPattern1 {

	
	public static void starPattern(int row)
	{
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
	
	public static void main(String[] args) {

		
		starPattern(5);		
		
	}

}
