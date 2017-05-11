package epl362rest;
import java.sql.*;


public class SQLConnection {
	private static boolean dbDriverLoaded = false;
	private static Connection conn = null;
	/**
	 * @return
	 */
	public  Connection getDBConnection() {
	//	String dbConnString = "jdbc:sqlserver://APOLLO.IN.CS.UCY.AC.CY:1433;databaseName=lsolea01;user=lsolea01;password=5tuBrapuvuPR;";
		String dbConnString = "jdbc:sqlserver://localhost;user=modestos;password=omonoia";
		if (!dbDriverLoaded)
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				dbDriverLoaded = true;
			} catch (ClassNotFoundException e) {
				System.out.println("Cannot load DB driver!");
				return null;
			}

		try {
			if (conn == null)
				conn = DriverManager.getConnection(dbConnString);
			else if (conn.isClosed())
				conn = DriverManager.getConnection(dbConnString);
			conn.setHoldability(ResultSet.CLOSE_CURSORS_AT_COMMIT);
		} catch (SQLException e) {
			System.out.print("Cannot connect to the DB!\nGot error: ");
			System.out.print(e.getErrorCode());
			System.out.print("\nSQL State: ");
			System.out.println(e.getSQLState());
			System.out.println(e.getMessage());
		}
		return conn;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SQLConnection sqlc = new SQLConnection();
		conn = sqlc.getDBConnection();

		if (conn == null) {
			return;
		}
		System.out.println("WELCOME TO JDBC sample program ! \n\n");

		String query = new String(
				"INSERT INTO dbo.USERS(USERNAME,PASSWORD,NAME,ROLE) VALUES('admin','12345','admin','admin')");

		CallableStatement cstmt;
		try {
			cstmt = conn.prepareCall(query);
			cstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
	
	try {
			if (!conn.isClosed()) {
				System.out.print("Disconnecting from database...");
				conn.close();
				System.out.println("Done\n\nBye !");
			}
		} catch (Exception e) {
			// Ignore the error and continues
		}
	}
	
	
	
}
