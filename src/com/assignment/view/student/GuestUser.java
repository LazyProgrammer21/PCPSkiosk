package com.assignment.view.student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import javax.swing.JMenuBar;

public class GuestUser extends JFrame {

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
					GuestUser frame = new GuestUser();
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
	public GuestUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(10, 43, 821, 470);
		contentPane.add(desktopPane);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(20, 0, 799, 31);
		contentPane.add(menuBar);
		
		JButton btnCollegeDetails = new JButton("College Details");
		menuBar.add(btnCollegeDetails);
		
		JButton btnFeedBack = new JButton("Feed Back");
		menuBar.add(btnFeedBack);
		
		JButton btnEventDetails = new JButton("Event Details");
		menuBar.add(btnEventDetails);
	}
}
