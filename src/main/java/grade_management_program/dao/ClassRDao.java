package grade_management_program.dao;

import java.util.List;

import grade_management_program.dto.ClassR;

public interface ClassRDao {

	List<ClassR> selectClassRByAll();
	ClassR selectClassRByNo(ClassR classR);
	
	int insertClassR(ClassR classR);
	int updateClassR(ClassR newclassR);
	int deleteClassR(String classR);
}
