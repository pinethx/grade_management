package grade_management_program.dto;

public class Subject {
	private int subCode;
	private int subName;
	
	public Subject(int subCode, int subName) {
		super();
		this.subCode = subCode;
		this.subName = subName;
	}
	
	public Subject(int subCode) {
		super();
		this.subCode = subCode;
	}

	public int getSubCode() {
		return subCode;
	}

	public void setSubCode(int subCode) {
		this.subCode = subCode;
	}

	public int getSubName() {
		return subName;
	}

	public void setSubName(int subName) {
		this.subName = subName;
	}

	@Override
	public String toString() {
		return "Subject [subCode=" + subCode + ", subName=" + subName + "]";
	}
}
