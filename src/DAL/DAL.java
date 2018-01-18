package DAL;

import java.sql.*;


//import Model.Student;
//import Model.Studied;
//import Model.Course;

public class DAL {
	
	
	private Connection con;
	private String errorMessage;

	public DAL() {
		registerDriverClass();
		errorMessage = "Working just great!";
	}

	public String getCurrentErrorMessage() {
		return errorMessage;
	}

	// Registrerar drivrutinklass
	public void registerDriverClass() {

		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} catch (Exception e) {
			errorMessage = "Cant find driver";
		}
	}

	// Connection
	public Connection connect() {
		try {
			String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Omid;user=app;password=app;";
			con =  DriverManager.getConnection(connectionUrl);
		} catch (Exception e) {
			errorMessage = "Kan inte skapa en connection";
		}
		return con;
	}
	
	

	//private Student student;
//	private Course course;
//	private Studied studied;
	
	public ResultSet getStudents() throws SQLException {
		PreparedStatement pst = connect().prepareStatement(
				"SELECT * FROM Student");
		return pst.executeQuery();
	}
}
