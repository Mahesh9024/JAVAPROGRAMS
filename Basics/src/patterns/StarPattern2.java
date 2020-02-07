package patterns;

public class StarPattern2 {

	public static void main(String[] args) {

		//int sc = 4; //space counter
		int row = 5; //row counter
		
		for(int i=1;i<=row;i++) //This for loop is for row
		{
			
			for(int j=4;j>=i;j--) //This loop is to print spaces
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
					
			
		}
		
		
		
		
		
	}

}
