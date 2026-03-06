/*

Program: LocalBank.java         Last Date of this Revision: March 06, 2026

Purpose: This class creates the graphical user interface (GUI) for a simple
banking system. It allows the user to:

- Add an account
- Deposit money
- Withdraw money
- Check account balance
- Delete an account

The GUI collects user input and sends it to the Bank class
where the actual banking logic is performed.

Author: Calen Plana
School: CHHS
Course: Computer Programming CS30
 

*/

package Mastery;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LocalBank {

	/** Main application window */
	private JFrame frame;

	/** Text field for account number input */
	private JTextField accNum;

	/** Text field for deposit/withdrawal amount */
	private JTextField moneyAmount;

	/** Text field for first name */
	private JTextField firstName;

	/** Text field for last name */
	private JTextField lastName;

	/** Text field for beginning account balance */
	private JTextField begBalance;

	/**
	 * Launch the application.
	 * 
	 * The EventQueue ensures the GUI runs on the correct thread
	 * for Swing applications.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalBank window = new LocalBank();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Constructor for LocalBank.
	 * Calls the initialize method to build the GUI.
	 */
	public LocalBank() {
		initialize();
	}

	/**
	 * Initializes and constructs all GUI components
	 * including labels, text fields, buttons, and menus.
	 */
	private void initialize()
	{
		/* ===============================
		   Create main window
		   =============================== */
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel jPanel = new JPanel();
		frame.getContentPane().add(jPanel, BorderLayout.CENTER);
		jPanel.setLayout(null);

		/* ===============================
		   Labels for instructions
		   =============================== */

		JLabel text1 = new JLabel("Select an Action:");
		text1.setFont(new Font("Tahoma", Font.BOLD, 14));
		text1.setBounds(21, 11, 150, 22);
		jPanel.add(text1);

		JLabel text2 = new JLabel("Complete the Information in RED:");
		text2.setFont(new Font("Tahoma", Font.BOLD, 14));
		text2.setBounds(21, 90, 387, 22);
		jPanel.add(text2);

		JLabel text3 = new JLabel("Account Number:");
		text3.setForeground(Color.BLACK);
		text3.setFont(new Font("Tahoma", Font.BOLD, 14));
		text3.setBounds(21, 111, 150, 22);
		jPanel.add(text3);

		JLabel text4 = new JLabel("Amount of /Withdrawal:");
		text4.setForeground(Color.BLACK);
		text4.setFont(new Font("Tahoma", Font.BOLD, 14));
		text4.setBounds(21, 163, 387, 22);
		jPanel.add(text4);

		JLabel text5 = new JLabel("First Name:");
		text5.setForeground(new Color(0, 0, 0));
		text5.setFont(new Font("Tahoma", Font.BOLD, 14));
		text5.setBounds(21, 219, 387, 22);
		jPanel.add(text5);

		JLabel text6 = new JLabel("Last Name:");
		text6.setForeground(Color.BLACK);
		text6.setFont(new Font("Tahoma", Font.BOLD, 14));
		text6.setBounds(21, 269, 387, 22);
		jPanel.add(text6);

		JLabel text7 = new JLabel("Beginning Balance:");
		text7.setForeground(Color.BLACK);
		text7.setFont(new Font("Tahoma", Font.BOLD, 14));
		text7.setBounds(21, 321, 387, 22);
		jPanel.add(text7);

		/* ===============================
		   Output display area
		   =============================== */

		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(240, 240, 240));
		textArea.setBounds(21, 376, 387, 48);
		jPanel.add(textArea);

		/* ===============================
		   Action selection dropdown
		   =============================== */

		JComboBox select = new JComboBox();
		select.setFont(new Font("Tahoma", Font.BOLD, 12));
		select.setModel(new DefaultComboBoxModel(new String[] {
				"Select...",
				"Deposit",
				"Withdrawal",
				"Check Balance",
				"Add an Account",
				"Delete an Account",
				"Quit"}));

		select.setBounds(21, 40, 387, 22);
		jPanel.add(select);

		/**
		 * When the selected action changes:
		 * 
		 * - Clear all text fields
		 * - Reset label colours
		 * - Highlight required fields in red
		 */
		select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				accNum.setText("");
				moneyAmount.setText("");
				firstName.setText("");
				lastName.setText("");
				begBalance.setText("");
				textArea.setText("");

				// Reset all labels to black
				text1.setForeground(Color.BLACK); 
				text2.setForeground(Color.BLACK); 
				text3.setForeground(Color.BLACK); 
				text4.setForeground(Color.BLACK); 
				text5.setForeground(Color.BLACK); 
				text6.setForeground(Color.BLACK); 
				text7.setForeground(Color.BLACK); 

				// Highlight required fields depending on action
				if (select.getSelectedItem().equals("Add an Account"))
				{
					text5.setForeground(Color.RED); 
					text6.setForeground(Color.RED); 
					text7.setForeground(Color.RED); 
				}

				else if (select.getSelectedItem().equals("Deposit") || select.getSelectedItem().equals("Withdrawal"))
				{
					text3.setForeground(Color.RED); 
					text4.setForeground(Color.RED); 
				}

				else if (select.getSelectedItem().equals("Check Balance") || select.getSelectedItem().equals("Delete an Account"))
				{
					text3.setForeground(Color.RED); 
				}
			}
		});

		/* ===============================
		   Input fields
		   =============================== */

		accNum = new JTextField();
		accNum.setBounds(21, 139, 387, 20);
		jPanel.add(accNum);
		accNum.setColumns(10);

		moneyAmount = new JTextField();
		moneyAmount.setColumns(10);
		moneyAmount.setBounds(21, 191, 387, 20);
		jPanel.add(moneyAmount);

		firstName = new JTextField();
		firstName.setColumns(10);
		firstName.setBounds(21, 245, 387, 20);
		jPanel.add(firstName);

		lastName = new JTextField();
		lastName.setColumns(10);
		lastName.setBounds(21, 296, 387, 20);
		jPanel.add(lastName);

		begBalance = new JTextField();
		begBalance.setColumns(10);
		begBalance.setBounds(21, 345, 387, 20);
		jPanel.add(begBalance);

		/* ===============================
		   Process Transaction Button
		   =============================== */

		JButton trans = new JButton("Process Transaction");

		trans.addActionListener(new ActionListener()
		{
			// Create Bank object to handle account operations
			Bank bank = new Bank();

			public void actionPerformed(ActionEvent e)
			{
				boolean check;

				// Retrieve user input
				String lName = lastName.getText();
				String accID = accNum.getText();
				String fName = firstName.getText();
				String sBalance = begBalance.getText();
				String sAmount = moneyAmount.getText();

				/* ===============================
				   Add Account
				   =============================== */

				if (select.getSelectedItem().equals("Add an Account"))
				{
					check = sBalance.matches(".*[a-zA-Z]+.*");

					if (begBalance.getText().equals("") || firstName.getText().equals("") || lastName.getText().equals(""))
					{
						textArea.setText("Information is Missing");
					}

					else if (check == true)
					{
						textArea.setText("Initial amount can only contain numbers");
					}

					else
					{
						double balance = Double.parseDouble(begBalance.getText());
						textArea.setText("Account Created. Account ID is: " + bank.addAccount(fName, lName, balance));
					}
				}

				/* ===============================
				   Delete Account
				   =============================== */

				else if (select.getSelectedItem().equals("Delete an Account"))
				{
					textArea.setText(bank.deleteAccount(accID));
				}

				/* ===============================
				   Deposit
				   =============================== */

				else if (select.getSelectedItem().equals("Deposit"))
				{
					check = sAmount.matches(".*[a-zA-Z]+.*");

					if (moneyAmount.getText().equals("") || accNum.getText().equals(""))
					{
						textArea.setText("Information is Missing");
					}

					else if (check == true)
					{
						textArea.setText("Amount can only contain numbers");
					}

					else
					{
						double amt = Double.parseDouble(moneyAmount.getText());
						textArea.setText(bank.transaction(1, accID, amt));
					}
				}

				/* ===============================
				   Withdrawal
				   =============================== */

				else if (select.getSelectedItem().equals("Withdrawal"))
				{
					check = sAmount.matches(".*[a-zA-Z]+.*");

					if (moneyAmount.getText().equals("") || accNum.getText().equals(""))
					{
						textArea.setText("Information is Missing");
					}

					else if (check == true)
					{
						textArea.setText("Amount can only contain numbers");
					}

					else
					{
						double amt = Double.parseDouble(moneyAmount.getText());
						textArea.setText(bank.transaction(2, accID, amt));
					}
				}

				/* ===============================
				   Check Balance
				   =============================== */

				else if (select.getSelectedItem().equals("Check Balance"))
				{
					textArea.setText(bank.checkBalance(accID));
				}

				/* ===============================
				   Quit program
				   =============================== */

				else if (select.getSelectedItem().equals("Quit"))
				{
					System.exit(0);
				}
			}
		});

		trans.setFont(new Font("Tahoma", Font.BOLD, 14));
		trans.setBounds(21, 435, 184, 36);
		jPanel.add(trans);
	}
}