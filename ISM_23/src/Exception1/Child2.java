package Exception1;

public class Child2 extends Parent2 {

	public static void main(String[] args) {
		Parent2 p = new Child2();
				p.show();
	}
	
	void show() throws Exception
	{
		System.out.println("Child Class ");
	}
}
 // if parent class method declare exception and child class overriden this method the we able to declare only same exception or 
// or child exception but we unable to declare parent exception