package com.shekhar;

public class Drivr_Mar_7 {

	public static void main(String[] args) {
		
		Mar_7_Encapsulation s1 = new Mar_7_Encapsulation();
		
//		System.out.println(s1.toString());
//		System.out.println(s1);
		
		Mar_7_Encapsulation s2[] = new Mar_7_Encapsulation[3];
		
		for(int i=0;i<3;i++)
		{
			s2[i]=new Mar_7_Encapsulation();
			s2[i].scanData();	
		}
		
		for(int i=0;i<s2.length;i++)
		{
			s2[i].display();
		}
	}
}
