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
			System.out.println("Statment Slcosed Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeResultset(final ResultSet resultSet) {
		try {
			resultSet.close();
			System.out.println("Resultset Slcosed Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeConnection(final Connection connection) {
		try {
			connection.close();
			System.out.println("Connection Slcosed Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
