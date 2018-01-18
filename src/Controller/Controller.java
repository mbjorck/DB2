package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import DAL.DAL;
//import Model.Student;
import javax.swing.JFrame;

public class Controller {
	DAL DAL;
	
	JFrame frame;
	
	public String exceptionMessage;
	
/*	 public Controller(DAL DAL, JFrame frame) {
		 this.DAL = DAL;
		 this.frame = frame;
		 }
*/
	
	public ResultSet getStudents() throws SQLException {
		return DAL.getStudents();
	}

}
