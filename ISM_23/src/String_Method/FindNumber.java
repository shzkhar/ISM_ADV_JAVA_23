package String_Method;

import java.util.Scanner;

public class FindNumber {

//	public static void main(String[] args) {
//		String s = "adfh562489sdfjadsh56sdfhdifg!@$%#";
//		String no = "";
//		int temp;
//		int add = 0;
//
//		no = s.replaceAll("[^0-9]", "");
//		temp = Integer.parseInt(no);
//
//		for (int i = temp; i != 0; i = i / 10) {
//			int rem = i % 10;
//			add += rem;
//		}
//		System.out.println(add);
//	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a string: ");
		System.out.println("How many numbers you want to enter: ");
		int n = sc.nextInt();
		String[] arr = new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			String temp;
			System.out.print("Enter a string: ");
			temp = sc.nextLine();
			arr[i] = temp;
		}
		
		for(;;)
		{
			System.out.println("Enter string or char: ");
			String contain = sc.nextLine();
			
			for(int i=0;i<n;i++)
			{
				if(arr[i].contains(contain))
				{
					System.out.println(arr[i]);
				}
			}
		}
	}
}
