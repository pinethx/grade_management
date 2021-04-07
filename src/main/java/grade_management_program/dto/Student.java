package grade_management_program.dto;

public class Student {
	private int stdNo;
	private String stdName;
	private String classRm;	
	
	public Student(int stdNo, String stdName, String classR) {
		super();
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.classRm = classR;
	}

	public Student(int stdNo) {
		super();
		this.stdNo = stdNo;
	}
	
	@Override
	public String toString() {
		return "Student [stdNo=" + stdNo + ", stdName=" + stdName + ", classRm=" + classRm + "]";
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
		return classRm;
	}
	public void setClassR(String classR) {
		this.classRm = classR;
	}
	
	
}
