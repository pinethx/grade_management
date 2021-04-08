package grade_management_program.dao;

import java.util.List;

import grade_management_program.dto.Score;

public interface ScoreDao {

	List<Score> selectScoreByAll();
	Score selectScoreByNo(Score score);
	
	int insertScore(Score score);
	int updateScore(Score newscore);
	int deleteScore(int stdno, int subcode);
}
