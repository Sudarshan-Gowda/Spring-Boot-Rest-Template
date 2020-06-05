package com.star.sud.common.bean;

public class Employee {

	private Integer empId;

	private String empName;

	private String empDept;

	private Double empSalary;

	// Constructors
	//////////////////
	public Employee() {
		super();
	}

	/**
	 * @param empId
	 * @param empName
	 * @param empDept
	 * @param empSalary
	 */
	public Employee(Integer empId, String empName, String empDept, Double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empSalary = empSalary;
	}

	// Properties
	////////////////
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

}
