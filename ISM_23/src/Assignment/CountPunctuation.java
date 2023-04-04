package Assignment;

public class CountPunctuation {

	public static void main(String[] args) {
		String s = "S,he.k@  ha;ar!";
		
		String temp = s.replaceAll("[^A-Za-z0-9' '@#$%&*]","");
		System.out.println("Total Panctuation Mark  "+(s.length()-temp.length()));
		System.out.println(temp);
	}
}
