package com.assignment.view.student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JButton;

public class AdminHomepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHomepage frame = new AdminHomepage();
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
	public AdminHomepage() {
		setTitle("Admin Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(157, -12, 626, 506);
		contentPane.add(desktopPane);
		
		JButton btnStudentRecord = new JButton("Student record");
		btnStudentRecord.setBounds(7, -12, 143, 54);
		contentPane.add(btnStudentRecord);
		
		JButton btnEvents = new JButton("Events");
		btnEvents.setBounds(7, 39, 143, 54);
		contentPane.add(btnEvents);
		
		JButton btnNotice = new JButton("Notice");
		btnNotice.setBounds(7, 89, 143, 54);
		contentPane.add(btnNotice);
		
		JButton btnFeedbacks = new JButton("Feedbacks");
		btnFeedbacks.setBounds(7, 137, 143, 54);
		contentPane.add(btnFeedbacks);
		
		JButton btnRoutine = new JButton("Routine");
		btnRoutine.setBounds(7, 185, 143, 54);
		contentPane.add(btnRoutine);
		
		JButton btnCollegeDetails = new JButton("College Details");
		btnCollegeDetails.setBounds(7, 237, 143, 54);
		contentPane.add(btnCollegeDetails);
		
		JButton btnAddAdmin = new JButton("Administrative");
		btnAddAdmin.setBounds(7, 383, 143, 54);
		contentPane.add(btnAddAdmin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(7, 440, 143, 54);
		contentPane.add(btnExit);
	}
}
