package com.array;

import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        int a[] = new int[] {11,12,54,87,98,25,65};
        
		System.out.println("Enter Number");
		int no = sc.nextInt();
		
		int c = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==no)
			{
				System.out.println("index : "+i);
				c++;
			}
		}
		if(c==0)
		{
			System.err.println("Number Not Found");
		}
	}
}
