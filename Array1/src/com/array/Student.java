package com.array;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Student {
	

	static Scanner sc = new Scanner(System.in);
	
	static String name;
	static int id;
	static int age;
	static String address;
	
	public Student(String name, int id, int age, String address) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.address = address;
	}
	


	public static void main(String[] args) {
		LinkedList l = new LinkedList();
	 
       
		for(int i=1;i<=3;i++)
		 {
			
			
				System.out.println("Enter Name");
				String name1 = sc.next();
				
				System.out.println("Enter ID");
				int id1 = sc.nextInt();
				
				System.out.println("Enter AGE");
				int age1 = sc.nextInt();
				
				System.out.println("Enter Address");
				String address1 = sc.next();
				 
				Student s = new Student(name1,id1,age1,address1);
			    l.add(s);
		 }
		
		Iterator e = l.iterator();
		
		while(e.hasNext())
		{
			for(Object i:l)
			{
				System.out.println("id  =  " +id );
				System.out.println("name  =  " +name );
				System.out.println("address  =  " +address );
				System.out.println();
			}
			e.next();
		}
		 
        
	}



	
}
