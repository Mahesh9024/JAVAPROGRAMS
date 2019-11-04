package inheritanceconcept;

public class Test {

	public static void main(String[] args) {

		//these below machanism is called compile time polymorphism or static polymorphism,
		//at them time of compilation time only it's desciding which method needs to be called
		//if the same emthod is available in parent and child class
		BMW b = new BMW();
		b.start();
		b.theftSafety();// from BMW Class
		b.stop(); // it will inherit from Car class
		b.engine(); //we can call grand parent( super class) methods too
		
		System.out.println("*****************");
		Car c = new Car(); 
		c.start(); //car class method, parent start emthod
		
		//the below machanism is called runtime - polymorphism or dynamic polymorphism
		// means, child class object cab be reffered by parent class reference variable 
		
		new BMW(); //creating a object of type BMW class(Child class), here we are just creating an object without any reference
		
		Car c1 = new BMW(); //child class object can be reffered by parent class reference variable
		
		c1.start(); //child class, BMW class method
		c1.stop();
		c1.reFuel();
		
	 //c1.theftSafety() // error,you can refere my objects but, you cannot take my method
		 //by using parent class reference we can't access child class methods
		 
		
		//Down Casting
		//casting 
		BMW b1 = (BMW)new Car(); //we are converting into BMW class , but when we run we will get exeption
		// because during complie time it will get confused and runtime it will give exception
		// we can convert it but it will give runtime exception 
		
		//ClassCastException
		
		//top casting -- compile time polymorphism
		//down casting -- runtime polymorphism, it's not allowed
	}

}
