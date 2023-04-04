package Exception1;

public class ExceptionArithmetic {

	public static void main(String[] args) {
		int a = 50;
		int b = 0;
		
		try
		{
			int c = a/b;
		}
		catch(ArithmeticException ae)
		{
			System.err.println("Exception Handled can't divide by 0");
		}
	}
}
