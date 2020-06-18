package com.assignment.view.student;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.beans.PropertyVetoException;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class StudentRecordAdmin extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTable table;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
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
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Id", "Name", "Subject", "Level", "EventBooked"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(124);
		table.getColumnModel().getColumn(2).setPreferredWidth(97);
		table.getColumnModel().getColumn(3).setPreferredWidth(101);
		table.getColumnModel().getColumn(4).setPreferredWidth(114);
		table.setBorder(new LineBorder(Color.BLACK));
		table.setBounds(12, 142, 462, 121);
		panel.add(table);
		
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
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Dialog", Font.BOLD, 14));
		lblId.setBounds(12, 115, 27, 15);
		panel.add(lblId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Dialog", Font.BOLD, 14));
		lblName.setBounds(72, 115, 64, 15);
		panel.add(lblName);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSubject.setBounds(204, 115, 64, 15);
		panel.add(lblSubject);
		
		JLabel lblLevel = new JLabel("Level");
		lblLevel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblLevel.setBounds(293, 115, 64, 15);
		panel.add(lblLevel);
		
		JLabel lblEventBooked = new JLabel("EventBooked");
		lblEventBooked.setFont(new Font("Dialog", Font.BOLD, 12));
		lblEventBooked.setBounds(369, 115, 94, 15);
		panel.add(lblEventBooked);
		
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
		label_7.setBounds(57, 321, 141, 25);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("level(CLass)");
		label_8.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_8.setBounds(57, 358, 94, 25);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("Email");
		label_9.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_9.setBounds(57, 93, 70, 31);
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel("Subject");
		label_10.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_10.setBounds(57, 395, 100, 25);
		panel_1.add(label_10);
		
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
		textField_5.setBounds(263, 272, 162, 24);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(263, 322, 162, 24);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(263, 358, 162, 24);
		panel_1.add(textField_7);
		
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
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(263, 394, 162, 24);
		panel_1.add(comboBox);
		
		JLabel label_11 = new JLabel("Section");
		label_11.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_11.setBounds(57, 432, 100, 25);
		panel_1.add(label_11);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(263, 430, 162, 24);
		panel_1.add(textField_8);
		
		JLabel label_12 = new JLabel("Total Booked Event");
		label_12.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_12.setBounds(57, 461, 156, 25);
		panel_1.add(label_12);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(263, 466, 162, 24);
		panel_1.add(textField_9);
		
		JButton btnViewEvent = new JButton("View Event");
		btnViewEvent.setBounds(425, 465, 117, 25);
		panel_1.add(btnViewEvent);

	}
}
