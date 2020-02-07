
public class B extends A {

	public static void sum()
	{
		System.out.println("This is child class static method");
	}
	
	
	
	public static void main(String[] args) {

		B b1 = new B();
		A.sum();
		b1.sum();
		
		
	}

}
