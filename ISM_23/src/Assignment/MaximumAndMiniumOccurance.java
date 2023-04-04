package Assignment;

public class MaximumAndMiniumOccurance {

	public static void main(String[] args) {
		String s = "Shekhar";
		s=s.toLowerCase();
		int max = 0;
		int min = 1;
		char maxchar = ' ';
		char minchar = ' ';
		
		
		char []ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			int tempmax=1;
			int tempmin=1;
			//char tempmaxchar = ' ';
			for(int j=i+1;j<ch.length;j++)
			{
				if((ch[i]==ch[j]) && ch[i]!=' ')
				{
				  tempmax++;
				  tempmin++;
				}
			}
			if(tempmax>max)
			{
				max=tempmax;
				maxchar=ch[i];
			}
//			min=tempmin;
			if(tempmin<=min)
			{
				min=tempmin;
				minchar=ch[i];	
			}
			
		}
		s=s.replace(" ", "");
		if(max==s.length())
		{
			min=ch.length-1;
		}
		System.out.println("Maximum Occurance Character  "+maxchar+" "+max);
		System.out.println("Maximum Occurance Character  "+minchar+" "+min);
	}
}
