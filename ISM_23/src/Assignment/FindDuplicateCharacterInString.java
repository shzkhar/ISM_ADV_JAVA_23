package Assignment;

public class FindDuplicateCharacterInString {

	public static void main(String[] args) {
		String s = "Great responsibility";
		s=s.replace(" ", "");
		
		char ch[] = s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			int c = 0;
			if(ch[i]!='*')
			{
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						c++;
						ch[j]='*';
					}
				}
				if(c!=0)
				{
					System.out.print(ch[i]);
				}
			}
		}			
	}
}
