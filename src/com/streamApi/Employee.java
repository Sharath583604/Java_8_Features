package com.streamApi;

public class Employee {
	String ename;
	String desg;
	double sal;

	public Employee(String ename, String desg, double sal) {
		super();
		this.ename = ename;
		this.desg = desg;
		this.sal = sal;
	}

	public double getSal() {
		return sal;
	}

	public String getEname() {
		return ename;
	}

	public String getDesg() {
		return desg;
	}

	
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", desg=" + desg + ", sal=" + sal + "]";
	}

}
