package com.diptes.io;

import java.util.List;

public class HR extends Employee {
	
	
	public List<Employee> empls;
	public double calculateSalary(Integer id) {
		double sal=0d;
		
		for(Employee e:empls) {
			if(e.id==id) {
				sal=e.Salary;
			}
		}
		final float hikePercentage = 10;
		double newSal = sal + (sal * hikePercentage) / 100;
		return newSal;
	}

	public List<Employee> getEmps() {
		return empls;
	}

	public void setEmps(List<Employee> empls) {
		this.empls = empls;
	}

}
