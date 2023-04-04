package com.sorting;

import java.util.ArrayList;
import java.util.Collections;


public class DriverclassSort {

	public static void main(String[] args) {
		SortingbySortMethod s1 = new SortingbySortMethod(1,"Shekhar",10);
		SortingbySortMethod s2 = new SortingbySortMethod(1,"Bala",16);
		SortingbySortMethod s3 = new SortingbySortMethod(1,"Maya",18);
		SortingbySortMethod s4 = new SortingbySortMethod(1,"Mala",10);
		SortingbySortMethod s5 = new SortingbySortMethod(1,"Pala",10);
		
		ArrayList<SortingbySortMethod> list = new ArrayList<SortingbySortMethod>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
	
		Collections.sort(list);
		
		for(int i =0; i<list.size(); i++)
		{
			SortingbySortMethod s = list.get(i);
			System.out.println(s.getRolno()+"  "+s.getName()+"  "+s.getStd());
		}
		
		
		
		
		
	}
}
