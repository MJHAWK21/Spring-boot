/**
 * 
 */
package com.UST.EmployeeRegistration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Administrator
 *
 */
@Entity
public class Employee {
	@Id
	@GeneratedValue
	
	private int id;
	private String empid;
	private String empname;
	private String address;
	private String location;
	public Employee(int id, String empid, String empname, String address, String location) {
		
		this.id = id;
		this.empid = empid;
		this.empname = empname;
		this.address = address;
		this.location = location;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
