package javaprograms;

public class ArmstrongNumbers {
	
	//cube of all the numbers and their sum should be same as the given number
	//153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
	//407 = 4*4*4 + 0 + 7*7*7
	
	
	
	public static void isArmstrongNumber(int num)
	{
		int temp = num;
		int r;
		int cube = 0;
		
		while(num>0)
		{
			r = num%10;
			num = num/10;
			cube = cube+(r*r*r);
		}
		
		if(temp==cube)
		{
			System.out.println("the number is armstrong number");
		}
		else
		{
			System.out.println("this is not an armstrong number");
		}
		
	}
	
	public static void main(String[] args) {

		isArmstrongNumber(153);
		isArmstrongNumber(0);
		isArmstrongNumber(1);
		isArmstrongNumber(15);
	}

}
