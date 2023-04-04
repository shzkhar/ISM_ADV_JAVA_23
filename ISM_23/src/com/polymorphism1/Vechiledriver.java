package com.polymorphism1;

import java.util.Scanner;

public class Vechiledriver extends Vechile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Two Wheeler 2.LMVechile 3.HMVechile");
		Vechile v;
		switch(sc.nextInt())
		{
		case 1:
			v=new TwVechile();
			((TwVechile)v).getSpec();
			  break; 
			  
		case 2:
			v=new LMVVechile();
			((LMVVechile)v).getSpec();
			  break; 
			  
		case 3:
			v=new HMVVechile();
			((HMVVechile)v).getSpec();
			  break; 
		}
	}
}
