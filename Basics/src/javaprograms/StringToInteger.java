package javaprograms;

public class StringToInteger {
	
	
	public static void isValue(String str)
	{
		
		//1. To convert string to an double, we have to use parseDouble() method
		double d = Double.parseDouble(str);
		System.out.println(d);
		int i=10;
		double sum = i+d;
		System.out.println("sum="+sum);
		
			
	}
	 public static void isValue1(String str)
	 {
		 int k=10;
		 Integer i=Integer.parseInt(str);
		 int sum = k+i;
		 System.out.println("Integer sum : ="+sum);
	 }

	public static void main(String[] args) {


		isValue("12.5");
		isValue1("11");
		
	}

}
