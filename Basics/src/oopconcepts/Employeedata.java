package oopconcepts;



public class Employeedata {

	//Private data variables
	private int ssn;
	private int empAge;
	private String empName;
	
		
	
	
	
	public static void main(String[] args) {

		Employeedata emp = new Employeedata();
		emp.setEmpName("Maddy");
		emp.setEmpAge(27);
		emp.setSsn(1234);
		
		System.out.println("Employee name is :"+emp.getEmpName());
		System.out.println("Employee Age is: "+emp.getEmpAge());
		System.out.println("Emplyee ssn number is :"+emp.getSsn());
		
	}

	//getters and setters method:
		//to add getters and setters -- rightclick on the page -- Sources -- Generate Getters and setters....
		
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
		//this . class variable = local variable
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
