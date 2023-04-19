package stremas;

public class Students {

	private long stuId;
	private String stuName;
	private int stuClass;
	private long stuRollNo;
	private int stuMarks;

	public Students() {
		super();
	}

	public Students(long stuId, String stuName, int stuClass, long stuRollNo, int stuMarks) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuClass = stuClass;
		this.stuRollNo = stuRollNo;
		this.stuMarks = stuMarks;
	}

	public long getStuId() {
		return stuId;
	}

	public void setStuId(long stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuClass() {
		return stuClass;
	}

	public void setStuClass(int stuClass) {
		this.stuClass = stuClass;
	}

	public long getStuRollNo() {
		return stuRollNo;
	}

	public void setStuRollNo(long stuRollNo) {
		this.stuRollNo = stuRollNo;
	}

	public int getStuMarks() {
		return stuMarks;
	}

	public void setStuMarks(int stuMarks) {
		this.stuMarks = stuMarks;
	}

	@Override
	public String toString() {
		return "Students [stuId=" + stuId + ", stuName=" + stuName + ", stuClass=" + stuClass + ", stuRollNo="
				+ stuRollNo + ", stuMarks=" + stuMarks + "]";
	}

}