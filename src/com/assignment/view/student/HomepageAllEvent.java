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
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;

//import java.awt.event.MouseListener;
//import javax.swing.plaf.basic.BasicInternalFrameUI;

public class HomepageAllEvent extends JInternalFrame {
	private JTable allevent;

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
		setSize(1344, 668);
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
		panel_2.setBounds(0, 0, 630, 641);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		

		allevent = new JTable();
		allevent.setSurrendersFocusOnKeystroke(true);
		allevent.setShowHorizontalLines(false);
		allevent.setBorder(new CompoundBorder(new LineBorder(new Color(0, 255, 0), 3), new LineBorder(new Color(255, 200, 0), 3)));
		allevent.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Eid", "Event Name", "Start Date"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		allevent.getColumnModel().getColumn(1).setPreferredWidth(165);
		allevent.getColumnModel().getColumn(2).setPreferredWidth(95);
		allevent.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		allevent.setBounds(53, 84, 418, 377);
		
		panel_2.add(allevent);
		
		JLabel lblEid = new JLabel("eid");
		lblEid.setFont(new Font("Lato Black", Font.BOLD, 20));
		lblEid.setBounds(66, 58, 70, 25);
		panel_2.add(lblEid);
		
		JLabel lblName = new JLabel("Event Name");
		lblName.setFont(new Font("Lato Black", Font.BOLD, 20));
		lblName.setBounds(178, 58, 130, 25);
		panel_2.add(lblName);
		
		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setFont(new Font("Lato Black", Font.BOLD, 20));
		lblStartDate.setBounds(356, 58, 109, 25);
		panel_2.add(lblStartDate);
		

		

	}
}
