package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	public static Connection getConnection() throws Exception{

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String id = "system", pwd = "1234";
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			Connection con =DriverManager.getConnection(url,id,pwd);
			System.out.println("연결 성공");
			return con;
		 
	}

}
