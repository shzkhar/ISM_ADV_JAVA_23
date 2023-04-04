package com.AssCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PVTDriver {

	static Scanner sc = new Scanner(System.in);
	static ArrayList a = new ArrayList();
	 static Pvt e;
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
		// TODO Auto-generated method stub
		
	}
	private static void Details() {
		for(Object obj : a)
		{
			
			if(obj instanceof Pvt)
			{
				//e = (Pvt)obj;
				e.getId();
				e.getName();
				e.getSal();
				e.getDesg();
				e.getOrgname();
			}
			else
				System.out.println(obj);
			
		}
		
	}
	private static void Update() {
		// TODO Auto-generated method stub
		
	}
	private static void Delete() {
		System.out.println("Enter ID");
		int id1 = sc.nextInt();

			Iterator it = a.iterator();
			while(it.hasNext())
			{
				e =(Pvt)it.next();
				if(e.getId() == id1)
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
