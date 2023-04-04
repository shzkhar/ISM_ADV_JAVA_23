package Exception1;

public class NestedException {

	public static void main(String[] args) {
		int a = 50;
		int b = 10;
		
		try
		{
			try
			{
				int c = a/b;
			}
			catch(ArithmeticException ae) 
			{
				System.out.println("Can't Divide By 0");
			}
			
			try
			{
				int arr[] = new int [5];
				arr[5]=10;
				
			}
			catch(ArrayIndexOutOfBoundsException arre)
			{
			   System.out.println("ArrayIndexOutOfBoundsException");	
			}
			try
			{
				String s = null;
				
			}
			catch(NullPointerException ne)
			{
				System.out.println("NullPointerexception");
			}
			try
			{
				String s="absjdhgc";  
				int i=Integer.parseInt(s);
			}
			catch(NumberFormatException nfe)
			{
				System.out.println("NumberFormatException");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
