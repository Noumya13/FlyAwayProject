package com.simplilearn.JDBCUtil;


import java.sql.*;
public class JdbcUtil {
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // MySql Driver
			//Class.forName("oracle.jdbc.driver.OracleDriver"); // Oracle Drive
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	public static Connection getMySqlConnection() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root","root12345");	
		return con;
	}

	public static void cleanup(Statement st, Connection con) {
		try {
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void cleanup(ResultSet rs, Statement st, Connection con) {
		try {
			if (rs != null)
				rs.close();
			if (con != null)
				con.close();
			if (st != null)
				st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}