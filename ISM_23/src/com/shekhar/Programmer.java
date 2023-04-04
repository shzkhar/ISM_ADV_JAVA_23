package com.shekhar;

public class Programmer extends Employee {

	public static void main(String[] args) {
		Programmer p = new Programmer();
		
		System.out.println("Total Salary = "+(p.salary+p.bonus));
		
	}
}
