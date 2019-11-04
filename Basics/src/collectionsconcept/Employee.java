package collectionsconcept;

import java.util.ArrayList;
import java.util.Iterator;
public class Employee {

	String name;
	int age;
	String dept;
	
	Employee(String name, int age, String dept)
	{
		this.name = name; //this.global variable = local variable
		this.age = age;
		this.dept = dept;
	
	}
	
	Employee e1 = new Employee("Maddy",26,"DevOps");
	Employee e2 = new Employee("Tom",25,"QA");
	Employee e3 = new Employee("Cruise",34,"MD");
	
	//create an arraylist of type Emplyee
	ArrayList<Employee> emp = new ArrayList<Employee>();
	/* emp.add(e1);
	 to iterate values, we have to use iteratrors
	 Iterator<Employee> it = emp.Iterator();
	 while(it.hashNext() //the hashnext will check whether the element(vlaues) is present or not
	 {
	 Employee emp1 = it.next();
	 system.out.println(emp1.name);
	 system.out.println(emp1.age);
	 system.out.println(emp1.dept);
	}
	 */
	
	//addall method -- it will add all the element from one araylist to another arraylist
	ArrayList<String> str1 = new ArrayList<String>();
	
	
	
	
}
