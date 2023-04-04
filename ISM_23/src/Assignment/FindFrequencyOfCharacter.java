package Assignment;

public class FindFrequencyOfCharacter {

	public static void main(String[] args) {
		String s = "picture perfect";
	    s=s.replace(" ", "");
	    
	    char ch[] = s.toCharArray();
	    for(int i=0;i<ch.length;i++)
	    {
	    	int c = 1;
	    	if(ch[i]!='*')
	    	{
	    		for(int j=i+1;j<ch.length;j++)
	    		{
	    			if(ch[i]==ch[j])
	    			{
	    				ch[j]='*';
	    				c++;
	    			}
	    		}
	    		System.out.println(ch[i]+" "+c);
	    	}
	    }
	}
}
