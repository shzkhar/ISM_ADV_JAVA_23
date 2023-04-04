package Assignment;

public class AllSubSetOfString {

	public static void main(String[] args) {
		String s = "FUN";
		
//		for(int i =0;i<s.length();i++)
//		{
//			System.out.println(s.substring(i));
//		}
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=0+i;j<s.length();j++)
			{
				System.out.print(s.substring(i, j+1)+"  ");
				
				//System.out.println(j);
			}
		}
		
	}
}
