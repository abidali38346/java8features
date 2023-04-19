package stremas;
public class Employee {

	private long empId;
	private String empName;
	private int empAge;
	private String empGender;
	private String empQualification;

	public Employee() {
		super();
	}

	public Employee(long empId, String empName, int empAge, String empGender, String empQualification) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empGender = empGender;
		this.empQualification = empQualification;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public String getEmpQualification() {
		return empQualification;
	}

	public void setEmpQualification(String empQualification) {
		this.empQualification = empQualification;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empGender=" + empGender
				+ ", empQualification=" + empQualification + "]";
	}

}