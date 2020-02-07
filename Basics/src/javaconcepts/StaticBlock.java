package javaconcepts;

public class StaticBlock {
	
	static int i=10;
	
	static
	{
		
		System.out.println("I'm static block");
	}
	
	public static void main(String[] args) {

		System.out.println(StaticBlock.i);
		
	}

}
