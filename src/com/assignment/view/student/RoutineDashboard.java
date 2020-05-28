package com.assignment.view.student;



import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class RoutineDashboard extends JInternalFrame {

	private static final long serialVersionUID = 1L;


	public RoutineDashboard() {
		setBounds(100, 100, 923, 548);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 43, 265, 329);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(295, 12, 606, 492);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

	}
}
