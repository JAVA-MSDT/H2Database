package com.javamsdt.database.model.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	public static Connection getConnection() throws SQLException {

		String url = "jdbc:h2:mem:test";
		String user = "sa";
		String password = "";

		return DriverManager.getConnection(url, user, password);
	}

	public static void closeStatement(final Statement statement) {
		try {
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeResultset(final ResultSet resultSet) {
		try {
			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeConnection(final Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
