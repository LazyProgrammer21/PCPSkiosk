package com.assignment.view.student;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.awt.event.ActionEvent;

public class AdminHomepage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		setBounds(100, 100, 1216, 618);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(157, 23, 1074, 557);
		contentPane.add(desktopPane);
		
		JButton btnStudentRecord = new JButton("Student Record");
		btnStudentRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StudentRecordAdmin sra;
				try {
					sra = new StudentRecordAdmin();
					sra.setVisible(true);
					desktopPane.add(sra);
				} catch (PropertyVetoException e) {
					JOptionPane.showMessageDialog(null, "Try Again");
					System.out.println("Page Not Found!!");
				}
				
				
			}
		});
		btnStudentRecord.setFont(new Font("Dialog", Font.BOLD, 11));
		btnStudentRecord.setBounds(7, 27, 143, 54);
		contentPane.add(btnStudentRecord);
		
		JButton btnEvents = new JButton("Events");
		btnEvents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HomepageAllEvent event;
				try {
					event = new HomepageAllEvent();
					event.btnCancelEvent.disabled();
					desktopPane.add(event).setVisible(true);
				} catch (PropertyVetoException e) {
					
					System.out.println("Page Not Found!!");
				}
				
				
			}
		});
		btnEvents.setBounds(7, 78, 143, 54);
		contentPane.add(btnEvents);
		
		JButton btnNotice = new JButton("Notice");
		btnNotice.setBounds(7, 128, 143, 54);
		contentPane.add(btnNotice);
		
		JButton btnFeedbacks = new JButton("Feedbacks");
		btnFeedbacks.setBounds(7, 176, 143, 54);
		contentPane.add(btnFeedbacks);
		
		JButton btnRoutine = new JButton("Routine");
		btnRoutine.setBounds(7, 224, 143, 54);
		contentPane.add(btnRoutine);
		
		JButton btnCollegeDetails = new JButton("College Details");
		btnCollegeDetails.setBounds(7, 279, 143, 54);
		contentPane.add(btnCollegeDetails);
		
		JButton btnAddAdmin = new JButton("Administrative");
		btnAddAdmin.setBounds(7, 473, 143, 54);
		contentPane.add(btnAddAdmin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(7, 526, 143, 54);
		contentPane.add(btnExit);
	}
	void eventhomepagebyAdmin(JButton cancelBtn, JTable table1, JButton bookbtn) {
		try {
			HomepageAllEvent eve = new HomepageAllEvent();
//			cancelBtn = eve.cancelbtn;
			
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
