package com.kodewala.sibkodewalaiib;


class EmployeeCount{
	static int totalEmpCount = 0;
	String empName;
	{
		totalEmpCount =totalEmpCount + 1;
	}
	
	EmployeeCount(String _name){
		this.empName = _name;
		System.out.println("Employee Name: " + this.empName + " Employee Id: kodewala "+ totalEmpCount);
	}
}

public class KodewalaEmployee {

	public static void main(String[] args) {

		EmployeeCount e1 = new EmployeeCount("ram");
		
		EmployeeCount e2 = new EmployeeCount("shyam");		
	}

}
