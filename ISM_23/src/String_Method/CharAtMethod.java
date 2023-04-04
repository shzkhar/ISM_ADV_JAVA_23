package String_Method;

public class CharAtMethod {

	public static void main(String[] args) {
		String s = "ROYALE";
		
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.err.println("Reverse String");
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
     
		System.out.println();
		System.out.println();
		char ch[] = {'R','O','Y','A','L','E'};
		System.out.println();
		System.err.println("ARRAY Print");
		System.out.println(ch);
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}
}

// take 2 object of string 
