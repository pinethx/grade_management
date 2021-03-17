package grade_management_program.dto;

public class Student {
	private int stdNo;
	private String stdName;
	private String classR;	
	
	public Student(int stdNo, String stdName, String classR) {
		super();
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.classR = classR;
	}

	public Student(int stdNo) {
		super();
		this.stdNo = stdNo;
	}
	
	@Override
	public String toString() {
		return "Student [stdNo=" + stdNo + ", stdName=" + stdName + ", classR=" + classR + "]";
	}

	public int getStdNo() {
		return stdNo;
	}
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getClassR() {
		return classR;
	}
	public void setClassR(String classR) {
		this.classR = classR;
	}
	
	
}
