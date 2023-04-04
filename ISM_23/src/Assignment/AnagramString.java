package Assignment;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String s1 = "Race";
		String s2 = "Care";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()==s2.length())
		{
			char []a1 = new char[s1.length()];
			char []a2 = new char[s2.length()];
			
			for(int i=0;i<s1.length();i++)
			{
				a1[i]=s1.charAt(i);
			}
			for(int i=0;i<s1.length();i++)
			{
				a2[i]=s2.charAt(i);
			}
			Arrays.sort(a2);
			Arrays.sort(a1);
			
			int c = 0;
			for(int i=0;i<a1.length;i++)
			{
				for(int j=0;j<a2.length;j++)
				{
					if(a1[i]==a2[j])
					{
						c++;
					}
				}
			}
			if(c==a1.length)
			{
				System.out.println("Its ANAGRAM String");
			}
//			if(Arrays.equals(a1, a2)==true)
//			{
//				System.out.println("Its ANAGRAM String");
//			}
		}
		else
		{
			System.out.println("Its Not Anagram");
		}	
	}
}
