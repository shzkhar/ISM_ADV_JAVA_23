package com.sorting;

import java.util.Comparator;

public class StdWiseSorting implements Comparator<SortingbySortMethod> {

	@Override
	public int compare(SortingbySortMethod s1, SortingbySortMethod s2) {
		if(s1.getStd() > s2.getStd())
	       {
	    	   return 1;
	       }
	       else if(s1.getStd() < s2.getStd())
	       {
	    	   return -  1;
	       }
	       else
	       {
	    	   return 0;  
	       }
		
	}

	
}
