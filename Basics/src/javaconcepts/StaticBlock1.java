package javaconcepts;

public class StaticBlock1 {

	static int i;
	int j;
	StaticBlock1()
	{
		System.out.println("This is constructor block");
	}
	
	static
	{
		i=10;
		System.out.println("This is a static block");
	}
	
	public static void main(String[] args) {
		
		StaticBlock1 st = new StaticBlock1();
		//StaticBlock1 st1 = new StaticBlock1();
	}

}
