package grade_management_program.dao;

import java.util.List;

import grade_management_program.dto.Student;

public interface StudentDao {

	List<Student> selectStudentByAll();
	Student selectStudentByNo(Student student);
	
	int insertStudent(Student student);
	int updateStudent(Student newstudent);
	int deleteStudent(int stdNo);
}
