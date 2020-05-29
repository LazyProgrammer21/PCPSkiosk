package com.assignment.view.student;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class RoutineDashboardAdmin extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoutineDashboardAdmin frame = new RoutineDashboardAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RoutineDashboardAdmin() {
		setTitle("Routine CRUD");
		setBounds(100, 100, 966, 546);
		getContentPane().setLayout(null);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setEditable(true);
		comboBox.setBounds(97, 79, 125, 24);
		getContentPane().add(comboBox);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(240, 79, 125, 24);
		getContentPane().add(comboBox_1);
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setEditable(true);
		comboBox_2.setBounds(391, 79, 137, 24);
		getContentPane().add(comboBox_2);
		
		JComboBox<String> comboBox_3 = new JComboBox<String>();
		comboBox_3.setEditable(true);
		comboBox_3.setBounds(557, 79, 120, 24);
		getContentPane().add(comboBox_3);
		
		JLabel label = new JLabel("Time");
		label.setFont(new Font("Dialog", Font.PLAIN, 22));
		label.setBounds(112, 178, 70, 27);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Lecture");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_1.setBounds(399, 178, 105, 27);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("8:00am -9:00am");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_2.setBounds(112, 230, 192, 27);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("9:00am -10:00am");
		label_3.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_3.setBounds(112, 274, 204, 27);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("10:00am -11:00am");
		label_4.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_4.setBounds(112, 313, 216, 27);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("11:00am -12:00pm");
		label_5.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_5.setBounds(112, 352, 216, 31);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("12:00am -1:00pm");
		label_6.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_6.setBounds(112, 395, 216, 31);
		getContentPane().add(label_6);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(390, 395, 192, 34);
		getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(390, 349, 192, 34);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(390, 302, 192, 34);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(390, 267, 192, 34);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(390, 223, 192, 34);
		getContentPane().add(textField_4);
		
		JButton btnUpdate = new JButton("update");
		btnUpdate.setBounds(672, 358, 99, 25);
		getContentPane().add(btnUpdate);
		
		JButton btnAddroutine = new JButton("Add");
		btnAddroutine.setBounds(672, 383, 99, 25);
		getContentPane().add(btnAddroutine);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(672, 417, 99, 25);
		getContentPane().add(btnDelete);

	}

}
