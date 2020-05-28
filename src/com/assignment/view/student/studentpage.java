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
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import java.awt.Font;

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
		setSize(1350, 793);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 64, 1350, 705);
		desktopPane.setBackground(Color.LIGHT_GRAY);
		HomepageAllEvent allevent = new HomepageAllEvent();
		desktopPane.add(allevent).setVisible(true);
		contentPane.add(desktopPane);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1350, 52);
		menuBar.setBorderPainted(false);
		menuBar.setBackground(Color.GRAY);
		contentPane.add(menuBar);
		
		JComboBox<String> Eventcombobx = new JComboBox<String>();
		
		menuBar.add(Eventcombobx);
		
		JLabel space = new JLabel("     ");
		menuBar.add(space);
		
		
		JComboBox<String> Clubcombobx = new JComboBox<String>();
		Clubcombobx.setBackground(Color.LIGHT_GRAY);
		menuBar.add(Clubcombobx);
		Clubcombobx.setEditable(true);
		Clubcombobx.addItem("IT Club");
		Clubcombobx.addItem("Free-Flow Club");
		Clubcombobx.addItem("Socio-Cultural Club");
		Clubcombobx.addItem("Sports Club");
		Clubcombobx.setSelectedItem("Select Club");
		
		JButton btnCollegeDetail = new JButton("College Detail  ");
		btnCollegeDetail.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(btnCollegeDetail);
		
		JButton btnNotices = new JButton("Notices  ");
		btnNotices.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(btnNotices);
		
		JButton btnCourses = new JButton("Courses  ");
		btnCourses.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(btnCourses);
		
		JButton btnPersonalization = new JButton("Personalization  ");
		btnPersonalization.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(btnPersonalization);
		
		JButton btnRoutine = new JButton("Routine  ");
		btnRoutine.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(btnRoutine);
		
		JButton btnNewButton = new JButton("Give Feedback  ");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(btnNewButton);
		
		JButton Exitbtn = new JButton("Logout  ");
		Exitbtn.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(Exitbtn);
		Eventcombobx.addItem("All Event");
		Eventcombobx.addItem("Upcomming Event");
		Eventcombobx.addItem("Previous Event");
		Eventcombobx.addItem("My Events");
		Eventcombobx.addItem("Event History");
		
		
	}
}
