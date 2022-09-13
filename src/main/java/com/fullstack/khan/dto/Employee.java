package com.fullstack.khan.dto;

public class Employee {
	private int eid;
	private String ename;
	private String email;
	private String city;
	
	
	
	public Employee() {
		super();
	}
	
	public Employee(int eid, String ename, String email, String city) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.city = city;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", city=" + city + "]";
	}
	
	
}
