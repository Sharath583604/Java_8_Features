package com.streamApi;

public class Employee {
	String ename;
	String desg;
	public Employee(String ename, String desg) {
		super();
		this.ename = ename;
		this.desg = desg;
	}
	public String getEname() {
		return ename;
	}
	public String getDesg() {
		return desg;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", desg=" + desg + "]";
	}


}
