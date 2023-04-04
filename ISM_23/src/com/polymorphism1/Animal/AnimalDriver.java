package com.polymorphism1.Animal;

import java.util.Scanner;

public class AnimalDriver extends Animal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Animal a;
		
		System.out.println("1.Cat 2.Dog 3.Cow");
		switch(sc.nextInt())
		{
		case 1:
			a = new Cat();
			Cat c =(Cat)a;
			c.getSound();
			break;
			
		case 2:
			a = new Dog();
			Dog d = (Dog)a;
			d.getSound();
			break;
			
		case 3:
			a = new Cow();
			Cow cow = (Cow)a;
			cow.getSound();
			break;
			
		}
	}
}
