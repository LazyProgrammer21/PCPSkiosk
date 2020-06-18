package com.assignment.view.student;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;

public class StudentPersonalization extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNoUpdate;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					StudentPersonalization frame = new StudentPersonalization();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}


	public StudentPersonalization() {
		
		setBorder(null);
		BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
		gui.setNorthPane(null);
		
		setBounds(0, 0, 999, 562);
		setSize(1344, 668);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.GRAY);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);
		panel.setBounds(201, 103, 903, 496);
		getContentPane().add(panel);
		
		JLabel label = new JLabel("ID");
		label.setFont(new Font("FreeSans", Font.BOLD, 16));
		label.setBounds(188, 10, 70, 28);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Name");
		label_1.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_1.setBounds(188, 64, 70, 25);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("DOB");
		label_2.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_2.setBounds(188, 134, 70, 25);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Gender");
		label_3.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_3.setBounds(188, 159, 70, 25);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Add_city");
		label_4.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_4.setBounds(188, 196, 70, 25);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Address State");
		label_5.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_5.setBounds(188, 233, 121, 25);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("zipcode");
		label_6.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_6.setBounds(188, 270, 83, 25);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Phonen Number");
		label_7.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_7.setBounds(188, 319, 141, 25);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("level(CLass)");
		label_8.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_8.setBounds(188, 356, 94, 25);
		panel.add(label_8);
		
		JLabel label_10 = new JLabel("Email");
		label_10.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_10.setBounds(188, 91, 70, 31);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Subject");
		label_11.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_11.setBounds(188, 393, 100, 25);
		panel.add(label_11);
		
		txtNoUpdate = new JTextField();
		txtNoUpdate.setText("No update");
		txtNoUpdate.setColumns(10);
		txtNoUpdate.setBounds(394, 12, 162, 24);
		panel.add(txtNoUpdate);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(394, 51, 162, 24);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(394, 87, 162, 24);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(394, 185, 162, 24);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(394, 233, 162, 24);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(394, 270, 162, 24);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(394, 320, 162, 24);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(394, 356, 162, 24);
		panel.add(textField_7);
		
		JRadioButton radioButton = new JRadioButton("Male");
		radioButton.setBounds(391, 159, 70, 23);
		panel.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Female");
		radioButton_1.setBounds(466, 159, 90, 23);
		panel.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Other");
		radioButton_2.setBounds(564, 159, 90, 23);
		panel.add(radioButton_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(394, 123, 171, 28);
		panel.add(dateChooser);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(394, 392, 162, 24);
		panel.add(comboBox);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(588, 392, 117, 25);
		panel.add(btnUpdate);
		
		JButton button_1 = new JButton("Cancel");
		button_1.setBounds(588, 429, 117, 25);
		panel.add(button_1);
		
		JLabel lblSection = new JLabel("Section");
		lblSection.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblSection.setBounds(188, 430, 100, 25);
		panel.add(lblSection);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(394, 428, 162, 24);
		panel.add(textField);
		
		JLabel lblTotalBookedEvent = new JLabel("Total Booked Event");
		lblTotalBookedEvent.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblTotalBookedEvent.setBounds(188, 459, 156, 25);
		panel.add(lblTotalBookedEvent);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(394, 464, 162, 24);
		panel.add(textField_8);
		
		JButton btnViewMyEvent = new JButton("View My event");
		btnViewMyEvent.setBounds(564, 463, 156, 25);
		panel.add(btnViewMyEvent);

	}

}
