package com.xyz;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class employees {
	
	@Id
	private String empid;
//	private String address;
	private String Name;
	
	
	// Getter and Setter method
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Employees [empid=" + empid +  ", Name=" + Name + "]";
	}
	
	//No Argument Constructor
	public employees() {
		
	}
	
	// Parameterized Constructor
	public employees(String empid,  String name) {
		super();
		this.empid = empid;
//		this.address = address;
		Name = name;
	}
	
	
	
	

}
