package Exception1;



public class Chile1 extends Paarent1 {
	public static void main(String[] args) {
		Paarent1 p = new Chile1();
		p.show();
	}
	
	void show() throws IOException
	{
		System.out.println("Child Class ");
	}

}

// if we does not declare Exception in superclass and we override that method in subclass then we cant declare Checked Exception in
// child class