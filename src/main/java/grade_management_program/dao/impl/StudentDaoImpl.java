package grade_management_program.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grade_management_program.dao.StudentDao;
import grade_management_program.dto.Student;
import grade_management_program.exception.SqlConstraintException;
import grade_management_program.util.JdbcUtil;

public class StudentDaoImpl implements StudentDao {
	
	private static final StudentDaoImpl instance = new StudentDaoImpl();
	
	public static StudentDaoImpl getInstance() {
		return instance;
	}

	private StudentDaoImpl() {
	}

	@Override
	public List<Student> selectStudentByAll() {
		String sql = "select stdno, stdname classrm from student";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			if (rs.next()) {
				List<Student> list = new ArrayList<>();
				do {
					list.add(getStudent(rs));
				}while(rs.next());
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Student getStudent(ResultSet rs) throws SQLException {
		int stdNo = rs.getInt("stdno");
		String stdName = rs.getString("stdname");
		String classRm = rs.getString("classrm");
		return new Student(stdNo, stdName, classRm);
	}

	@Override
	public Student selectStudentByNo(Student student) {
		String sql = "select stdno, stdname classrm from student where classrm = ?";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, student.getClassR());
			try(ResultSet rs = pstmt.executeQuery()){
				if (rs.next()) {
					return getStudent(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insertStudent(Student student) {
		String sql = "insert into student values(?, ?, ?)";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, student.getStdNo());
			pstmt.setString(2, student.getStdName());
			pstmt.setString(3, student.getClassR());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new SqlConstraintException(e.getMessage(), e);
		}
	}

	@Override
	public int updateStudent(Student newstudent) {
		String sql = "update student set stdname = ? classrm = ? where stdno = ?";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, newstudent.getStdName());
			pstmt.setString(2, newstudent.getClassR());
			pstmt.setInt(3, newstudent.getStdNo());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteStudent(int stdNo) {
		String sql = "delete from student where stdno = ?";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, stdNo);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new SqlConstraintException(e);
		}
	}
}
