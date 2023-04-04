package Assignment;

import java.util.Scanner;

public class ReplaceSpeceswithSpecificChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "Shekhar Harish Mahaj an";
		String s1 = "";
		
		System.out.println("Enter The Character");
		s1 = s.replaceAll(" ", sc.next());
		
		System.out.println(s1);
	}
}
