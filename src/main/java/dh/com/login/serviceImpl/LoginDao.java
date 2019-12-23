package dh.com.login.serviceImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import dh.com.login.service.LoginVO;

@Component
public class LoginDao implements LoginDaoInter {

	@Autowired
	DriverManagerDataSource dataSource;
	
	public ArrayList<LoginVO> userList() {
		ArrayList<LoginVO> list = new ArrayList<LoginVO>();
		LoginVO vo = new LoginVO();
		Connection conn = null;
		Statement st = null;
		try {
			conn = dataSource.getConnection();
			st = conn.createStatement();			
			ResultSet rs = st.executeQuery("SELECT * FROM DEPT;");
			while(rs.next()) {
				vo.setDeptId(rs.getString("deptId"));
				list.add(vo);				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return list;
	}
	
}
