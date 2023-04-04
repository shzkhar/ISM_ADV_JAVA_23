package Assignment;

public class PalindromeString {

	public static void main(String[] args) {
		String s = "Nayan";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		if (s.equalsIgnoreCase(rev)) {
			System.out.println("Its Palindrome String");
		} else {
			System.out.println("Its Not Palindrome String");
		}
	}
}
