package com.assignment.view.student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.reflect.UndeclaredThrowableException;
import java.awt.event.ActionEvent;

public class stdUNIkey extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					stdUNIkey frame = new stdUNIkey();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public stdUNIkey() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 426);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"College ID", "Student Name", "UniversityID"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				true, true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(102);
		table.getColumnModel().getColumn(0).setMinWidth(42);
		table.getColumnModel().getColumn(1).setPreferredWidth(137);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(97);
		table.setBounds(40, 58, 458, 289);
		contentPane.add(table);
		
		JLabel lblCollegeId = new JLabel("College  ID");
		lblCollegeId.setFont(new Font("Dialog", Font.BOLD, 16));
		lblCollegeId.setBounds(60, 24, 114, 15);
		contentPane.add(lblCollegeId);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setFont(new Font("Dialog", Font.BOLD, 16));
		lblStudentName.setBounds(195, 25, 134, 15);
		contentPane.add(lblStudentName);
		
		JLabel lblCollegeId_1_1 = new JLabel("University  ID");
		lblCollegeId_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblCollegeId_1_1.setBounds(364, 31, 134, 15);
		contentPane.add(lblCollegeId_1_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stdUNIkey.this.dispose();
			}
		});
		btnBack.setBounds(387, 352, 117, 25);
		contentPane.add(btnBack);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addStudent add = new addStudent();
				add.setVisible(true);
				add.setLocationRelativeTo(null);
				stdUNIkey.this.dispose();
				
			}
		});
		btnAddStudent.setBounds(233, 352, 142, 25);
		contentPane.add(btnAddStudent);
	}
}
