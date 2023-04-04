package com.AssCollection;

public class Employee {

	
		int id;
		String name;
		int sal;
		String desg;
		String orgname;
		
		public Employee(int id, String name, int sal, String desg, String orgname) {
			super();
			this.id = id;
			this.name = name;
			this.sal = sal;
			this.desg = desg;
			this.orgname = orgname;
		}
		void display()
		{
			
			System.out.println(id+ "\t"+name+"\t"+sal+"\t"+desg+"\t\t"+orgname);
		}
		
	
}
