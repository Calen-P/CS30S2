package Skillbuilders;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JLabel;

public class SemesterAvg {

	private JFrame frame;
	private JTextField grade2;
	private JTextField grade1;
	private JTextField grade3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvg window = new SemesterAvg();
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
	public SemesterAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		grade2 = new JTextField();
		grade2.setBounds(225, 93, 174, 40);
		frame.getContentPane().add(grade2);
		grade2.setColumns(10);
		
		grade1 = new JTextField();
		grade1.setColumns(10);
		grade1.setBounds(225, 37, 174, 40);
		frame.getContentPane().add(grade1);
		
		grade3 = new JTextField();
		grade3.setColumns(10);
		grade3.setBounds(225, 149, 174, 40);
		frame.getContentPane().add(grade3);
		
		JTextArea total = new JTextArea();
		total.setFont(new Font("Monospaced", Font.BOLD, 13));
		total.setBackground(new Color(240, 240, 240));
		total.setBounds(225, 210, 174, 29);
		frame.getContentPane().add(total);
		
		DecimalFormat df = new DecimalFormat("#.0");
		
		JButton average = new JButton("Average");
		average.setFont(new Font("Tahoma", Font.BOLD, 16));
		average.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String word1 = grade1.getText();
				String word2 = grade2.getText();
				String word3 = grade3.getText();
				
				float grd1 = Float.parseFloat(word1);
				float grd2 = Float.parseFloat(word2);
				float grd3 = Float.parseFloat(word3);
				
				float quotient = (grd1 + grd2 + grd3) / 3;
				String newquotient = df.format(quotient);
				
				total.setText(newquotient);
			}
		});
		average.setBounds(39, 200, 143, 40);
		frame.getContentPane().add(average);
		
		JLabel text2 = new JLabel("Enter the Second Grade:");
		text2.setFont(new Font("Tahoma", Font.BOLD, 13));
		text2.setForeground(new Color(0, 0, 0));
		text2.setBounds(29, 92, 167, 40);
		frame.getContentPane().add(text2);
		
		JLabel text1 = new JLabel("Enter the First Grade:");
		text1.setForeground(Color.BLACK);
		text1.setFont(new Font("Tahoma", Font.BOLD, 13));
		text1.setBounds(29, 36, 143, 40);
		frame.getContentPane().add(text1);
		
		JLabel text3 = new JLabel("Enter the Third Grade:");
		text3.setForeground(Color.BLACK);
		text3.setFont(new Font("Tahoma", Font.BOLD, 13));
		text3.setBounds(29, 149, 167, 40);
		frame.getContentPane().add(text3);
		
		
	}
}
