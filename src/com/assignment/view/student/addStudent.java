package com.assignment.view.student;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.assignment.service.studentService;
import com.assignment.service.studentserviceImpl;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addStudent extends JFrame {

	private JPanel contentPane;
	private JTextField Name;
	private JTextField uniID;
	private JButton btnOk;
	private JButton btnCancel;
	private int uniid;
	private String name;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					addStudent frame = new addStudent();
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
	public addStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 426);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setFont(new Font("Dialog", Font.BOLD, 16));
		lblStudentName.setBounds(84, 157, 134, 15);
		contentPane.add(lblStudentName);
		
		Name = new JTextField();
		Name.setBounds(236, 151, 185, 30);
		contentPane.add(Name);
		Name.setColumns(10);
		
		JLabel lblUniversityId = new JLabel("University ID:");
		lblUniversityId.setFont(new Font("Dialog", Font.BOLD, 16));
		lblUniversityId.setBounds(84, 210, 134, 15);
		contentPane.add(lblUniversityId);
		
		uniID = new JTextField();
		uniID.setColumns(10);
		uniID.setBounds(236, 204, 185, 30);
		contentPane.add(uniID);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 uniid = Integer.parseInt(uniID.getText());
				 name = Name.getText();
				
				studentService ss = new studentserviceImpl();
				
				
				
				if(ss.addStudentadmin(validation_id(),validation_name() ) ) {
					JOptionPane.showMessageDialog(null, "Added Success");
				}
				else {
					
					JOptionPane.showMessageDialog(null, "Added Failed");
				}
				
				
					
				
			
			uniID.setText(null);
			Name.setText(null);
			
						
		}
				
		});
		btnOk.setBounds(253, 295, 74, 25);
		contentPane.add(btnOk);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addStudent.this.dispose();
			}
		});
		btnCancel.setBounds(339, 295, 82, 25);
		contentPane.add(btnCancel);
	}
	
	public int validation_id() {
		
			int id = 0;
			
			int length=String.valueOf(uniid).length();
		
			if(length==7) {
				id=uniid;
				
				
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Check UNIVERSITY ID!");
			}
			return id;
			
			
		
	}
	public String validation_name() {
		String sname = null;
		if(name.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Student Name cannot be Empty!!");
			
		}
		else
		{
			sname=name;
		}
		
		return sname;
		
		
	}

}
