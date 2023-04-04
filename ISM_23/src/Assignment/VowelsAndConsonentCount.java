package Assignment;

public class VowelsAndConsonentCount {

	public static void main(String[] args) {
		String s = "I am from Maharashtra";
		s=s.toLowerCase();
		System.out.println(s);
		int vowels = 0, con = 0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' )
			{
				vowels++;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				con++;
			}
		}
		System.out.println("Total Vowels in String  "+vowels);
		System.out.println("Total Consonent in String  "+con);
		
		
		
		
		
		
	}
}
