package com.array;

public class Tringle {

   static float a;
   static float b;
   static float c;
    
	public float getA() {
		return a;
	}
	public void setA(float a) {
		this.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	public float getC() {
		return c;
	}
	public void setC(float c) {
		this.c = c;
	}
    
	public static void result()
	{
		float area;
		
		area = (0.5f)*(a)*(b);
		System.out.println("Area  :  "+area);
		
		float parameter;
		parameter = a*b*c;
		System.out.println("Parameter  :  "+parameter);
	}
	
	public static void main(String[] args) {
		Tringle t = new Tringle();
		
		t.setA(3);
		t.setB(4);
		t.setC(5);
		
		result();
	}
    
}
