package Assignment;

import java.util.Scanner;

public class DivideStringInNParts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Part You Have To Divide String");
		int n = sc.nextInt();
		
		String s = "aaaabbbbcccc";
		int n1=s.length()/n;
		
		int n2=0;
		if(s.length()%n==0)
		{
			for(int i=0;i<n;i++)
			{
				
				for(int j=0;j<n1;j++)
				{
					System.out.print(s.charAt(n2));
					n2++;
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("We Can't Devide");
		}
	}
}
