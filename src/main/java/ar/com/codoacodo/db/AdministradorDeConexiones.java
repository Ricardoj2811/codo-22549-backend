package ar.com.codoacodo.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones{
	
	public static Connection getConnection() throws Exception{
		
		String hosts = "localhost";
		String port = "3306";
		String username = "root";
		String password = "";
		String dbName = "22549";
		
		String url = "jdbc:mysql://"+hosts+":"+port+"/"+dbName + "?serverTimeZone=UTC&useSSL=false";
		
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		
		Class.forName(driverClassName);
		
		Connection connection = DriverManager.getConnection(url, username, password); 
			
		return connection;
	}
}
