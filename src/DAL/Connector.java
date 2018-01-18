package DAL;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
	static Connection con = null;
	
	public static Connection startConnection(){
		
		try {
			String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=DB2;user=app;password=app;";
			con =  DriverManager.getConnection(connectionUrl);
			if(con == null){
				System.out.println("Not connected!");
			}
			else {
				System.out.println("Connected.");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
	}
	//public static void main(String[] args) {
	
	//startConnection();
	//}
}

