package com.shekhar;

public class Driver_Mar_7 {

	public static void main(String[] args) {
		
		//Mar_7_Employee s1 = new Mar_7_Employee();
		Mar_7_Employee s[] = new Mar_7_Employee[2];
		
		for(int i=0;i<2;i++)
		{
			s[i]=new Mar_7_Employee();
			s[i].scanData();
		}
		
		for(int i=0;i<2;i++)
		{
			s[i].display();
		}
	}
}
