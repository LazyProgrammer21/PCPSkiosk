package com.assignment.view.student;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

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
		setBounds(100, 100, 973, 526);

	}

}
