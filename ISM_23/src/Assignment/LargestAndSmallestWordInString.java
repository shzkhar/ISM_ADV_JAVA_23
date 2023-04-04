package Assignment;

public class LargestAndSmallestWordInString {

	public static void main(String[] args) {
		String s = "Hello Guys My Name Is Shekhar";
		String max = "";
		String min = "";
		String s1[] = s.split("\\s");
		
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				String str1 = s1[i];
				String str2 = s1[j];
				if(str1.length()>str2.length())
				{
					max=str1;
				}
				else
				{
					max=str2;
				}
				if(str1.length()<str2.length())
				{
					min=str1;
				}
				else
				{
					min=str2;
				}
			}
		}
		System.out.println("Maximum Word In String : "+max);
		System.out.println("Minimum Word In String : "+min);
	}
}
