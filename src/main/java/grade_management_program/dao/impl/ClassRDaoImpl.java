package grade_management_program.dao.impl;

import java.sql.ResultSet;
import java.util.List;

import grade_management_program.dao.ClassRDao;
import grade_management_program.dto.ClassR;

public class ClassRDaoImpl implements ClassRDao {
	private static final ClassRDaoImpl instance = new ClassRDaoImpl();
	
	public static ClassRDaoImpl getInstance() {
		return instance;
	}

	private ClassRDaoImpl() {
	}
	
	@Override
	public List<ClassR> selectClassRByAll() {
		
		return null;
	}

	private ClassR getClassR(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClassR selectClassRByNo(ClassR classR) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertClassR(ClassR classR) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateClassR(ClassR newclassR) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteClassR(String classR) {
		// TODO Auto-generated method stub
		return 0;
	}

}
