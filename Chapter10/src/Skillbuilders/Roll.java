package Skillbuilders;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Roll {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Roll window = new Roll();
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
	public Roll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon d1 = new ImageIcon("../Chapter10/src/dice1.png");
		ImageIcon d2 = new ImageIcon("../Chapter10/src/dice2.png");
		ImageIcon d3 = new ImageIcon("../Chapter10/src/dice3.png");
		ImageIcon d4 = new ImageIcon("../Chapter10/src/dice4.png");
		ImageIcon d5 = new ImageIcon("../Chapter10/src/dice5.png");
		ImageIcon d6 = new ImageIcon("../Chapter10/src/dice6.png");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel pic1 = new JLabel("");
		pic1.setBackground(new Color(240, 240, 240));
		pic1.setBounds(74, 48, 120, 120);
		panel.add(pic1);
		
		JLabel pic2 = new JLabel("");
		pic2.setBounds(242, 48, 120, 120);
		panel.add(pic2);
		
		JButton btnNewButton = new JButton("Roll Dice");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Random random = new Random();
				
				int roll1 = random.nextInt(6) + 1;
				int roll2 = random.nextInt(6) + 1;
				
				if (roll1 == 1)
				{
					pic1.setIcon(d1);
				}
				
				else if (roll1 == 2)
				{
					pic1.setIcon(d2);
				}
				
				else if (roll1 == 3)
				{
					pic1.setIcon(d3);
				}
				
				else if (roll1 == 4)
				{
					pic1.setIcon(d4);
				}
				
				else if (roll1 == 5)
				{
					pic1.setIcon(d5);
				}
				
				else if (roll1 == 6)
				{
					pic1.setIcon(d6);
				}
				
				if (roll2 == 1)
				{
					pic2.setIcon(d1);
				}
				
				else if (roll2 == 2)
				{
					pic2.setIcon(d2);
				}
				
				else if (roll2 == 3)
				{
					pic2.setIcon(d3);
				}
				
				else if (roll2 == 4)
				{
					pic2.setIcon(d4);
				}
				
				else if (roll2 == 5)
				{
					pic2.setIcon(d5);
				}
				
				else if (roll2 == 6)
				{
					pic2.setIcon(d6);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(115, 196, 213, 54);
		panel.add(btnNewButton);
		
		
	}
}
