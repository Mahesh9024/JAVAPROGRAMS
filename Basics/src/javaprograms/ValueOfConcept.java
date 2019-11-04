package javaprograms;

public class ValueOfConcept {

	public static void isValueOfInteger(String str)
	{
		int k=10;
		
		Integer i = Integer.valueOf(str);
		
		int sum = k+i;
		
		System.out.println("integr sum:"+sum);
		
		
	}
	
	public static void isValueOfDouble(String str)
	{
		double k = 12.34;
		double d = Double.parseDouble(str);
		double sum = k+d;
		System.out.println("Double sum is:"+sum);
	}
	
	public static void isValueOfFloat(String str)
	{
		float f = (float) 12.23;
		//float f1 = Float.parseFloat(str);
		float f2 = Float.valueOf(str);
		float sum = f+f2;
		System.out.println("The float sum is:"+sum);
		
		
	}
	public static void main(String[] args)
	{
		isValueOfInteger("11");
		isValueOfDouble("12.32");
		isValueOfFloat("12.22");
		
	}
	
	
}
