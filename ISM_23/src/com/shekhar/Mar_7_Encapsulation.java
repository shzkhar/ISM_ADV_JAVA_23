package com.shekhar;

import java.util.Scanner;

public class Mar_7_Encapsulation {

	
		
		private int id;
		private String name;
		private int std;
		
		public void scanData()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ID");
			id=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Name");
			name=sc.nextLine();
			
			System.out.println("Enter STD");
			std=sc.nextInt();
			
		}
		
		public void display()
		{
			System.out.println("id "+id+" Name "+name+" Std "+std);
		}
		
	
}
