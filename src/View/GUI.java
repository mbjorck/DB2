package View;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
//import javax.swing.table.DefaultTableModel;

import Controller.Controller;
//import Model.Student;
import DAL.*;
//import javax.swing.JTextField;

public class GUI {

	private JFrame frame;
//	private JTable table;
	DAL dal;
	Controller controller;
//	private DefaultTableModel tableModelStudent;
	private JTable table_student;
	private JScrollPane scrollPane_student;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 707, 623);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSearchAllStudents = new JButton("Get");
		btnSearchAllStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchAllStudents();
			}
		});
		btnSearchAllStudents.setBounds(262, 90, 89, 23);
		frame.getContentPane().add(btnSearchAllStudents);
		
		JScrollPane scrollPane_Student = new JScrollPane();
		scrollPane_Student.setBounds(130, 169, 422, 209);
		frame.getContentPane().add(scrollPane_Student);
	
		
	//	String[] headerStudent = { "ID", "Name"}; 	// Namnet på era kolumner
		//tableModelStudent.setColumnIdentifiers(headerStudent);
		
	//	JButton btnFindStudent_1 = new JButton("Find Student");
	//	btnFindStudent_1.setBounds(82, 146, 115, 29);
	//	frame.getContentPane().add(btnFindStudent_1);
	}
	
	/* SÖK ALLA STUDENTER */
	private void searchAllStudents() {
		try {
			ResultSet students;
			students = controller.getStudents();
			ResultSetMetaData md = students.getMetaData();

			Vector<Vector<Object>> list = new Vector<Vector<Object>>();
			Vector<Object> row;
			Vector<Object> columnNames = new Vector<Object>();

			columnNames.add("Personnummer");
			columnNames.add("Name");
			columnNames.add("Adress");

			while (students.next()) {
				row = new Vector<Object>();
				for (int i = 0; i < md.getColumnCount(); i++) {
					Object cell = students.getString(i + 1).trim();
					row.add(cell);
				}

				list.add(row);
			}
			table_student = new JTable(list, columnNames);
			scrollPane_student.setViewportView(table_student);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}
