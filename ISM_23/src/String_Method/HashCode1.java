package String_Method;

public class HashCode1 {

	public static void main(String[] args) {
		String s = "yash";
		
		
		StringBuilder s3 = new StringBuilder("yash");
		System.out.println(s.hashCode());
		
		System.out.println(s3.hashCode());
		
		System.out.println(s.equals(s3));
		
	}
}
