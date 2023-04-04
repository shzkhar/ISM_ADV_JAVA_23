package com.array;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintArrayListUsingIterator {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		a.add("Shekhar");
		a.add("Mahajan");
		a.add(30);
		a.add(40);
		a.add(50);
		
		Iterator e = a.iterator();
		
		while(e.hasNext())
		{
			System.out.println(e.next());
			
		}
	}
}

