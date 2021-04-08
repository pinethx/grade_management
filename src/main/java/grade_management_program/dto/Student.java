package grade_management_program.dto;

public class Student {
	private int stdNo;
	private String stdName;
	private ClassR classR;	
	
	public Student(int stdNo, String stdName, ClassR classR) {
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

	public ClassR getClassR() {
		return classR;
	}

	public void setClassR(ClassR classR) {
		this.classR = classR;
	}
	
}
