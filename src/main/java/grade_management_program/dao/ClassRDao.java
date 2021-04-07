package grade_management_program.dao;

import java.util.List;

import grade_management_program.dto.ClassR;

public interface ClassRDao {

	List<ClassR> selectClassRByAll();
	ClassR selectClassRByNo(ClassR classRm);
	
	int insertClassR(ClassR classRm);
	int updateClassR(ClassR newclassRm);
	int deleteClassR(String classRm);
}
