package com.shekhar;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number");
		int num1 = sc.nextInt();

		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();

		System.err.println("1.Add   2.Sub   3.Mul   4.Div ");

		switch (sc.nextInt()) {
		case 1: {
			System.out.println("Addition is " + (num1 + num2));
			break;
		}
		case 2: {
			System.out.println("Substraction is " + (num1 - num2));
			break;
		}
		case 3: {
			System.out.println("Multiplication is " + (num1 * num2));
			break;
		}
		case 4: {
			System.out.println("Division is " + (num1 / num2));
		}
		}
	}
}
