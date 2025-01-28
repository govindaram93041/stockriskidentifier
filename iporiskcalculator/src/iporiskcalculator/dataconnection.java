package iporiskcalculator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dataconnection {
	 private static final String url="jdbc:mysql://localhost:3306/jdbcdemo2";
		private static final String usernaame="root";
		private static final String password="root";
		public static Connection getconnection() throws SQLException{
			System.out.println("Not connected");
			return DriverManager.getConnection(url, usernaame, password);
}
}
