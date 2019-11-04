package javaprograms;

public class OccuranceofCharcter {

	
	public static void isCharPresent(String str, char ch)
	{
		int len = str.length();
		int count = 0;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
			
		}
		System.out.println("the occurance of character: " +ch+ " is: "+count);
		
	}
	
	
	public static void main(String[] args) {

		String str = "Bangalore";
		char ch = 'a';
		
		isCharPresent(str, ch);
		
		
		
	}

}
