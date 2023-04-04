package Assignment;

public class CountCharacter {

	public static void main(String[] args) {
		String s = "Shekhar Mahajan";
		int c = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				c++;
			}
		}
		System.out.println("Total Character  "+c);
	}
}
