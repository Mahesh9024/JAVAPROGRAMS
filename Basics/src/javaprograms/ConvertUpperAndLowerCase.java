package javaprograms;

public class ConvertUpperAndLowerCase {

	public static void main(String[] args) {


		String str = "cognizant";
			
		int len = str.length();
						
		for(int i=0;i<len;i++)
		{
			 if(i%2==0)
			 {
				System.out.print(Character.toLowerCase(str.charAt(i)));
				
			 }
			 else
			 {
				 System.out.print(Character.toUpperCase(str.charAt(i)));
			 }
			
		}	
		
		
	}

}
