package com.assignment.view.student;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class administrativepage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					administrativepage frame = new administrativepage();
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
	public administrativepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 407, 418);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnChangeAdminkey = new JButton("Change AdminKey");
		btnChangeAdminkey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String adminKey = JOptionPane.showInputDialog("Please enter the Key to proceed:");
				String key = "admin123";
				try {

					if (!adminKey.isEmpty()) {
						if(adminKey.equals(key)) {
							
							JOptionPane.showMessageDialog(null, "Success");
						changeAdminKey h = new changeAdminKey();
						
						h.setVisible(true);
						h.setLocationRelativeTo(null);
						administrativepage.this.dispose();
						
						
						}
						else {
							JOptionPane.showMessageDialog(null, "Invalid Key Try Again","Alert",JOptionPane.WARNING_MESSAGE);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Field Cannot be Empty");
					}
					
					
				}
				catch(Exception e){
					System.out.println("Cancel pressed");
				}
				
			}
		});
		btnChangeAdminkey.setBounds(109, 135, 183, 41);
		contentPane.add(btnChangeAdminkey);
		
		JButton btnViewStudentUnikey = new JButton("View Student Unikey");
		btnViewStudentUnikey.setBounds(109, 206, 183, 41);
		contentPane.add(btnViewStudentUnikey);
	}
}
