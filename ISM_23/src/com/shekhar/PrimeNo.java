package com.shekhar;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = sc.nextInt();
		int c = 0;

		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			System.out.println(a + " Its Prime Number");
		} else {
			System.out.println(a + " Its Not Prime Number");
		}
	}
}
