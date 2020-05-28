package com.assignment.view.student;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class FeedbackDashboard extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;

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
		setBounds(100, 100, 1085, 568);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBounds(37, 90, 300, 368);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"FeedbackID", "Student Name", "Date"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(85);
		table.getColumnModel().getColumn(1).setPreferredWidth(121);
		table.getColumnModel().getColumn(2).setPreferredWidth(108);
		table.setBounds(26, 74, 246, 151);
		panel.add(table);
		
		JComboBox <String>comboBox = new JComboBox<String>();
		comboBox.setBounds(26, 38, 246, 24);
		comboBox.addItem("All Feedback");
		comboBox.addItem("My Feedbacks");
		comboBox.addItem("Feedback by Date");
		comboBox.setSelectedItem("Filter");
		panel.add(comboBox);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(171, 285, 117, 25);
		panel.add(btnDelete);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(36, 248, 117, 25);
		panel.add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(171, 248, 117, 25);
		panel.add(btnEdit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.BLACK));
		panel_1.setBounds(349, 44, 604, 446);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Dialog", Font.PLAIN, 17));
		textArea.setRows(8);
		textArea.setLineWrap(true);
		textArea.setBounds(150, 115, 442, 244);
		panel_1.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		textArea_1.setRows(8);
		textArea_1.setLineWrap(true);
		textArea_1.setBounds(150, 46, 442, 48);
		panel_1.add(textArea_1);
		
		JLabel lblDetail = new JLabel("Detail");
		lblDetail.setFont(new Font("Dialog", Font.PLAIN, 19));
		lblDetail.setBounds(42, 256, 70, 35);
		panel_1.add(lblDetail);
		
		JLabel lblTopic = new JLabel("Topic");
		lblTopic.setFont(new Font("Dialog", Font.PLAIN, 19));
		lblTopic.setBounds(42, 46, 70, 35);
		panel_1.add(lblTopic);

	}
}
