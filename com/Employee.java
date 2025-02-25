package com;

public class Employee {
	private String empName;
	private int empSalary;
	private String empAdd;
	private String empMailId;
	
//	public Employee() {
//		super();
//		this.empName=empName;
//	}
	public Employee(String empName)
	{
		super();
		this.empName=empName;
	}
	public Employee(int empSalary) {
		super();
		this.empSalary = empSalary;
	}
	public Employee(String empName,String empAdd)
	{
		super();
		this.empAdd=empAdd;
	}
	
	public Employee(String empName,String empAdd,String empMailId) {
		super();
		this.empMailId = empMailId;
	}
	public Employee(String empName, int empSalary, String empAdd, String empMailId) {
		super();//default 
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAdd = empAdd;
		this.empMailId = empMailId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	public String getEmpMailId() {
		return empMailId;
	}
	public void setEmpMailId(String empMailId) {
		this.empMailId = empMailId;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSalary=" + empSalary + ", empAdd=" + empAdd + ", empMailId="
				+ empMailId + "]";
	}
}
