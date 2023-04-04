package com.shekhar;

import java.io.IOException;
import java.util.Scanner;

public class CharScannMethod {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		char ch1 = (char)System.in.read();
		
		System.out.println("Scann Successfully");
		
		String s = "ROYALE";
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}
}
