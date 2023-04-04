package com.shekhar;

import java.util.Scanner;

public class NestedIf {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter Number");
	int a=sc.nextInt();
	
	System.out.println("Enter Number");
	int b=sc.nextInt();
	
	System.out.println("Enter Number");
	int c=sc.nextInt();
	
	if(a>b && a>c )
	{
		System.out.println(a+"  Is Maximum Number");
	}
	else if(b>a && b>c )
	{
		System.out.println(b+"  Is Maximum Number");
	}
	else if(c>a && c>b)
	{
		System.out.println(c+"  Is Maximum Number");
	}
	else if(a==b && c<a)
	{
		System.out.println(a+" = A & B greater than C = "+c);
	}
	else if(b==c && a<b)
	{
		System.out.println(b+" = A & B greater than C = "+a);
	}
	else if(a==c && b<a)
	{
		System.out.println(a+" = A & B greater than C = "+b);
	}
	else
	{
		System.out.println("All Three Are Equals");
	}
	
	
}
}
