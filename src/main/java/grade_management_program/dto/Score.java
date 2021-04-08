package grade_management_program.dto;

public class Score {
	private int no;
	private Student stdNo;
	private Subject subCode;
	private int subScore;

	public Score(int no, Student stdNo, Subject subCode, int subScore) {
		super();
		this.no = no;
		this.stdNo = stdNo;
		this.subCode = subCode;
		this.subScore = subScore;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Student getStdNo() {
		return stdNo;
	}

	public void setStdNo(Student stdNo) {
		this.stdNo = stdNo;
	}

	public Subject getSubCode() {
		return subCode;
	}

	public void setSubCode(Subject subCode) {
		this.subCode = subCode;
	}

	public int getSubScore() {
		return subScore;
	}

	public void setSubScore(int subScore) {
		this.subScore = subScore;
	}

	@Override
	public String toString() {
		return "Score [no=" + no + ", stdNo=" + stdNo + ", subCode=" + subCode + ", subScore=" + subScore + "]";
	}

}
