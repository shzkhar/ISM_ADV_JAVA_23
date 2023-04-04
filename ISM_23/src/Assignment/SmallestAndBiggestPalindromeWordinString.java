package Assignment;

public class SmallestAndBiggestPalindromeWordinString {

	public static void main(String[] args) {
		String s = "kayak Wow you own ";
		
		String w[] = s.split("\\s");
		String w1[] = new String[w.length];
		String max = "";
		String min ="";

		for(int i=0;i<w.length;i++)
		{
			String temp = w[i];
			String s1 = "";
			for(int j=w[i].length()-1;j>=0;j--)
			{
				s1=s1+temp.charAt(j);
			}
			w1[i]=s1;
		}
		for(int i=0;i<w.length;i++)
		{
			
				if(w[i].equalsIgnoreCase(w1[i]))
				{
					max=w[i];
					min=w[i];
				}
			
		}
//		for(int i=0;i<w1.length;i++)
//		{
//			System.out.println(w1[i]);
//		}
		
		//System.out.println("Minium Palindrome String :  "+min);
		//System.out.println("Maximum Palindrome String : "+max);
	}
	
}
