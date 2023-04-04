package com.sorting;

import java.io.Serializable;
import java.util.Scanner;

public class SortingbySortMethod implements Comparable<SortingbySortMethod>{

	private int rolno;
	private String name;
	private int std;
	public int getRolno() {
		return rolno;
	}
	public void setRolno(int rolno) {
		this.rolno = rolno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public SortingbySortMethod(int rolno, String name, int std) {
		super();
		this.rolno = rolno;
		this.name = name;
		this.std = std;
	}
	
	public void scan()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rol");
		rolno = sc.nextInt();
		System.out.println("Enter Rol");
		name = sc.next();
		System.out.println("Enter Rol");
		std = sc.nextInt();
	}
	@Override
	public int compareTo(SortingbySortMethod s2) {
       if(std > s2.getStd())
       {
    	   return -1;
       }
       else if(std < s2.getStd())
       {
    	   return 1;
       }
       else
       {
    	   return 0;  
       }
		
	}
	@Override
	public String toString() {
		return "SortingbySortMethod [rolno=" + rolno + ", name=" + name + ", std=" + std + "]";
	}
	
}
