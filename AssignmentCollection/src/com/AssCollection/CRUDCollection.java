package com.AssCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CRUDCollection {

	static Scanner sc = new Scanner(System.in);
	static ArrayList a = new ArrayList();
	static Employee e;
	public static void main(String[] args) {
		
		for(;;)
		{
			System.out.println("1.Insert Data  2.Update  3.Delete  4.Details  5.Search  6.Exit");
			switch(sc.nextInt())
			{
			case 1 :
				Insert();
				break;
				
			case 2 :
					Update();
				break;
			case 3 :
				Delete();
				break;
			case 4 :
				Details();
				break;
			case 5 :
				Search();
				break;
			case 6:
				System.exit(0);
			}
			
		}
		
	}
	private static void Search() {
		System.out.println("Enter Id");
		int id1 = sc.nextInt();
		
		Employee e1;
		Iterator it = a.iterator();
		while(it.hasNext())
		{
			e1 =(Employee)it.next();
			if(id1==e1.id)
			{
				e1.display();
			}
			else
			{
				System.out.println("Enter valid Id");
			}
		}
	}
	private static void Details() {
		
		for(Object obj : a)
		{
			
			if(obj instanceof Employee) 
			{
				Employee e1 = (Employee)obj;
				e1.display();
			}
			else
				System.out.println(obj);
			
		}
		
	}
	private static void Delete() {
		System.out.println("Enter Id");
		int id1 = sc.nextInt();
		
		Employee e1;
		Iterator it = a.iterator();
		while(it.hasNext())
		{
			e1 =(Employee)it.next();
			if(id1==e1.id)
			{
				it.remove();
				break;
			}
			else
			{
				System.out.println("Enter valid Id");
			}
		}
		System.out.println("Record Deleted Successfully");
	}
	private static void Update() {
		System.out.println("Enter Id");
		int id1 = sc.nextInt();
		
		Employee e1;
		Iterator it = a.iterator();
				System.out.println("1.Name 2.Sal 3.Desg 4.OrgName");
				switch(sc.nextInt())
				{
				case 1 :
					
					while(it.hasNext())
					{
						e1 =(Employee)it.next();
						if(id1==e1.id)
						{
							System.out.println("Enter New Name");
							e1.name = e1.name.replace(e1.name, sc.next());
							System.out.println("Name Update Successfully");
						}
						else
						{
							
						}
						break;
					}
					
					
				case 2:
					
					while(it.hasNext())
					{
						e1 =(Employee)it.next();
						if(id1==e1.id)
						{
							System.out.println("Enter New Salary");
							e1.sal = sc.nextInt();
							System.out.println("Salary Update Successfully");
						}
						else
						{
							
							
						}
						break;
					}
					
					
				case 3:
					while(it.hasNext())
					{
						e1 =(Employee)it.next();
						if(id1==e1.id)
						{
							System.out.println("Enter New Designation");
							e1.desg = e1.desg.replace(e1.desg, sc.next());
							System.out.println("Designation Update Successfully");
							break;
						}
						else
						{
							
						}
						
					}
					break;
					
				case 4 :
					while(it.hasNext())
					{
						e1 =(Employee)it.next();
						if(id1==e1.id)
						{
							System.out.println("Enter New Oraganisation Name");
							e1.orgname = e1.orgname.replace(e1.orgname, sc.next());
							System.out.println("Oraganisation Name Update Successfully");
						}
						else
						{
							
						}
						break;
					}
					
					default :
					{
						System.out.println("Enter Valid Id");
					}
					
					
			
					
					
				}
				
	}
	private static void Insert() {
		System.out.println("Enter Id");
		int id = sc.nextInt();
		
		System.out.println("Enter Name");
		String name = sc.next();
		sc.nextLine();
		
		System.out.println("Enter Sal");
		int sal = sc.nextInt();
		
		System.out.println("Enter Designation");
		String desg = sc.next();
		sc.nextLine();
		
		System.out.println("Enter Organisation Name");
		String orgname = sc.nextLine();
		
		
		Employee e = new Employee(id,name,sal,desg,orgname);
		System.out.println("Record Inserted Successfully");
		a.add(e);
		
		
	}
}
