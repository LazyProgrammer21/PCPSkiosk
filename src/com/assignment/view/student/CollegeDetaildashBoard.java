package com.assignment.view.student;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JButton;

public class CollegeDetaildashBoard extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					CollegeDetaildashBoard frame = new CollegeDetaildashBoard();
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
	public CollegeDetaildashBoard() {
		setBounds(0, 0, 1080, 578);
		setBorder(null);
		BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
		gui.setNorthPane(null);
		setSize(1344, 668);	
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Contact US", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(12, 12, 412, 272);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setRows(10);
		textArea_2.setLineWrap(true);
		textArea_2.setBounds(6, 23, 371, 237);
		panel.add(textArea_2);
		
		JScrollBar scrollBar_2 = new JScrollBar();
		scrollBar_2.setBounds(389, 51, 11, 180);
		panel.add(scrollBar_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Intro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(436, 12, 429, 272);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setRows(10);
		textArea_3.setLineWrap(true);
		textArea_3.setBounds(12, 23, 382, 237);
		panel_1.add(textArea_3);
		
		JScrollBar scrollBar_3 = new JScrollBar();
		scrollBar_3.setBounds(406, 49, 11, 180);
		panel_1.add(scrollBar_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "About US", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(877, 12, 440, 272);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setRows(10);
		textArea_4.setLineWrap(true);
		textArea_4.setBounds(12, 23, 393, 237);
		panel_2.add(textArea_4);
		
		JScrollBar scrollBar_4 = new JScrollBar();
		scrollBar_4.setBounds(417, 50, 11, 180);
		panel_2.add(scrollBar_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Courses", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_3.setBounds(112, 307, 1039, 306);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "BSC. CS&SE", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(12, 12, 543, 259);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(10);
		textArea.setLineWrap(true);
		textArea.setBounds(12, 22, 490, 212);
		panel_4.add(textArea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(514, 22, 17, 199);
		panel_4.add(scrollBar);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "BBA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		panel_5.setBounds(581, 12, 446, 259);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setRows(10);
		textArea_1.setLineWrap(true);
		textArea_1.setBounds(12, 22, 393, 206);
		panel_5.add(textArea_1);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(417, 23, 17, 180);
		panel_5.add(scrollBar_1);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(1187, 577, 96, 25);
		getContentPane().add(btnUpdate);

	}
}
