package com.assignment.view.student;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class Administrative extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Administrative frame = new Administrative();
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
	public Administrative() {
		setTitle("Administrative");
		setBounds(100, 100, 836, 566);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Reset Student Password");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 18));
		btnNewButton.setBounds(97, 139, 283, 99);
		getContentPane().add(btnNewButton);
		
		JButton btnAddAdmin = new JButton("Add Admin");
		btnAddAdmin.setFont(new Font("Dialog", Font.BOLD, 18));
		btnAddAdmin.setBounds(97, 261, 283, 99);
		getContentPane().add(btnAddAdmin);

	}
}
