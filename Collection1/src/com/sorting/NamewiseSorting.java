package com.sorting;

import java.util.Comparator;

public class NamewiseSorting implements Comparator<SortingbySortMethod>{

	@Override
	public int compare(SortingbySortMethod s1, SortingbySortMethod s2) {
		// TODO Auto-generated method stub
		return s1.getName().compareTo(s2.getName());
	}

}
