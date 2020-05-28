package com.assignment.view.student;


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
import javax.swing.border.CompoundBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//import java.awt.event.MouseListener;
//import javax.swing.plaf.basic.BasicInternalFrameUI;

public class HomepageAllEvent extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable allevent;
	private JTextField textField;
	private boolean status = true;
	

	/**
	 * Create the frame.
	 * @throws PropertyVetoException 
	 */
	public HomepageAllEvent() throws PropertyVetoException {
		addEvent e = new addEvent(status);
		setTitle("Homepage");
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		getContentPane().setBackground(Color.DARK_GRAY);
		setClosed(true);
		
		
		setBounds(0, 0, 1350, 685);
		setSize(1344, 668);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(1080, 0, 260, 641);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblImages = new JLabel("Images");
		lblImages.setBounds(5, 5, 116, 37);
		panel.add(lblImages);
		lblImages.setFont(new Font("FreeSans", Font.BOLD, 33));
		
		JLabel lblPicture = new JLabel("picture 1");
		lblPicture.setBounds(0, 42, 248, 133);
		panel.add(lblPicture);
		lblPicture.setForeground(Color.ORANGE);
		lblPicture.setBackground(Color.RED);
		
		JLabel lblPicture_1 = new JLabel("picture 2");
		lblPicture_1.setBounds(5, 229, 243, 156);
		panel.add(lblPicture_1);
		
		JLabel label = new JLabel("picture 2");
		label.setBounds(5, 415, 243, 190);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(460, 0, 620, 641);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Event Details");
		lblNewLabel.setBounds(206, 5, 208, 37);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("FreeSans", Font.BOLD, 33));
		
		JLabel lblEventId = new JLabel("Event Id");
		lblEventId.setBounds(100, 80, 70, 15);
		panel_1.add(lblEventId);
		
		JLabel lblEventName = new JLabel("Event Name");
		lblEventName.setBounds(93, 133, 96, 26);
		panel_1.add(lblEventName);
		
		JLabel lblEventDescription = new JLabel("Event Description");
		lblEventDescription.setBounds(74, 199, 129, 26);
		panel_1.add(lblEventDescription);
		
		JLabel lblVenue = new JLabel("Venue");
		lblVenue.setBounds(100, 369, 70, 26);
		panel_1.add(lblVenue);
		
		JLabel lblStartDate_1 = new JLabel("Start Date");
		lblStartDate_1.setBounds(74, 429, 129, 26);
		panel_1.add(lblStartDate_1);
		
		JLabel lblEndDate = new JLabel("End Date");
		lblEndDate.setBounds(74, 478, 129, 26);
		panel_1.add(lblEndDate);
		
		JLabel lblOrganisedby = new JLabel("Organisedby");
		lblOrganisedby.setBounds(74, 546, 129, 26);
		panel_1.add(lblOrganisedby);
		
		JTextArea txtrSs = new JTextArea();
		txtrSs.setFont(new Font("Dialog", Font.PLAIN, 23));
		txtrSs.setBounds(216, 70, 364, 28);
		panel_1.add(txtrSs);
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(3);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Dialog", Font.PLAIN, 23));
		textArea.setBounds(216, 120, 364, 47);
		panel_1.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setRows(200);
		textArea_1.setLineWrap(true);
		textArea_1.setFont(new Font("Dialog", Font.PLAIN, 23));
		textArea_1.setBounds(216, 179, 341, 160);
		panel_1.add(textArea_1);
		
		JTextArea venueinfo = new JTextArea();
		venueinfo.setLineWrap(true);
		venueinfo.setTabSize(4);
		venueinfo.setRows(20);
		venueinfo.setFont(new Font("Dialog", Font.PLAIN, 23));
		venueinfo.setBounds(216, 348, 341, 68);
		panel_1.add(venueinfo);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(563, 179, 17, 160);
		panel_1.add(scrollBar);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(563, 348, 17, 68);
		panel_1.add(scrollBar_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("Dialog", Font.PLAIN, 23));
		textArea_2.setBounds(216, 425, 364, 28);
		panel_1.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setFont(new Font("Dialog", Font.PLAIN, 23));
		textArea_3.setBounds(216, 476, 364, 28);
		panel_1.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setRows(200);
		textArea_4.setFont(new Font("Dialog", Font.PLAIN, 23));
		textArea_4.setBounds(216, 516, 341, 101);
		panel_1.add(textArea_4);
		
		JScrollBar scrollBar_2 = new JScrollBar();
		scrollBar_2.setBounds(563, 511, 17, 106);
		panel_1.add(scrollBar_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 0, 456, 641);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		

		allevent = new JTable();
		allevent.setSurrendersFocusOnKeystroke(true);
		allevent.setBorder(null);
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
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		allevent.getColumnModel().getColumn(0).setResizable(false);
		allevent.getColumnModel().getColumn(1).setResizable(false);
		allevent.getColumnModel().getColumn(1).setPreferredWidth(165);
		allevent.getColumnModel().getColumn(2).setResizable(false);
		allevent.getColumnModel().getColumn(2).setPreferredWidth(95);
		allevent.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		allevent.setBounds(52, 219, 344, 231);
		
		panel_2.add(allevent);
		
		JLabel lblEid = new JLabel("EID");
		lblEid.setFont(new Font("Lato Black", Font.BOLD, 20));
		lblEid.setBounds(52, 196, 70, 25);
		panel_2.add(lblEid);
		
		JLabel lblName = new JLabel("Event Name");
		lblName.setFont(new Font("Lato Black", Font.BOLD, 20));
		lblName.setBounds(134, 196, 130, 25);
		panel_2.add(lblName);
		
		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setFont(new Font("Lato Black", Font.BOLD, 20));
		lblStartDate.setBounds(300, 192, 109, 33);
		panel_2.add(lblStartDate);
		
		textField = new JTextField();
		textField.setBounds(216, 116, 180, 33);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(305, 155, 91, 25);
		panel_2.add(btnSearch);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				e.setTitle("Edit Event");
				status = false;
				e.setVisible(true);
				getStatusValue();
			}
		});
		btnEdit.setBounds(52, 463, 99, 25);
		panel_2.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(163, 463, 99, 25);
		panel_2.add(btnDelete);
		
		JButton btnBook = new JButton("Book");
		btnBook.setBounds(270, 499, 129, 25);
		panel_2.add(btnBook);
		
		JButton btnCancelEvent = new JButton("Cancel event");
		btnCancelEvent.setBounds(270, 536, 129, 25);
		panel_2.add(btnCancelEvent);
		
		JButton btnAddEvent = new JButton("Add event");
		btnAddEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				e.setTitle("Add Event");
				e.setVisible(true);
				status=true;
				getStatusValue();
						
			}
		});
		btnAddEvent.setBounds(270, 462, 129, 25);
		panel_2.add(btnAddEvent);
		
		JComboBox<String> comboBox = new JComboBox<String>();		
		comboBox.setEditable(true);
		comboBox.addItem("IT Club");
		comboBox.addItem("Free-Flow Club");
		comboBox.addItem("Socio-Cultural Club");
		comboBox.addItem("Sports Club");
		comboBox.setSelectedItem("Filter by Club");
		comboBox.setBounds(52, 120, 137, 24);
		panel_2.add(comboBox);
		

		

	}
	
	public boolean getStatusValue() {
	
	return status;
	}
}
