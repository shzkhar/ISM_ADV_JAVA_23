package com.shekhar;

public class ProgrammerDriver extends Programmer1 {

	public static void main(String[] args) {
		ProgrammerDriver p = new ProgrammerDriver();
		
		System.out.println("Total Sal = "+(p.sal+p.bonus));
		
		Employee1 e = new Employee1();
		e.salary();
		
		Programmer1 p1 = new Programmer1();
		p1.bonus();
	}
}
