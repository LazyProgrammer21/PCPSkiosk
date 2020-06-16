package com.assignment.view.student;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import com.assignment.view.Mainpage;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class stdRegistration extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField stdid;
	private JTextField name;
	private JTextField email;
	private JTextField city;
	private JTextField state;
	private JTextField zipcode;
	private JTextField phone;
	private JTextField clas;
	private JPasswordField password;


	public stdRegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setUndecorated(true);
		setBounds(100, 100, 924, 622);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(41, 128, 847, 482);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblId.setBounds(188, 10, 70, 28);
		panel.add(lblId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblName.setBounds(188, 64, 70, 25);
		panel.add(lblName);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblDob.setBounds(188, 134, 70, 25);
		panel.add(lblDob);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblGender.setBounds(188, 159, 70, 25);
		panel.add(lblGender);
		
		JLabel lblAddcity = new JLabel("Add_city");
		lblAddcity.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblAddcity.setBounds(188, 196, 70, 25);
		panel.add(lblAddcity);
		
		JLabel lblAddressState = new JLabel("Address State");
		lblAddressState.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblAddressState.setBounds(188, 233, 121, 25);
		panel.add(lblAddressState);
		
		JLabel lblZipcode = new JLabel("zipcode");
		lblZipcode.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblZipcode.setBounds(188, 282, 83, 25);
		panel.add(lblZipcode);
		
		JLabel lblPhonenNumber = new JLabel("Phonen Number");
		lblPhonenNumber.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblPhonenNumber.setBounds(188, 319, 141, 25);
		panel.add(lblPhonenNumber);
		
		JLabel lblLevelclass = new JLabel("level(CLass)");
		lblLevelclass.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblLevelclass.setBounds(188, 356, 94, 25);
		panel.add(lblLevelclass);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblPassword.setBounds(188, 393, 100, 25);
		panel.add(lblPassword);
		
		JLabel label = new JLabel("Email");
		label.setFont(new Font("FreeSans", Font.BOLD, 16));
		label.setBounds(188, 91, 70, 31);
		panel.add(label);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblSubject.setBounds(188, 430, 100, 25);
		panel.add(lblSubject);
		
		stdid = new JTextField();
		stdid.setBounds(394, 12, 162, 24);
		panel.add(stdid);
		stdid.setColumns(10);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(394, 51, 162, 24);
		panel.add(name);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(394, 87, 162, 24);
		panel.add(email);
		
		city = new JTextField();
		city.setColumns(10);
		city.setBounds(394, 185, 162, 24);
		panel.add(city);
		
		state = new JTextField();
		state.setColumns(10);
		state.setBounds(394, 233, 162, 24);
		panel.add(state);
		
		zipcode = new JTextField();
		zipcode.setColumns(10);
		zipcode.setBounds(394, 270, 162, 24);
		panel.add(zipcode);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(394, 320, 162, 24);
		panel.add(phone);
		
		clas = new JTextField();
		clas.setColumns(10);
		clas.setBounds(394, 356, 162, 24);
		panel.add(clas);
		
		password = new JPasswordField();
		password.setBounds(394, 393, 162, 25);
		panel.add(password);
		
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(391, 159, 70, 23);
		panel.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(466, 159, 90, 23);
		panel.add(female);
		
		JRadioButton other = new JRadioButton("Other");
		other.setBounds(564, 159, 90, 23);
		panel.add(other);
		
		JDateChooser birthdate = new JDateChooser();
		birthdate.setBounds(394, 123, 171, 28);
		panel.add(birthdate);
		
		JComboBox <String>subcombox = new JComboBox<String>();
		subcombox.setBounds(394, 429, 162, 24);
		panel.add(subcombox);
		subcombox.addItem("Bsc. CS & SE");
		subcombox.addItem("BBA");
		subcombox.setSelectedItem("Your Subject");
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//database code..
				Mainpage mp = new Mainpage();
				mp.setVisible(true);
				
				stdRegistration.this.dispose();
				
			}
		});
		btnSubmit.setBounds(668, 298, 117, 25);
		panel.add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mainpage mp = new Mainpage();
				mp.setVisible(true);
				
				stdRegistration.this.dispose();
				
			}
		});
		btnCancel.setBounds(668, 339, 117, 25);
		panel.add(btnCancel);
		
		JLabel unilogo = new JLabel("");
		unilogo.setIcon(new ImageIcon("/home/lazyprogrammer21/git/PCPSkiosk/images/uoblogo.jpg"));
		unilogo.setBounds(704, 19, 184, 97);
		contentPane.add(unilogo);
		
		JLabel pcplogo = new JLabel("");
		pcplogo.setIcon(new ImageIcon("/home/lazyprogrammer21/git/PCPSkiosk/images/pcpslogo.jpg"));
		pcplogo.setBounds(38, 31, 184, 85);
		contentPane.add(pcplogo);
	}
}
