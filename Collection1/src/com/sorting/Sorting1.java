package com.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting1 {

	public static void main(String[] args) {
		SortingbySortMethod s1 = new SortingbySortMethod(1,"Shekhar",1);
		SortingbySortMethod s2 = new SortingbySortMethod(2,"Bala",16);
		SortingbySortMethod s3 = new SortingbySortMethod(3,"Maya",18);
		SortingbySortMethod s4 = new SortingbySortMethod(4,"Mala",9);
		SortingbySortMethod s5 = new SortingbySortMethod(5,"Pala",21);
		
		ArrayList<SortingbySortMethod> list = new ArrayList<SortingbySortMethod>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
	
		Collections.sort(list, new StdWiseSorting());
		
		for(int i=0;i<list.size();i++)
		{
			SortingbySortMethod s = list.get(i);
			System.out.println(s.getRolno()+"  "+s.getName()+"  "+s.getStd());
		}
		
Collections.sort(list, new NamewiseSorting());
		
		for(int i=0;i<list.size();i++)
		{
			SortingbySortMethod s = list.get(i);
			System.out.println(s.getRolno()+"  "+s.getName()+"  "+s.getStd());
		}
		
		
}
}
