package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class StudentSemesterAverage {

	private JFrame frame;
	private JTextField studentName;
	private JTextField gradeLevel;
	private JTextField semNumber;
	private JTextField grade1;
	private JTextField grade2;
	private JTextField grade3;
	private JTextField grade4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
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
		frame.setBounds(100, 100, 632, 376);
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
		avgLabel.setBounds(10, 186, 62, 17);
		panel.add(avgLabel);
		
		studentName = new JTextField();
		studentName.setBounds(154, 10, 452, 20);
		panel.add(studentName);
		studentName.setColumns(10);
		
		gradeLevel = new JTextField();
		gradeLevel.setColumns(10);
		gradeLevel.setBounds(154, 35, 452, 20);
		panel.add(gradeLevel);
		
		semNumber = new JTextField();
		semNumber.setColumns(10);
		semNumber.setBounds(154, 60, 452, 20);
		panel.add(semNumber);
		
		grade1 = new JTextField();
		grade1.setColumns(10);
		grade1.setBounds(154, 85, 452, 20);
		panel.add(grade1);
		
		grade2 = new JTextField();
		grade2.setColumns(10);
		grade2.setBounds(154, 110, 452, 20);
		panel.add(grade2);
		
		grade3 = new JTextField();
		grade3.setColumns(10);
		grade3.setBounds(154, 136, 452, 20);
		panel.add(grade3);
		
		grade4 = new JTextField();
		grade4.setColumns(10);
		grade4.setBounds(154, 161, 452, 20);
		panel.add(grade4);
		
		JTextArea summary = new JTextArea();
		summary.setBackground(new Color(240, 240, 240));
		summary.setBounds(10, 214, 596, 64);
		panel.add(summary);
		
		JTextArea average = new JTextArea();
		average.setBackground(new Color(240, 240, 240));
		average.setBounds(77, 186, 347, 17);
		panel.add(average);
		
		File stuAvgFile = new File("../Chapter11/SemAverage");
		
		JButton save = new JButton("Save to File");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String stuName = studentName.getText();
				String grdLevel = gradeLevel.getText();
				String semNum = semNumber.getText();
				
				int g1 = Integer.parseInt(grade1.getText());
				int g2 = Integer.parseInt(grade2.getText());
				int g3 = Integer.parseInt(grade3.getText());
				int g4 = Integer.parseInt(grade4.getText());
				
				int avg = (g1 + g2 + g3 + g4) / 4;
				
				average.setText(Integer.toString(avg));
				
				try
				{
					FileOutputStream out = new FileOutputStream(stuAvgFile);
					ObjectOutputStream writeStu = new ObjectOutputStream(out);
					
					writeStu.writeObject("Name: " + stuName + ", Grade Level: " + grdLevel + ", Semester: " + semNum + ", Grades: " + g1 + ", " + g2 + ", " + g3 + ", " + g4 + ". Average: " + avg + "%");
					
					writeStu.close();
				}
				
				catch (FileNotFoundException e1) 
				{
					// Runs if the file cannot be found or created
					System.out.println("File Does not Exist.");
					System.err.println("IOException: " + e1.getMessage());
				}
				
				catch (IOException e1) 
				{
					// Runs if there is a problem writing/reading the file
					System.out.println("Cannot Write in File");
					System.err.println("IOException: " + e1.getMessage());
				}
			}
		});
		save.setFont(new Font("Tahoma", Font.BOLD, 12));
		save.setBounds(148, 289, 127, 37);
		panel.add(save);
		
		JButton preview = new JButton("View File Contents");
		preview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String text;
				FileReader in;
				BufferedReader readFile;
				
				try
				{
					in = new FileReader(stuAvgFile);
					readFile = new BufferedReader(in);
					
					while((text = readFile.readLine()) != null)
					{
						summary.setText(text);
					}
				}
				
				catch(FileNotFoundException e1)
				{
					// Runs if the file cannot be found
					System.out.println("File does not exist.");
					System.err.println("fileNotFoundException: " + e1.getMessage());
				}
				
				catch (IOException e1) 
				{
					// Runs if there is a problem reading the file
					System.out.println("Problem reading file.");
					System.err.println("IOException: " + e1.getMessage());
				}
				
			}
		});
		preview.setFont(new Font("Tahoma", Font.BOLD, 12));
		preview.setBounds(284, 289, 176, 37);
		panel.add(preview);
	}
}
