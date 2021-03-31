package com.bca.minor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class applicationpanel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					applicationpanel frame = new applicationpanel();
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
	public applicationpanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCustomerpanel = new JButton("Customer Login");
		btnCustomerpanel.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		btnCustomerpanel.setBounds(273, 72, 145, 59);
		btnCustomerpanel.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            	dispose();
                CustomerLogin ah = new CustomerLogin();
                ah.setTitle("Welcome");
                ah.setVisible(true);
            }
        });
		contentPane.add(btnCustomerpanel);
		
		
		JButton btnNewButton = new JButton("Supplier Login");
		btnNewButton.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		btnNewButton.setBounds(273, 159, 146, 59);
		btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            	dispose();
                UserLogin ah = new UserLogin();
                ah.setTitle("Supplier Login Portal");
                ah.setVisible(true);
            }
        });
		contentPane.add(btnNewButton);
		
		JButton btnNewButtontransporter = new JButton("Transporter Login");
		btnNewButtontransporter.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		btnNewButtontransporter.setBounds(263, 260, 166, 59);
		btnNewButtontransporter.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            	dispose();
                Translogin ah = new Translogin();
                ah.setTitle("Transporter Login Portal");
                ah.setVisible(true);
            }
        });
		contentPane.add(btnNewButtontransporter);
		
		
		JButton btnNewButton_1 = new JButton("Register for New Customer Account");
		btnNewButton_1.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		btnNewButton_1.setBounds(191, 360, 312, 59);
		btnNewButton_1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            	dispose();
                CustomerRegistration ah = new CustomerRegistration();
                ah.setTitle("Welcome");
                ah.setVisible(true);
            }
        });
		contentPane.add(btnNewButton_1);
		
		JLabel lblSportKitDelivery = new JLabel(" Supply Chain Management ");
		lblSportKitDelivery.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSportKitDelivery.setBounds(220, 25, 283, 36);
		contentPane.add(lblSportKitDelivery);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\acer\\eclipse-workspace\\SCM_minor\\src\\com\\bca\\minor\\apppanelmain.jpg"));
		label.setBounds(0, 0, 750, 510);
		contentPane.add(label);
	}
}
