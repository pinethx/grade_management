package grade_management_program.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grade_management_program.dao.ScoreDao;
import grade_management_program.dto.Score;
import grade_management_program.dto.Student;
import grade_management_program.dto.Subject;

public class ScoreDaoImpl implements ScoreDao {
	
	private static final ScoreDaoImpl instance = new ScoreDaoImpl();

	
	public static ScoreDaoImpl getInstance() {
		return instance;
	}

	private Connection con;
	
	public void setCon(Connection con) {
		this.con = con;
	}
	
	@Override
	public List<Score> selectScoreByAll() {
		String sql = "select no, stdno, subcode, subscore from score";
		try(PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			if(rs.next()) {
				List<Score> list = new ArrayList<>();
				do {list.add(getScore(rs));} while(rs.next());
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Score getScore(ResultSet rs) throws SQLException {
		int no = rs.getInt("no");
		Student stdno = new Student(rs.getInt("stdno"));
		Subject subcode = new Subject(rs.getInt("subcode"));
		int subscore = rs.getInt("subscore");
		return new Score(no, stdno, subcode, subscore);
	}

	@Override
	public Score selectScoreByNo(Score score) {
		String sql = "select no, stdno, subcode, subscore from score where stdno = ?, subcode = ?";
		try(PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, score.getStdNo().getStdNo());
			pstmt.setInt(2, score.getSubCode().getSubCode());
			System.out.println(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if (rs.next()) {
					return getScore(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insertScore(Score score) {
		String sql = "insert into score values (?, ?, ?, ?)";
		try(PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, score.getNo());
			pstmt.setInt(2, score.getStdNo().getStdNo());
			pstmt.setInt(3, score.getSubCode().getSubCode());
			pstmt.setInt(4, score.getSubScore());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateScore(Score newscore) {
		String sql = "update score set subscore = ? where stdno = ?, subcode = ?";
		try(PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, newscore.getSubScore());
			pstmt.setInt(2, newscore.getStdNo().getStdNo());
			pstmt.setInt(3, newscore.getSubCode().getSubCode());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteScore(int stdno, int subcode) {
		String sql = "delete from score where stdno = ?, subcode = ?";
		try(PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, stdno);
			pstmt.setInt(2, subcode);
			return pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
