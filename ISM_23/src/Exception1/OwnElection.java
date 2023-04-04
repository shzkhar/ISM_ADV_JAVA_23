package Exception1;

public class OwnElection extends Exception {

	private String msg;

	public OwnElection(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	
}
