package Assignment;

public class SeperateCharacterFromString {

	public static void main(String[] args) {
		String s = "Krishna";
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			System.out.println(ch);
		}
	}
}
