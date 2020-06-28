package com.assignment.view.student;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

import com.assignment.model.studentinfo;
import com.assignment.service.passwordValidation;
import com.assignment.service.studentService;
import com.assignment.service.studentserviceImpl;
import com.assignment.view.Mainpage;

import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigInteger;

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
	private JPasswordField password;
	private String stdName;
	
	
	String sid;
	String sname;
	String semail;
	Date sdob;
	String sphone;
	String spassword;


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
		
		JLabel lblId = new JLabel("*ID");
		lblId.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblId.setBounds(188, 10, 70, 28);
		panel.add(lblId);
		
		JLabel lblName = new JLabel("*Name");
		lblName.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblName.setBounds(188, 64, 70, 25);
		panel.add(lblName);
		
		JLabel lblDob = new JLabel("*DOB");
		lblDob.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblDob.setBounds(188, 134, 70, 25);
		panel.add(lblDob);
		
		JLabel lblGender = new JLabel("*Gender");
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
		
		JLabel lblPhonenNumber = new JLabel("*Phonen Number");
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
		
		JLabel lblemail = new JLabel("*Email");
		lblemail.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblemail.setBounds(188, 91, 70, 31);
		panel.add(lblemail);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblSubject.setBounds(188, 430, 100, 25);
		panel.add(lblSubject);
		
		stdid = new JTextField();
		stdid.setBounds(344, 10, 189, 24);
		panel.add(stdid);
		stdid.setColumns(10);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(344, 49, 189, 24);
		panel.add(name);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(344, 85, 189, 24);
		panel.add(email);
		
		city = new JTextField();
		city.setColumns(10);
		city.setBounds(344, 183, 189, 24);
		panel.add(city);
		
		state = new JTextField();
		state.setColumns(10);
		state.setBounds(344, 231, 189, 24);
		panel.add(state);
		
		zipcode = new JTextField();
		zipcode.setColumns(10);
		zipcode.setBounds(344, 268, 189, 24);
		panel.add(zipcode);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(392, 318, 141, 24);
		panel.add(phone);
		
		password = new JPasswordField();
		password.setBounds(344, 391, 189, 25);
		panel.add(password);
		
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(341, 157, 70, 23);
		panel.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(416, 157, 90, 23);
		panel.add(female);
		
		JRadioButton other = new JRadioButton("Other");
		other.setBounds(514, 157, 90, 23);
		panel.add(other);
		
		JDateChooser birthdate = new JDateChooser();
		birthdate.setBounds(344, 121, 189, 28);
		panel.add(birthdate);
		
		JComboBox <String>subcombox = new JComboBox<String>();
		subcombox.setBounds(344, 427, 189, 24);
		panel.add(subcombox);
		subcombox.addItem("Bsc. CS & SE");
		subcombox.addItem("BBA");
		subcombox.setSelectedItem("Your Subject");
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//database code..
				
				 sid = stdid.getText();
				 sname = name.getText();
				 semail = email.getText();
				 sdob = new Date(birthdate.getDate().getTime());
				 sphone = phone.getText();
				 spassword = password.getText();
				
				
				studentinfo s_info = new studentinfo();
				
				if(sid.isEmpty()||sname.isEmpty()||semail.isEmpty()||sphone.isEmpty()||spassword.isEmpty()) {
					
					JOptionPane.showMessageDialog(null, "Field cannot be Empty");
				}
				else {
					
					
				if(numeric()) {
					BigInteger bg = new BigInteger(sid);
					s_info.setClzId(bg);
				}
			
				if(phonenumeric()) {
					s_info.setPhone(phone.getText());
				}
			
				if(!check_name().isEmpty()) {
					s_info.setName(name.getText());
				}
			
				if(isValidemail(semail)) {
					s_info.setEmail(email.getText());
				}
				
				if(sdob != null) {
					s_info.setDob(new Date(birthdate.getDate().getTime()));
				}	
				
			
				if(male.isSelected())
				{
					s_info.setGender("Male");
				}
				
				else if(female.isSelected()){
					
					s_info.setGender("Female");
				}
				
				else if(other.isSelected())
				{
					s_info.setGender("Other");
				}
				
				s_info.setAdd_city(city.getText());
				s_info.setAdd_state(state.getText());
				s_info.setZipCode(zipcode.getText());
				
				passwordValidation checkpassword = new passwordValidation();
				
				if(checkpassword.validate(spassword)) {
					s_info.setPassWord(password.getText());
				}
				}
			
			
				
				
				studentService stdservice = new studentserviceImpl();
				
				if(stdservice.newRegister(s_info))
				{
					JOptionPane.showMessageDialog(null, "Added Success");
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Added Failed");
				}
				
				//input field make empty once the button is pressed..
				
				stdid.setText("");
				name.setText("");
				email.setText("");
				birthdate.setCalendar(null);
				city.setText("");
				state.setText("");
				zipcode.setText("");
				phone.setText("");
				password.setText("");
				
				
				   
				
				
				
				Mainpage mp = new Mainpage();
				mp.setVisible(true);
				
				stdRegistration.this.dispose();
				
			}
		});
		btnSubmit.setBounds(628, 281, 117, 25);
		panel.add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mainpage mp = new Mainpage();
				mp.setVisible(true);
				
				stdRegistration.this.dispose();
				
			}
		});
		btnCancel.setBounds(628, 318, 117, 25);
		panel.add(btnCancel);
		
		JComboBox<String> sem = new JComboBox<String>();
		
		sem.setBounds(344, 353, 189, 24);
		sem.addItem("L4S1");
		sem.addItem("L4S2");
		sem.addItem("L5S1");
		sem.addItem("L5S2");
		sem.addItem("L6S1");
		sem.addItem("L6S2");
		sem.setSelectedItem("Semester");
		panel.add(sem);
		
		JLabel lblId_1 = new JLabel("+977");
		lblId_1.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblId_1.setBounds(342, 317, 45, 28);
		panel.add(lblId_1);
		
		JLabel lblInfo = new JLabel("*Info*");
		lblInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				passwordinfo pi = new passwordinfo();
				pi.setVisible(true);
				pi.setLocationRelativeTo(null);
				
			}
		});
		lblInfo.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblInfo.setBounds(535, 391, 45, 25);
		panel.add(lblInfo);
		
		JLabel lblClzIdConsists = new JLabel("Clz ID consists of 10 digit Number");
		lblClzIdConsists.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblClzIdConsists.setBounds(535, 14, 264, 25);
		panel.add(lblClzIdConsists);
		
		JLabel unilogo = new JLabel("");
		unilogo.setIcon(new ImageIcon("/home/lazyprogrammer21/git/PCPSkiosk/images/uoblogo.jpg"));
		unilogo.setBounds(704, 19, 184, 97);
		contentPane.add(unilogo);
		
		JLabel pcplogo = new JLabel("");
		pcplogo.setIcon(new ImageIcon("/home/lazyprogrammer21/git/PCPSkiosk/images/pcpslogo.jpg"));
		pcplogo.setBounds(38, 31, 184, 85);
		contentPane.add(pcplogo);
	}
	
	
	private boolean numeric() {
		boolean x = false;
		try {
			if(sid!=null) {
				Double.parseDouble(sid);
				x=true;
			}
			
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Clz ID cannot be String");
			System.out.println("Clz ID cannot be String");
			x=false;
		}
	
		
		return x;
	}
	private boolean phonenumeric() {
		boolean x = false;
		try {
			if(sphone!=null) {
				Double.parseDouble(sphone);
				x=true;
			}
			
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "PhoneNumber cannot be String");
			System.out.println("Phone Number cannot be String");
			x=false;
		}
	
		
		return x;
	}
	
	private String check_name() {
		if(!sname.isEmpty()) {
			stdName = sname;
		}
		else {
			JOptionPane.showMessageDialog(null, "Field Cannot be Empty");
		}
		
		return stdName;
	}
	
	private static boolean isValidemail(String stdemail) {
		 String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		 return stdemail.matches(regex);
	}
}
