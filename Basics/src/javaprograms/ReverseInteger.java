package javaprograms;

public class ReverseInteger {

	public static void main(String[] args) {

		int revnum = 0;
		int num = 9876;
		
		System.out.println("the number before reversing is:"+num);
		
		//1 . solution
		while(num!=0)
		{
			revnum = revnum * 10;
			revnum = revnum +  num%10; // revnum = revnum *10 + num%10;
			num = num/10;
			
			
		}
		
		System.out.println("the number after reverse is:"+revnum);
	
		//2 .solution
		long  num1 = 123456;
		System.out.println("numvber2 after reverse is:"+new StringBuffer(String.valueOf(num1)).reverse());
	
	
	
	}
	

}
