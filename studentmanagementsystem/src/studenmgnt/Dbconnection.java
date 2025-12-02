package studenmgnt;

import java.sql.*;
public class Dbconnection {
    private static final String URL = "jdbc:mysql://localhost:3306/student_management";
    private static final String USER = "root";
    private static final String PASSWORD = "santhosh010624@BI";
    
    public static Connection getConnection() {
    	Connection con = null;
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection(URL ,USER, PASSWORD);
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    	return con; 
    }
}
