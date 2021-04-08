package grade_management_program.service;

import java.util.List;

import grade_management_program.dao.impl.StudentDaoImpl;
import grade_management_program.dto.Student;

public class StudentService {
	private StudentDaoImpl dao;

	public StudentService() {
		dao = StudentDaoImpl.getInstance();
	}
	
	public List<Student> showStudentAll(){
		return dao.selectStudentByAll();
	}
	
	public void showStudentNo(Student student) {
		dao.selectStudentByNo(student);
	}
	
	public void createStudent(Student student) {
		dao.insertStudent(student);
	}
	
	public void delStudent(int stdNo) {
		dao.deleteStudent(stdNo);
	}
	
	public void upStudent(Student newstudent) {
		dao.updateStudent(newstudent);
	}
}
