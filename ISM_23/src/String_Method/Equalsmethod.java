package String_Method;

import java.util.Scanner;

public class Equalsmethod {

	public static void main(String[] args) {

		
		  String name3 = "Shekhar"; String name1 = new String("Shekhar").intern();
		 
		  System.out.println(name3.hashCode()); 
		  System.out.println(name1.hashCode());
		  System.out.println(name3==name1);
		 

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.next();
		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}

		if (rev.equalsIgnoreCase(name)) {
			System.out.println("Its Palindrome");
		} 
		
		else {
			System.out.println("Its Not Palindrome");
		}
	}

}
