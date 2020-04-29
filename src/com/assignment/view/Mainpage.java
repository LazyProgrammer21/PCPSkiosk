package com.assignment.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Mainpage extends JFrame {

	private JPanel contentPane;
	private JTextField studentid;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainpage frame = new Mainpage();
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
	public Mainpage() {
		setAlwaysOnTop(true);
		setBackground(Color.DARK_GRAY);
		setTitle("PCPSKIOSK");
		setResizable(false);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("/home/lazyprogrammer/eclipse-workspace/PCPSKIOSK/images/appicon.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 508);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel mainpanel = new JPanel();
		mainpanel.setBorder(new LineBorder(Color.BLACK));
		mainpanel.setBackground(new Color(255, 255, 240));
		contentPane.add(mainpanel, BorderLayout.CENTER);
		mainpanel.setLayout(null);
		
		JLabel Pcpslogo = new JLabel("");
		Pcpslogo.setIcon(new ImageIcon("/home/lazyprogrammer/eclipse-workspace/PCPSKIOSK/images/pcpslogo.jpg"));
		Pcpslogo.setBounds(47, 34, 177, 97);
		mainpanel.add(Pcpslogo);
		
		JLabel Uoblogo = new JLabel("");
		Uoblogo.setIcon(new ImageIcon("/home/lazyprogrammer/eclipse-workspace/PCPSKIOSK/images/uoblogo.jpg"));
		Uoblogo.setBounds(541, 34, 177, 97);
		mainpanel.add(Uoblogo);
		
		JLabel lblStudentId = new JLabel("Student ID: ");
		lblStudentId.setFont(new Font("Dialog", Font.BOLD, 15));
		lblStudentId.setBounds(222, 164, 141, 58);
		mainpanel.add(lblStudentId);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 15));
		lblPassword.setBounds(222, 217, 141, 58);
		mainpanel.add(lblPassword);
		
		studentid = new JTextField();
		studentid.setBounds(362, 175, 182, 38);
		mainpanel.add(studentid);
		studentid.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(362, 227, 182, 39);
		mainpanel.add(password);
		
		JLabel infolink = new JLabel("Are you a New Student? Click here for Registration.");
		infolink.setBounds(203, 324, 383, 38);
		mainpanel.add(infolink);
		
		JButton ForgetPasswordbtn = new JButton("Forget Password");
		ForgetPasswordbtn.setBounds(362, 287, 168, 25);
		mainpanel.add(ForgetPasswordbtn);
		
		JButton Loginbtn = new JButton("Login");
		Loginbtn.setBounds(262, 287, 88, 25);
		mainpanel.add(Loginbtn);
		
		JButton Adminbtn = new JButton("Admin");
		Adminbtn.setFont(new Font("Dialog", Font.BOLD, 15));
		Adminbtn.setBounds(262, 374, 99, 46);
		mainpanel.add(Adminbtn);
		
		JButton Guestbtn = new JButton("Guest");
		Guestbtn.setFont(new Font("Dialog", Font.BOLD, 15));
		Guestbtn.setBounds(426, 374, 99, 46);
		mainpanel.add(Guestbtn);
	}
}
