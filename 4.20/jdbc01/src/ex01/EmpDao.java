package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpDao {
	
	private static EmpDao instance;
	
	private EmpDao() {
		
	}
	
	public static EmpDao getInstance() {
		if(instance == null) {
			instance = new EmpDao();
		}
		return instance;
	}
	
	private final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String ID = "user01";
	private final String PW = "1234";
	
	private Connection getConnection() {
		try {
			Class.forName(DRIVER_NAME); // SQL Command Line
			Connection conn = DriverManager.getConnection(URL, ID, PW); // SQL > conn user01/1234
			return conn;
		} catch (Exception e) { // Exception의 최상위 클래스
			e.printStackTrace(); 
		}
		return null;
	} 
	
	public EmpVo getEmpList() {
		try {
			Connection conn = getConnection();
			String sql = "select empno, ename, job, sal"
					+ "   from emp"
					+ "   order by empno asc";
			PreparedStatement pstmt = conn.prepareStatement(sql); // SQL 문장 타이핑
			ResultSet rs = pstmt.executeQuery(); // <Enter>
			boolean b = rs.next();
			if(b == true) {
				int empno = rs.getInt("empno"); // 1001
				String ename = rs.getString("ename"); // 김사랑
				String job = rs.getString("job"); // 사원
				int sal = rs.getInt("sal"); // 300
				
				EmpVo empVo = new EmpVo();
				empVo.setEmpno(empno);
				empVo.setEname(ename);
				empVo.setJob(job);
				empVo.setSal(sal);
				
				System.out.println(empVo.toString());
				return empVo;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return null;
	}
	
	
}
