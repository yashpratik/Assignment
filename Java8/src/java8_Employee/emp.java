package java8_Employee;


public class emp 
{	
	String empName;
	String dob;
	String doj;
	String dor;
	String work_location;
	String department;
	double salary;
	public emp(String empName, String dob, String doj, String dor, String work_location, String department,
			double salary) {
		super();
		this.empName = empName;
		this.dob = dob;
		this.doj = doj;
		this.dor = dor;
		this.work_location = work_location;
		this.department = department;
		this.salary = salary;
		
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getDor() {
		return dor;
	}
	public void setDor(String dor) {
		this.dor = dor;
	}
	public String getWork_location() {
		return work_location;
	}
	public void setWork_location(String work_location) {
		this.work_location = work_location;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "emp [empName=" + empName + ", dob=" + dob + ", doj=" + doj + ", dor=" + dor + ", work_location="
				+ work_location + ", department=" + department + ", salary=" + salary + "]";
	}
	
}
