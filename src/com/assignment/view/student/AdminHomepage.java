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
import javax.swing.JMenuBar;

public class AdminHomepage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public int trigger_for_btn_disable;

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
		setBounds(100, 100, 1219, 618);
//		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(27, 100, 1155, 442);
		contentPane.add(desktopPane);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(73, 23, 986, 54);
		contentPane.add(menuBar);
		
		JButton btnStudentRecord = new JButton("Student Record");
		menuBar.add(btnStudentRecord);
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
		btnStudentRecord.setFont(new Font("C059", Font.BOLD, 16));
		
		JButton btnEvents = new JButton("Events");
		btnEvents.setFont(new Font("C059", Font.BOLD, 16));
		menuBar.add(btnEvents);
		
		JButton btnNotice = new JButton("Notice");
		btnNotice.setFont(new Font("C059", Font.BOLD, 16));
		menuBar.add(btnNotice);
		
		JButton btnFeedbacks = new JButton("Feedbacks");
		btnFeedbacks.setFont(new Font("C059", Font.BOLD, 16));
		menuBar.add(btnFeedbacks);
		
		JButton btnRoutine = new JButton("Routine");
		btnRoutine.setFont(new Font("C059", Font.BOLD, 16));
		menuBar.add(btnRoutine);
		
		JButton btnCollegeDetails = new JButton("College Details");
		btnCollegeDetails.setFont(new Font("C059", Font.BOLD, 16));
		menuBar.add(btnCollegeDetails);
		
		JButton btnAddAdmin = new JButton("Administrative");
		btnAddAdmin.setFont(new Font("C059", Font.BOLD, 16));
		menuBar.add(btnAddAdmin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("C059", Font.BOLD, 16));
		menuBar.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnCollegeDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEvents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HomepageAllEvent event;
				try {
					trigger_for_btn_disable = 1;
					event = new HomepageAllEvent(trigger_for_btn_disable);
//					event.btnCancelEvent.disabled();
					desktopPane.add(event).setVisible(true);
				} catch (PropertyVetoException e) {
					
					System.out.println("Page Not Found!!");
				}
				
				
			}
		});
	}
	void eventhomepagebyAdmin(JButton cancelBtn, JTable table1, JButton bookbtn) {
		try {
			HomepageAllEvent eve = new HomepageAllEvent(trigger_for_btn_disable);
//			cancelBtn = eve.cancelbtn;
			
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public int passtheTrigger() {
		
		int value = trigger_for_btn_disable;
		return value;
	}
}
