package patterns;

public class NumberPattern3 {

	public static void isPattern(int rows)
	{
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+"");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		isPattern(5);	
		
	}

}
