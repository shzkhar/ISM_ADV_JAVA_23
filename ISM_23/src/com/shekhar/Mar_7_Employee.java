package com.shekhar;

import java.util.Scanner;

public class Mar_7_Employee {

	private int id;
	private String name;
	private String dsgn;
	private String orgname;
	
	public void scanData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name");
		name=sc.nextLine();
		
		System.out.println("Enter dsgn");
		dsgn=sc.nextLine();
		
		System.out.println("Enter orgName");
		orgname =sc.nextLine();
		
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+dsgn+" "+orgname);
	}
}
