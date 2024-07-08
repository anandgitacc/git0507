package org.employee;

public class EmployeeDetails { // block or body of the class
	
	// private - access specifier
	// void    - return type
	// empName - method name
	// ()      - arguments place / input / parameter place
	// {}      - block or body of the method
	private void empName() {
		// implementation or business logic
		// "" - double quote - String : predefinded class
		System.out.println("Employee name : Anand");
	}
	
	private void empMobile() {
		System.out.println("Employee mobile : 7200983432");
	}
	private void empAdd() {
		System.out.println("employee add : Chennai");
	}
	private void empId() {
		System.out.println("employee id : 1011");
	}
//<<<<<<< HEAD
//=======
//>>>>>>> d8f8a7419573a6fd87486b300b01d548528a20e8
	
	// main method
	public static void main(String[] args) {
		
		// object creation
		EmployeeDetails e = new EmployeeDetails();
		// method call
		e.empName();
		e.empMobile();
		
	}
	
	

}
