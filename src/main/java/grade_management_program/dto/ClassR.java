package grade_management_program.dto;

public class ClassR {
	private String classRm;

	public ClassR(String classR) {
		super();
		classRm = classR;
	}

	public String getClassR() {
		return classRm;
	}

	public void setClassR(String classR) {
		classRm = classR;
	}

	@Override
	public String toString() {
		return "ClassRm [ClassRm=" + classRm + "]";
	}

}
