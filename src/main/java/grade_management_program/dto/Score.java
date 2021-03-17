package grade_management_program.dto;

public class Score {
	private int no;
	private int stdNo;
	private int subCode;
	private int subScore;
	
	public Score(int no, int stdNo, int subCode, int subScore) {
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

	public int getStdNo() {
		return stdNo;
	}

	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}

	public int getSubCode() {
		return subCode;
	}

	public void setSubCode(int subCode) {
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
