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

public class studentpage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField searchEvent;

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
		desktopPane.setBackground(Color.LIGHT_GRAY);
		desktopPane.setBounds(0, 90, 1350, 679);
		HomepageAllEvent allevent = new HomepageAllEvent();
		desktopPane.add(allevent).setVisible(true);
		contentPane.add(desktopPane);
		
		searchEvent = new JTextField();
		searchEvent.setBounds(450, 42, 308, 36);
		contentPane.add(searchEvent);
		searchEvent.setColumns(10);
		
		JButton btnSearch = new JButton("Search Event");
		btnSearch.setBounds(770, 47, 126, 25);
		contentPane.add(btnSearch);
		btnSearch.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBackground(Color.GRAY);
		menuBar.setBounds(0, 0, 1350, 38);
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
		
		JLabel collegedetail = new JLabel("    College Details            ");
		menuBar.add(collegedetail);
		collegedetail.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JLabel Personalization = new JLabel("Personalization           ");
		menuBar.add(Personalization);
		Personalization.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JLabel Notice = new JLabel("Notice              ");
		menuBar.add(Notice);
		Notice.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JLabel Routine = new JLabel("Routine Details    ");
		menuBar.add(Routine);
		Routine.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JLabel Courses = new JLabel("Courses           ");
		menuBar.add(Courses);
		Courses.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JLabel Feedback = new JLabel("Give Feedback       ");
		menuBar.add(Feedback);
		Feedback.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JButton Exitbtn = new JButton("Logout");
		menuBar.add(Exitbtn);
		Eventcombobx.addItem("All Event");
		Eventcombobx.addItem("Upcomming Event");
		Eventcombobx.addItem("Previous Event");
		Eventcombobx.addItem("My Events");
		Eventcombobx.addItem("Event History");
		
		
	}
}
