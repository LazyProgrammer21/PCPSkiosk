package com.assignment.view.student;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import java.beans.PropertyVetoException;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

//import java.awt.event.MouseListener;
//import javax.swing.plaf.basic.BasicInternalFrameUI;

public class HomepageAllEvent extends JInternalFrame {
	private JTable Alleventlist;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomepageAllEvent frame = new HomepageAllEvent();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws PropertyVetoException 
	 */
	public HomepageAllEvent() throws PropertyVetoException {
		setTitle("Homepage");
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		getContentPane().setBackground(Color.DARK_GRAY);
		setClosed(true);
		
		
		setBounds(0, 0, 1350, 685);
		setSize(1350, 668);
//		BasicInternalFrameUI ifui = ((javax.swing.plaf.BasicInternalFrameUI)this.getUI());
//		for (MouseListener listener: ifui.getNorthPane().getMouseListeners()) {
//			ifui.getNorthPane().removeMouseListener(listener);
//		}
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(1080, 0, 260, 641);
		getContentPane().add(panel);
		
		JLabel lblImages = new JLabel("Images");
		panel.add(lblImages);
		lblImages.setFont(new Font("FreeSans", Font.BOLD, 33));
		
		JLabel lblPicture = new JLabel("picture 1");
		panel.add(lblPicture);
		lblPicture.setForeground(Color.ORANGE);
		lblPicture.setBackground(Color.YELLOW);
		
		JLabel lblPicture_1 = new JLabel("picture 2");
		panel.add(lblPicture_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(631, 0, 447, 641);
		getContentPane().add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Event Details");
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("FreeSans", Font.BOLD, 33));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(5, 0, 625, 641);
		getContentPane().add(panel_2);
		Alleventlist = new JTable();
		panel_2.add(Alleventlist);
		Alleventlist.setShowGrid(false);
		Alleventlist.setBackground(Color.LIGHT_GRAY);
		Alleventlist.setFont(new Font("Lato Heavy", Font.BOLD, 18));
		Alleventlist.setForeground(Color.WHITE);
		Alleventlist.setModel(new DefaultTableModel(
			new Object[][] {
				{},
				{},
				{},
				{},
				{},
				{},
				{},
				{},
				{},
				{},
			},
			new String[] {
			}
		));
		

		

	}
}
