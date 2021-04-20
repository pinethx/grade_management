package grade_management_program.service;

import java.util.List;

import grade_management_program.dao.impl.ScoreDaoImpl;
import grade_management_program.dto.Score;

public class ScoreService {
	private ScoreDaoImpl dao;
	
	public ScoreService() {
		dao = ScoreDaoImpl.getInstance();
	}

	public List<Score> showScoreAll() {
		return dao.selectScoreByAll();
	}
	
	public void showScoreSubcode(Score score) {
		dao.selectScoreByNo(score);
	}
	
	public void createScore(Score score) {
		dao.insertScore(score);
	}
	
	public void delScore(int stdNo, int subNo) {
		dao.deleteScore(stdNo, subNo);
	}
	
	public void upScore(Score score) {
		dao.updateScore(score);
	}
}
