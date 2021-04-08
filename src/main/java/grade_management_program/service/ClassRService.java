package grade_management_program.service;

import java.util.List;

import grade_management_program.dao.impl.ClassRDaoImpl;
import grade_management_program.dto.ClassR;

public class ClassRService {
	private ClassRDaoImpl dao;
	
	public ClassRService() {
		dao = ClassRDaoImpl.getInstance();
	}
	
	public List<ClassR> showClassRAll(ClassR classr) {
		return dao.selectClassRByAll();
	}
	
	public void showClassRNo (ClassR classr) {
		dao.selectClassRByNo(classr);
	}
	
	public void createClassR (ClassR classr) {
		dao.insertClassR(classr);
	}
	
	public void delClassR (String classr) {
		dao.deleteClassR(classr);
	}
	
	public void upClassR (ClassR newclassR) {
		dao.updateClassR(newclassR);
	}
}
