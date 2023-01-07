
public class Employee {
	private int employeeId;
	private String employeeName;
	private String designation;
	private int employeeAge;
	private double Salary;
	private Character gender;
	
	public Employee() {}
	public Employee(int employeeId, String employeeName, String designation, int employeeAge, double Salary, Character gender) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.designation=designation;
		this.employeeAge=employeeAge;
		this.Salary=Salary;
		this.gender=gender;
	}
	public int getEmployeeId() {
		return this.employeeId;
	}
	public String getEmployeeName() {
		return this.employeeName;
	}
	public String getDesignation() {
		return this.designation;
	}
	public int getEmployeeAge() {
		return this.employeeAge;
	}
	public double getSalary() {
		return this.Salary;
	}
	public Character getGender() {
		return this.gender;
	}
	@Override
	public String toString() {
		return "Employee [ employeeId ="+employeeId+" employeeName="+employeeName +"designation = " +designation+" employeeAge=" +employeeAge+  "Salary=" +Salary+  "gender= " +gender+"]";
	}

}
