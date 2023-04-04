package com.polymorphism1;

import java.util.Scanner;

public class BankDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RBIBank rbi;
		SBIBank s;
		System.out.println("1.Axis Bank 2.SBI Bank 3.HDFC Bank");
		switch(sc.nextInt())
		{
		case 1:
			rbi=new AxisBank();
			((AxisBank)rbi).getRoi();
			break;
		case 2:
			rbi=new SBIBank();
		    ((SBIBank)rbi).getRoi();
			break;
		case 3:
			rbi=new HDFCBank();
			((HDFCBank)rbi).getRoi();
			break;
		}
	}
}
