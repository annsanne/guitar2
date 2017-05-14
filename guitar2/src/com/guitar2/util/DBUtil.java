package com.guitar2.util;

import java.sql.*;


public class DBUtil {

	public static void main(String[] args) {
		Connection conn = DBUtil.getConnection();
		System.out.println(conn);
	}

	public static Connection getConnection() {
		try {			Class.forName("org.sqlite.JDBC");
			return DriverManager.getConnection("jdbc:sqlite:guitar.db");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void closeConnection(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
