package com.assignment.view.student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Window.Type;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IssueNotice extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					IssueNotice frame = new IssueNotice();
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
	public IssueNotice() {
		setTitle("Add Notice\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 632, 584);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(174, 411, 225, 35);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel = new JLabel("SUBJECT:");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel.setBounds(30, 88, 110, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Dialog", Font.BOLD, 17));
		lblDescription.setBounds(30, 190, 110, 22);
		contentPane.add(lblDescription);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Dialog", Font.BOLD, 17));
		lblDate.setBounds(30, 411, 110, 22);
		contentPane.add(lblDate);
		
		JLabel lblIssuedBy = new JLabel("Issued BY:");
		lblIssuedBy.setFont(new Font("Dialog", Font.BOLD, 17));
		lblIssuedBy.setBounds(30, 351, 110, 22);
		contentPane.add(lblIssuedBy);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnUpload.setBounds(479, 411, 117, 22);
		contentPane.add(btnUpload);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
//				
				IssueNotice.this.dispose();
//				
			}
		});
		btnCancel.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnCancel.setBounds(479, 434, 117, 27);
		contentPane.add(btnCancel);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setRows(7);
		textArea.setBounds(174, 122, 422, 184);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setLineWrap(true);
		textArea_1.setRows(7);
		textArea_1.setBounds(174, 70, 422, 40);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setRows(7);
		textArea_2.setLineWrap(true);
		textArea_2.setBounds(174, 335, 422, 40);
		contentPane.add(textArea_2);
	}
}
