package grade_management_program.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grade_management_program.dao.ClassRDao;
import grade_management_program.dto.ClassR;
import grade_management_program.util.JdbcUtil;

public class ClassRDaoImpl implements ClassRDao {
	private static final ClassRDaoImpl instance = new ClassRDaoImpl();
	
	public static ClassRDaoImpl getInstance() {
		return instance;
	}

	private ClassRDaoImpl() {
	}
	
	@Override
	public List<ClassR> selectClassRByAll() {
		String sql = "select classrm from classr";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			if (rs.next()) {
				List<ClassR> list = new ArrayList<>();
				do {
					list.add(getClassR(rs));
				}while(rs.next());
//				System.out.println(list.size());
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private ClassR getClassR(ResultSet rs) throws SQLException {
		String classR = rs.getString("ClassRm");
		return new ClassR(classR);
	}

	@Override
	public ClassR selectClassRByNo(ClassR classR) {
		String sql = "select classrm from classr where classrm = ?";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, classR.getClassR());
			try(ResultSet rs = pstmt.executeQuery()){
				if (rs.next()) {
					return getClassR(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insertClassR(ClassR classR) {
		String sql = "insert into ClassR values(?)";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, classR.getClassR());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateClassR(ClassR newclassR) {
		String sql = "update ClassR set classR = ? where classR = ?";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, newclassR.getClassR());
			pstmt.setString(2, newclassR.getClassR());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteClassR(String classR) {
		String sql = "delete from ClassR where classR = ?";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, classR);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
