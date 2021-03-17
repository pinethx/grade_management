package grade_management_program.dao;

import java.util.List;

import grade_management_program.dto.Subject;

public interface SubjectDao {

	List<Subject> selectSubjectByAll();
	Subject selectStudentByNo(Subject subject);
	
	int insertSubject(Subject subject);
	int updateSubject(Subject newsubject);
	int deleteSubject(int subNo);
}
