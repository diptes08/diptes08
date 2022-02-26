package com.diptes.io

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	public String name;
	public String add;
	public double Salary;
	public int id;

	public Employee() {
		super();

	}

	public Employee(String name, String add, double salary, int id) {
		
		this.name = name;
		this.add = add;
		Salary = salary;
		this.id = id;
	}

	public static void main(String[] args) {
		Employee CEO = new Employee("Rajesh Kumar", "Kolkata", 23000000, 100);
		Employee ProjectManager = new Employee("Rakesh Gopinathan", "Delhi", 75000, 200);
		Employee TeamLeader = new Employee("Bala", "Chandigarh", 65000, 300);
		HR hr = new HR();
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(CEO);
		emp.add(ProjectManager);
		emp.add(TeamLeader);
		hr.setEmps(emp);
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Emp id to  check for Employee details:");
		int id=sc.nextInt();
		for(Employee e:emp) {
			if(e.id==id) {
				System.out.println("Emp Name:"+e.name);
				System.out.println("Old Salary:"+e.Salary);
				System.out.println("location:"+e.add);
				System.out.println("new Salary:"+hr.calculateSalary(id));
				
			}
		}
		
		
		
		

	}

}
