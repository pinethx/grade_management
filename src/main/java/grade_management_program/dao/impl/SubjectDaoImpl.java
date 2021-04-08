package grade_management_program.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grade_management_program.dao.SubjectDao;
import grade_management_program.dto.Subject;

public class SubjectDaoImpl implements SubjectDao {
	
	private static final SubjectDaoImpl instance = new SubjectDaoImpl();
	
	public static SubjectDaoImpl getInstance() {
		return instance;
	}
	private Connection con;
	
	public void setCon(Connection con) {
		this.con = con;
	}
	
	@Override
	public List<Subject> selectSubjectByAll() {
		String sql = "select subcode, subname from subject";
		try(PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			if(rs.next()) {
				List<Subject> list = new ArrayList<>();
				do {list.add(getSubject(rs));} while(rs.next());
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Subject getSubject(ResultSet rs) throws SQLException {
		int subcode = rs.getInt("subcode");
		String subname = rs.getString("subname");
		return new Subject(subcode, subname);
	}

	@Override
	public int selectStudentByNo(Subject subject) {
		String sql = "select subcode, subname from subject where subcode = ?";
		try(PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, subject.getSubCode());
			System.out.println(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int insertSubject(Subject subject) {
		String sql = "insert into subject values (?, ?)";
		try(PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, subject.getSubCode());
			pstmt.setString(2, subject.getSubName());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateSubject(Subject newsubject) {
		String sql = "update subject set subname = ? where subcode = ?";
		try(PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, newsubject.getSubName());
			pstmt.setInt(2, newsubject.getSubCode());
			return pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteSubject(int subNo) {
		String sql = "delete from subject where subcode = ?";
		try(PreparedStatement pstmt = con.prepareStatement(sql);){
				pstmt.setInt(1, subNo);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
