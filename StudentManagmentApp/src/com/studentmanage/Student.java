package com.studentmanage;

public class Student {
	private String sname;
	private String scity;
	private String sNumber;
	private int sId;
	
	public Student() {
		super();
	}

	
	public Student(String sname, String scity, String sNumber) {
		super();
		this.sname = sname;
		this.scity = scity;
		this.sNumber = sNumber;
	}
	
	
	public Student(String sname, String scity, String sNumber, int sId) {
		super();
		this.sname = sname;
		this.scity = scity;
		this.sNumber = sNumber;
		this.sId = sId;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getScity() {
		return scity;
	}


	public void setScity(String scity) {
		this.scity = scity;
	}


	public String getsNumber() {
		return sNumber;
	}


	public void setsNumber(String sNumber) {
		this.sNumber = sNumber;
	}


	public int getsId() {
		return sId;
	}


	public void setsId(int sId) {
		this.sId = sId;
	}


	@Override
	public String toString() {
		return "Student [sname=" + sname + ", scity=" + scity + ", sNumber=" + sNumber + ", sId=" + sId + "]";
	}
	

}
