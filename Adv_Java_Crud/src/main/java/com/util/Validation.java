package com.util;

public class Validation {

	public static boolean isEmpty(String firstname)
	{
		boolean iserror=false;
		if(firstname==null || firstname.trim().length()==0)
		{
			iserror=true;
		}
		return false;
	}
	
	public static boolean isAlpha(String firstname)
	{
		return firstname.matches("[a-zA-z]+");
	}

	public static boolean checkLength(String firstname) {
		if(firstname.trim().length()<2)
		{
			return true;
		}
		return false;
	}
}
