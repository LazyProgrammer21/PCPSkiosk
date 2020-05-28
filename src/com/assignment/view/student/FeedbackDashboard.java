package com.assignment.view.student;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class FeedbackDashboard extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeedbackDashboard frame = new FeedbackDashboard();
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
	public FeedbackDashboard() {
		setBounds(100, 100, 450, 300);

	}

}
