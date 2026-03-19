package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class StudentSemesterAverage {

	private JFrame frame;
	private JTextField stuName;
	private JTextField gradeLevel;
	private JTextField semNumber;
	private JTextField grade1;
	private JTextField grade2;
	private JTextField grade3;
	private JTextField grade4;
	private JTextField average;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSemesterAverage window = new StudentSemesterAverage();
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
	public StudentSemesterAverage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 376);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel nameLabel = new JLabel("Student Name:");
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		nameLabel.setBounds(10, 11, 152, 14);
		panel.add(nameLabel);
		
		JLabel gradeLabel = new JLabel("Grade Level:");
		gradeLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		gradeLabel.setBounds(10, 36, 152, 14);
		panel.add(gradeLabel);
		
		JLabel semLabel = new JLabel("Semester Number:");
		semLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		semLabel.setBounds(10, 61, 152, 14);
		panel.add(semLabel);
		
		JLabel g1Label = new JLabel("Grade 1:");
		g1Label.setFont(new Font("Tahoma", Font.BOLD, 14));
		g1Label.setBounds(10, 86, 152, 14);
		panel.add(g1Label);
		
		JLabel g2Label = new JLabel("Grade 2:");
		g2Label.setFont(new Font("Tahoma", Font.BOLD, 14));
		g2Label.setBounds(10, 111, 152, 14);
		panel.add(g2Label);
		
		JLabel g3Label = new JLabel("Grade 3:");
		g3Label.setFont(new Font("Tahoma", Font.BOLD, 14));
		g3Label.setBounds(10, 136, 152, 14);
		panel.add(g3Label);
		
		JLabel g4Label = new JLabel("Grade 4:");
		g4Label.setFont(new Font("Tahoma", Font.BOLD, 14));
		g4Label.setBounds(10, 161, 152, 14);
		panel.add(g4Label);
		
		JLabel avgLabel = new JLabel("Average:");
		avgLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		avgLabel.setBounds(10, 186, 152, 17);
		panel.add(avgLabel);
		
		stuName = new JTextField();
		stuName.setBounds(154, 10, 270, 20);
		panel.add(stuName);
		stuName.setColumns(10);
		
		gradeLevel = new JTextField();
		gradeLevel.setColumns(10);
		gradeLevel.setBounds(154, 35, 270, 20);
		panel.add(gradeLevel);
		
		semNumber = new JTextField();
		semNumber.setColumns(10);
		semNumber.setBounds(154, 60, 270, 20);
		panel.add(semNumber);
		
		grade1 = new JTextField();
		grade1.setColumns(10);
		grade1.setBounds(154, 85, 270, 20);
		panel.add(grade1);
		
		grade2 = new JTextField();
		grade2.setColumns(10);
		grade2.setBounds(154, 110, 270, 20);
		panel.add(grade2);
		
		grade3 = new JTextField();
		grade3.setColumns(10);
		grade3.setBounds(154, 136, 270, 20);
		panel.add(grade3);
		
		grade4 = new JTextField();
		grade4.setColumns(10);
		grade4.setBounds(154, 161, 270, 20);
		panel.add(grade4);
		
		average = new JTextField();
		average.setColumns(10);
		average.setBounds(154, 186, 270, 20);
		panel.add(average);
		
		JTextArea summary = new JTextArea();
		summary.setBounds(10, 214, 414, 64);
		panel.add(summary);
	}
}
