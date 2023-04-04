package com.AssCollection;

public class Pvt {

	private int id;
	private String name;
	private int sal;
	private String desg;
	private String orgname;
	
	
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


	public int getSal() {
		return sal;
	}


	public void setSal(int sal) {
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


	public Pvt(int id, String name, int sal, String desg, String orgname) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.desg = desg;
		this.orgname = orgname;
	}


	public void display()
	{
		
		System.out.println(id+ "\t"+name+"\t"+sal+"\t"+desg+"\t\t"+orgname);
	}
}
