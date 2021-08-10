package sql.practice2.employees;

import java.sql.Date;

public class EmployeeDTO {
	
	private int employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
//	왜 폰번호를 숫자가 아니라 문자로 다룰까?
//	01012345678 폰번호의 맨 앞자리수가 0이다.
//	그러면 위 숫자를 잘 못 인식하거나 8진수로 인식해버린다.
	private Date hire_date;
//	DB의 날짜타입은 String이나 java.sql.Date클래스를 이용한다.
	private String job_id;
	private int salary;
	private double commission_pct;
	private int manager_id;
	private int department_id;
	
//	Getters Setters ------------------------------------
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getCommission_pct() {
		return commission_pct;
	}
	public void setCommission_pct(double commission_pct) {
		this.commission_pct = commission_pct;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
}
