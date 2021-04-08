package grade_management_program.service;

import java.util.List;

import grade_management_program.dao.impl.SubjectDaoImpl;
import grade_management_program.dto.Subject;

public class SubjectService {
	private SubjectDaoImpl dao;

	public SubjectService() {
		dao = SubjectDaoImpl.getInstance();
	}
	
	public List<Subject> showSubjectAll() {
		return dao.selectSubjectByAll();
	}
	
	public void showSubjectSubcode(Subject subject) {
		dao.selectStudentByNo(subject);
	}
	
	public void createSubject(Subject subject) {
		dao.insertSubject(subject);
	}
	
	public void delSubject(int subNo) {
		dao.deleteSubject(subNo);
	}
	
	public void upSubject(Subject newsubject) {
		dao.updateSubject(newsubject);
	}
	
}
