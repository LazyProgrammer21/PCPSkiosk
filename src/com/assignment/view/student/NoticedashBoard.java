package com.assignment.view.student;


import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NoticedashBoard extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable notietable;
	private int triggerValue;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					NoticedashBoard frame = new NoticedashBoard();
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
	
	public NoticedashBoard(int triggerValue) {
		this.triggerValue=triggerValue;
		initialize();
	}
	public void initialize() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setBorder(null);
		BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
		gui.setNorthPane(null);
		setBounds(0, 0, 1088, 591);
		setSize(1344, 668);	
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBounds(179, 168, 323, 316);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		notietable = new JTable();
		notietable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"ID", "Date issued", "Issued BY"
			}
		));
		notietable.getColumnModel().getColumn(1).setPreferredWidth(105);
		notietable.getColumnModel().getColumn(2).setPreferredWidth(85);
		notietable.setBounds(12, 98, 299, 143);
		panel.add(notietable);
		
		JButton btnDeleteNotice = new JButton("Delete Notice");
		if(triggerValue==1) {
			btnDeleteNotice.setVisible(false);
		}
		btnDeleteNotice.setBounds(49, 253, 130, 25);
		panel.add(btnDeleteNotice);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Dialog", Font.BOLD, 15));
		lblId.setBounds(12, 64, 44, 15);
		panel.add(lblId);
		
		JLabel lblDateIssued = new JLabel("Date issued");
		lblDateIssued.setFont(new Font("Dialog", Font.BOLD, 15));
		lblDateIssued.setBounds(101, 64, 107, 15);
		panel.add(lblDateIssued);
		
		JLabel lblIssuedBy = new JLabel("Issued BY");
		lblIssuedBy.setFont(new Font("Dialog", Font.BOLD, 15));
		lblIssuedBy.setBounds(216, 64, 95, 15);
		panel.add(lblIssuedBy);
		
		JButton btnIssueNotice = new JButton("Issue Notice");
		btnIssueNotice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IssueNotice in = new IssueNotice();
				in.setVisible(true);
				in.setLocationRelativeTo(null);
				
//				NoticedashBoard.this.dispose();
			}
		});
		if(triggerValue==1) {
			btnIssueNotice.setVisible(false);
		}
		btnIssueNotice.setBounds(181, 253, 130, 25);
		panel.add(btnIssueNotice);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(new LineBorder(Color.BLACK));
		panel_1.setBounds(514, 78, 701, 500);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane txtPane = new JTextPane();
		txtPane.setFont(new Font("Dialog", Font.PLAIN, 21));
		txtPane.setEditable(false);
		txtPane.setBounds(44, 114, 610, 305);
		panel_1.add(txtPane);
		
		JLabel lblSubject = new JLabel("SUBJECT:");
		lblSubject.setFont(new Font("Dialog", Font.BOLD, 26));
		lblSubject.setBounds(41, 52, 145, 32);
		panel_1.add(lblSubject);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(192, 52, 462, 32);
		panel_1.add(textPane);
		
		

	}
}
