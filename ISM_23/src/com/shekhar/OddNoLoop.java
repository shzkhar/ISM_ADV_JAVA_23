package com.shekhar;

public class OddNoLoop {

	public static void main(String[] args) {
		for(int i=1;i<=50;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		
		int sum=0;
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				sum+=i;
			}
		}
		System.out.println("Sum of Even No = "+sum);
	}
}
