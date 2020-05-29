package com.assignment.view.student;

import java.awt.EventQueue;
import java.beans.PropertyVetoException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import java.awt.Font;
import java.awt.Insets;

public class studentpage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentpage frame = new studentpage();
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
	
	public studentpage() throws PropertyVetoException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 464);
		setSize(1350, 754);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 33, 1350, 736);
		desktopPane.setBackground(Color.LIGHT_GRAY);
		HomepageAllEvent allevent = new HomepageAllEvent();
		desktopPane.add(allevent).setVisible(true);
		contentPane.add(desktopPane);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(0, 10, 10, 10));
		menuBar.setBounds(0, 0, 1350, 38);
		menuBar.setBackground(Color.GRAY);
		contentPane.add(menuBar);
		
		JComboBox<String> Eventcombobx = new JComboBox<String>();
		Eventcombobx.addItem("All Event");
		Eventcombobx.addItem("Upcomming Event");
		Eventcombobx.addItem("Previous Event");
		Eventcombobx.addItem("My Events");
		Eventcombobx.addItem("Event History");		
		menuBar.add(Eventcombobx);
		
		JLabel label = new JLabel("     ");
		menuBar.add(label);
		
		JButton btnCollegeDetail = new JButton("College Detail  ");
		menuBar.add(btnCollegeDetail);
		btnCollegeDetail.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel space = new JLabel("     ");
		menuBar.add(space);
		
		JButton btnNotices = new JButton("Notices  ");
		btnNotices.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(btnNotices);
		
		JLabel label_1 = new JLabel("     ");
		menuBar.add(label_1);
		
		JLabel label_2 = new JLabel("     ");
		menuBar.add(label_2);
		
		JButton btnPersonalization = new JButton("Personalization  ");
		btnPersonalization.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(btnPersonalization);
		
		JLabel label_3 = new JLabel("     ");
		menuBar.add(label_3);
		
		JButton btnRoutine = new JButton("Routine  ");
		btnRoutine.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(btnRoutine);
		
		JLabel label_4 = new JLabel("     ");
		menuBar.add(label_4);
		
		JButton btnNewButton = new JButton("Give Feedback  ");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(btnNewButton);
		
		JLabel label_5 = new JLabel("     ");
		menuBar.add(label_5);
		
		JLabel label_12 = new JLabel("     ");
		menuBar.add(label_12);
		
		JLabel label_13 = new JLabel("     ");
		menuBar.add(label_13);
		
		JLabel label_14 = new JLabel("     ");
		menuBar.add(label_14);
		
		JLabel label_15 = new JLabel("     ");
		menuBar.add(label_15);
		
		JLabel label_16 = new JLabel("     ");
		menuBar.add(label_16);
		
		JLabel label_17 = new JLabel("     ");
		menuBar.add(label_17);
		
		JLabel label_7 = new JLabel("     ");
		menuBar.add(label_7);
		
		JLabel label_8 = new JLabel("     ");
		menuBar.add(label_8);
		
		JLabel label_9 = new JLabel("     ");
		menuBar.add(label_9);
		
		JLabel label_10 = new JLabel("     ");
		menuBar.add(label_10);
		
		JLabel label_11 = new JLabel("     ");
		menuBar.add(label_11);
		
		JButton Exitbtn = new JButton("Logout  ");
		Exitbtn.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(Exitbtn);
		
		JLabel label_6 = new JLabel("     ");
		menuBar.add(label_6);
		
		
		
	}
}
