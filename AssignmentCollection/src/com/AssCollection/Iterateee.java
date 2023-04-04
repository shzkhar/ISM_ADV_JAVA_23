package com.AssCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterateee {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		
		Employee e = new Employee(1,"Shekhar",25000,"Java Developer","OmniMD");
		a.add(20);
		a.add(30.30);
		a.add(e);
		
		for(Object obj:a)
		{
			if(e instanceof Employee)
			{
				Employee em = (Employee)obj;
				Iterator it = a.iterator();
				
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
			}
			
		}
	}
}
