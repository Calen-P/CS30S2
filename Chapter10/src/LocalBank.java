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

	private JFrame frame;
	private JTextField accNum;
	private JTextField moneyAmount;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField begBalance;

	/**
	 * Launch the application.
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
	 * Create the application.
	 */
	public LocalBank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jPanel = new JPanel();
		frame.getContentPane().add(jPanel, BorderLayout.CENTER);
		jPanel.setLayout(null);
		
		JLabel text1 = new JLabel("Select an Action:");
		text1.setFont(new Font("Tahoma", Font.BOLD, 14));
		text1.setBounds(21, 11, 150, 22);
		jPanel.add(text1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(240, 240, 240));
		textArea.setBounds(21, 376, 387, 48);
		jPanel.add(textArea);
		
		JLabel text5 = new JLabel("First Name:");
		text5.setForeground(new Color(0, 0, 0));
		text5.setFont(new Font("Tahoma", Font.BOLD, 14));
		text5.setBounds(21, 219, 387, 22);
		jPanel.add(text5);
		
		JLabel text7 = new JLabel("Beginning Balance:");
		text7.setForeground(Color.BLACK);
		text7.setFont(new Font("Tahoma", Font.BOLD, 14));
		text7.setBounds(21, 321, 387, 22);
		jPanel.add(text7);
		
		JLabel text6 = new JLabel("Last Name:");
		text6.setForeground(Color.BLACK);
		text6.setFont(new Font("Tahoma", Font.BOLD, 14));
		text6.setBounds(21, 269, 387, 22);
		jPanel.add(text6);
		
		JLabel text3 = new JLabel("Account Number:");
		text3.setForeground(Color.BLACK);
		text3.setFont(new Font("Tahoma", Font.BOLD, 14));
		text3.setBounds(21, 111, 150, 22);
		jPanel.add(text3);
		
		JLabel text4 = new JLabel("Amount of Deposit/Withdrawal:");
		text4.setForeground(Color.BLACK);
		text4.setFont(new Font("Tahoma", Font.BOLD, 14));
		text4.setBounds(21, 163, 387, 22);
		jPanel.add(text4);
		
		JLabel text2 = new JLabel("Complete the Information in RED:");
		text2.setFont(new Font("Tahoma", Font.BOLD, 14));
		text2.setBounds(21, 90, 387, 22);
		jPanel.add(text2);
		
		JComboBox select = new JComboBox();
		select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				accNum.setText("");
				moneyAmount.setText("");
				firstName.setText("");
				lastName.setText("");
				begBalance.setText("");
				textArea.setText("");
				
				text1.setForeground(Color.BLACK); 
				text2.setForeground(Color.BLACK); 
				text3.setForeground(Color.BLACK); 
				text3.setForeground(Color.BLACK); 
				text4.setForeground(Color.BLACK); 
				text5.setForeground(Color.BLACK); 
				text6.setForeground(Color.BLACK); 
				text7.setForeground(Color.BLACK); 
				
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
		select.setFont(new Font("Tahoma", Font.BOLD, 12));
		select.setModel(new DefaultComboBoxModel(new String[] {"Select...", "Deposit", "Withdrawal", "Check Balance", "Add an Account", "Delete an Account", "Quit"}));
		select.setBounds(21, 40, 387, 22);
		jPanel.add(select);
		
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
		
		JButton trans = new JButton("Process Transaction");
		trans.addActionListener(new ActionListener()
		{
			Bank bank = new Bank();

			public void actionPerformed(ActionEvent e)
			{
				
				String lName = lastName.getText();
				String accID = accNum.getText();
				String fName = firstName.getText();
				
				if (select.getSelectedItem().equals("Add an Account"))
				{
					if (begBalance.getText().equals("") || firstName.getText().equals("") || lastName.getText().equals(""))
					{
						textArea.setText("Information is Missing");
					}
					
					else if (bank.numCheck(begBalance.getText()) == false)
					{
						textArea.setText("Initial amount can only contain numbers");
					}
					
					else
					{
						double balance = Double.parseDouble(begBalance.getText());
						textArea.setText("Account Created. Account ID is: " + bank.addAccount(fName, lName, balance));
					}
				}
				
				else if (select.getSelectedItem().equals("Delete an Account"))
				{
					textArea.setText(bank.deleteAccount(accID));
				}
				
				else if (select.getSelectedItem().equals("Deposit"))
				{
					if (moneyAmount.getText().equals("") || accNum.getText().equals(""))
					{
						textArea.setText("Information is Missing");
					}
					
					else if (bank.numCheck(begBalance.getText()) == false)
					{
						textArea.setText("Amount can only contain numbers");
					}
					
					else
					{
						double amt = Double.parseDouble(moneyAmount.getText());
						textArea.setText(bank.transaction(1, accID, amt));
					}
				}
				
				else if (select.getSelectedItem().equals("Withdrawal"))
				{
					if (moneyAmount.getText().equals("") || accNum.getText().equals(""))
					{
						textArea.setText("Information is Missing");
					}
					
					else if (bank.numCheck(begBalance.getText()) == false)
					{
						textArea.setText("Amount can only contain numbers");
					}
					
					else
					{
						double amt = Double.parseDouble(moneyAmount.getText());
						textArea.setText(bank.transaction(2, accID, amt));
					}
				}
				
				else if (select.getSelectedItem().equals("Check Balance"))
				{
					textArea.setText(bank.checkBalance(accID));
				}
				
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
