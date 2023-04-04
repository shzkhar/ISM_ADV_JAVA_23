package Exception1;

public class Exception11 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException ae)
		{
			System.err.println("Cant Divid By 0");
		}
	}
}
