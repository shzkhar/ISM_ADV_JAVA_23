package Exception1;

public class OwnExceptionDriver  {

	public static void main(String[] args) {
		int age = 10;
		String gender = "Male";
		check(age,gender);
	}

	private static void check(int age, String gender) {
		if((age>=21 && gender=="Male") || (age>=18 && gender=="Female"))
		{
			System.out.println("You Are Eligible");
		}
		else
		{
	       try
	       {
	    	   throw new OwnElection("Please Wait You'r Not Eligible");
	       }
	       catch(Exception e)
	       {
	    	 System.out.println(((OwnElection) e).getMsg());   
	       }
		}
		
	}
}
