package EmployeeBean;

public class EmployeeAttributes {

	private int id;
	private String name;
	private String sal;
	private String desg;
	private String  orgname;
	
	public EmployeeAttributes(int id, String name, String sal, String desg, String orgname) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.desg = desg;
		this.orgname = orgname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	
	
	
}
