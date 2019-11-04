package javaprograms;

public class StringLengthUSingFor {

	public static void main(String[] args) {

		
		String str = new String("My name is MAddy");
		
		int count = 0;
		try 
		{
			
		for(int i=0; str.charAt(i)!= '\0' ;i++)
		 {
			 count++;
		 }
	}
	catch(Exception e)
	{
		
		System.out.println("the length of the String is"+count);
		System.out.println(e);
	}

}
	
}
