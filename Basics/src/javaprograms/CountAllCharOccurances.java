package javaprograms;

public class CountAllCharOccurances {
	
	public static void occuranceOfCharacter(String str)
	{
		
		//String length
		int len = str.length();
		
		//ASCII values ranges upto 256
		int counter[] = new int[256];
		
		//This Array holds the occurance of each char, for example ASCII value of 'A' is 65 , if A is fould twice then 
		//counter[65] would have the value 2,
		//here 65 is the ASCII value of A
		for(int i=0; i<len; i++)
		{
			counter[str.charAt(i)]++;
		}
		System.out.println("***********");
		//we crae cretaing another array with the length of the string
		char arr[] = new char[str.length()];
		
		for(int i=0; i<len;i++)
		{
			arr[i]=str.charAt(i);
			int flag = 0;
			for(int j=0;j<=i;j++)
			{
				//if a char fould in string then set the flag 
				if(str.charAt(i)==arr[j])
				{
					flag++;
				}
				
			}
		
			if(flag == 1)
				System.out.println("Occurance of character " +str.charAt(i)+ " in the given String is: " +counter[str.charAt(i)]);
		}
	}
	

	public static void main(String[] args) {

		occuranceOfCharacter("Welcome to Bangalore");
				
	}

}
