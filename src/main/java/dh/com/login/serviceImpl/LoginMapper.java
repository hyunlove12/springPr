package dh.com.login.serviceImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Mapper
public class LoginMapper {

	@Autowired
	DriverManagerDataSource dataSource;
	
	public void test(){
		Connection conn = null;
		//Statement st = null;
		try {
			conn = dataSource.getConnection();
			Statement st = conn.createStatement();
			String temp = "";
			ResultSet rs = st.executeQuery("SELECT * FROM DEPT;");
			while(rs.next()) {
				temp += rs.getString("deptId");				
			}
			System.out.println("@@@" + temp);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
}
