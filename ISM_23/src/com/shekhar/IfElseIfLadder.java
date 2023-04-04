package com.shekhar;

import java.util.Scanner;

public class IfElseIfLadder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Number");
		int a=sc.nextInt();
		
		if(a>0)
		{
			System.out.println(a+" Its Positive Number");
		}
		else if(a<0)
		{
			System.out.println(a+" Its Negative Number");
		}
		else if(a==0)
		{
			System.out.println(a+" Its Nutral Number");
		}
	}
}
