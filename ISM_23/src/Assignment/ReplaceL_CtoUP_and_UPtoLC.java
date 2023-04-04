package Assignment;

public class ReplaceL_CtoUP_and_UPtoLC {

	public static void main(String[] args) {
		String s = "I am Working in OmniMD";
		StringBuffer sb = new StringBuffer(s);
		for(int i=0;i<s.length();i++)
		{
		  if(Character.isUpperCase(s.charAt(i)))
		  {
			 sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
		  }
		  else
		  {
			  sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
		  }
		}
		System.out.println(sb);
		
	}
}
