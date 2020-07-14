package com.assignment.view.student;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.beans.PropertyVetoException;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JRadioButton;

import com.assignment.model.noticeinfo;
import com.assignment.model.studentinfo;
import com.assignment.service.studentService;
import com.assignment.service.studentserviceImpl;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class StudentRecordAdmin extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_9;
	private JTable table;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	studentService ss = new studentserviceImpl();
	List<studentinfo> ninfo = ss.getstudentDetailbyID();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentRecordAdmin frame = new StudentRecordAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws PropertyVetoException 
	 */
	public StudentRecordAdmin() throws PropertyVetoException {
//		setTitle("Student record");
		setBorder(null);
		BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
		gui.setNorthPane(null);
		setBounds(0, 0, 1074, 581);
		setSize(1344, 668);
		
		
		getContentPane().setBackground(Color.GRAY);
		setClosed(true);
		setVisible(true);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(149, 152, 486, 398);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 115, 462, 148);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Id", "Name", "Subject", "Semester", "Section"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(124);
		table.getColumnModel().getColumn(2).setPreferredWidth(97);
		table.getColumnModel().getColumn(3).setPreferredWidth(101);
		table.getColumnModel().getColumn(4).setPreferredWidth(114);
		displatTable(table);
		table.setBorder(new LineBorder(Color.BLACK));
		
		JComboBox <String>comboBox_3 = new JComboBox<String>();
		comboBox_3.setEditable(true);
		comboBox_3.setBounds(12, 24, 124, 34);
		comboBox_3.addItem("L4");
		comboBox_3.addItem("L5");
		comboBox_3.addItem("L6");
		comboBox_3.setSelectedItem("Filter Stduent");
		
		panel.add(comboBox_3);
		
		textField_10 = new JTextField();
		textField_10.setBounds(143, 24, 167, 32);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(322, 28, 94, 25);
		panel.add(btnNewButton);
		
		JLabel label_13 = new JLabel("");
		label_13.setFont(new Font("Dialog", Font.BOLD, 14));
		label_13.setBounds(410, 115, 64, 15);
		panel.add(label_13);
		
		JButton btnDeleteStudent = new JButton("Delete Student");
		btnDeleteStudent.setBounds(322, 275, 152, 25);
		panel.add(btnDeleteStudent);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(687, 92, 542, 496);
		getContentPane().add(panel_1);
		
		JLabel label = new JLabel("ID");
		label.setFont(new Font("FreeSans", Font.BOLD, 16));
		label.setBounds(57, 12, 70, 28);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("Name");
		label_1.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_1.setBounds(57, 66, 70, 25);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("DOB");
		label_2.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_2.setBounds(57, 136, 70, 25);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Gender");
		label_3.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_3.setBounds(57, 161, 70, 25);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Add_city");
		label_4.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_4.setBounds(57, 198, 70, 25);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("Address State");
		label_5.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_5.setBounds(57, 235, 121, 25);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("zipcode");
		label_6.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_6.setBounds(57, 284, 83, 25);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("Phonen Number");
		label_7.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_7.setBounds(57, 341, 141, 25);
		panel_1.add(label_7);
		
		JLabel label_9 = new JLabel("Email");
		label_9.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_9.setBounds(57, 93, 70, 31);
		panel_1.add(label_9);
		
		textField = new JTextField();
		textField.setText("No update");
		textField.setColumns(10);
		textField.setBounds(263, 14, 162, 24);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(263, 53, 162, 24);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(263, 89, 162, 24);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(263, 187, 162, 24);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(263, 235, 162, 24);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(263, 287, 162, 24);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(263, 344, 162, 24);
		panel_1.add(textField_6);
		
		JRadioButton radioButton = new JRadioButton("Male");
		radioButton.setBounds(260, 161, 70, 23);
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Female");
		radioButton_1.setBounds(335, 161, 90, 23);
		panel_1.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Other");
		radioButton_2.setBounds(433, 161, 90, 23);
		panel_1.add(radioButton_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(263, 125, 171, 28);
		panel_1.add(dateChooser);
		
		JLabel label_12 = new JLabel("Total Booked Event");
		label_12.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_12.setBounds(57, 401, 156, 25);
		panel_1.add(label_12);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(254, 404, 171, 24);
		panel_1.add(textField_9);
		
		JButton btnViewEvent = new JButton("View Event");
		btnViewEvent.setBounds(308, 439, 117, 25);
		panel_1.add(btnViewEvent);

		
	}
	void displatTable(JTable table) {
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		
		// empty the table first otherwise on every button click same data will repeatedly displayed
		
		tableModel.setRowCount(0);
		
		for(studentinfo ninfos : ninfo)
		{
			tableModel.addRow(new Object[] {ninfos.getClzId(),ninfos.getName(),ninfos.getSubject(),ninfos.getSemseter(),ninfos.getSection()});
		}
	}
}
