import java.sql.*;

public class test {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:sqlserver://localhost:1433;database=DB2;";
		String user = "app";
		String pass = "app";
		
		try {
			
			Connection con = DriverManager.getConnection(url, user, pass);
			String query = "select * from Student;";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getString(2));
			} 
		}
			catch (SQLException e) {
				e.printStackTrace();
			}
		
		
	}

}
