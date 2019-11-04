package javaprograms;

public class SwapNumbers {

	public static void main(String[] args) {

		//This program will swap 2 integer numbers:
		
		int x=10;
		int y=5;
		
		//1.Using temporary variable
		System.out.println("the numbers before Swaping::"+ "\n" + "x = "+x+ "\n" + "y ="+y);
		int t;
		t=x;
		x=y;
		y=t;
		System.out.println("the numbers after swap::" + "\n"+"x = "+x+"\n"+"y = "+y);
		System.out.println("***************************");
	
	
		//2 without using third variable
		int a=20;
		int b=30;
		
		System.out.println("the numbers are:"+a+"&" +b);
	
		a = a+b;//50
		b = a-b;//50-30 = 20
		a = a-b;//50-20 = 20
		
		System.out.println("the numbers after swapping::"+a+"\n"+b);
	
	}

}
