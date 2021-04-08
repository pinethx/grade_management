package grade_management_program.service;

import grade_management_program.dao.impl.ScoreDaoImpl;

public class ScoreService {
	private ScoreDaoImpl dao;
	
	public ScoreService() {
		dao = ScoreDaoImpl.getInstance();
	}

}
