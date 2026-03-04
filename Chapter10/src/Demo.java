import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

public class Demo {

	private JFrame frame;
	private JTextField fName;
	private JTextField lName;
	private JComboBox schools;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo window = new Demo();
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
	public Demo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		ImageIcon w = new ImageIcon("../Chapter10/src/WesternLogo.png");
		ImageIcon ch = new ImageIcon("../Chapter10/src/CHLogo.png");
		ImageIcon c = new ImageIcon("../Chapter10/src/ChurchillLogo.jpg");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel school = new JPanel();
		school.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(school);
		school.setLayout(null);
		
		fName = new JTextField();
		fName.setForeground(Color.GRAY);
		fName.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e)
			{
				if(fName.getText().equals("First Name"))
				{
					fName.setText("");
				}
			}
		});
		fName.setText("First Name");
		fName.setBounds(30, 57, 107, 22);
		school.add(fName);
		fName.setColumns(10);
		
		lName = new JTextField();
		lName.setForeground(Color.GRAY);
		lName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e)
			{
				if(lName.getText().equals("Last Name"))
				{
					lName.setText("");
				}
			}
		});
		lName.setText("Last Name");
		lName.setColumns(10);
		lName.setBounds(149, 57, 107, 22);
		school.add(lName);
		
		JComboBox grades = new JComboBox();
		grades.setModel(new DefaultComboBoxModel(new String[] {"Select Grade", "Grade 10", "Grade 11", "Grade 12"}));
		grades.setBounds(30, 111, 107, 22);
		school.add(grades);
		
		schools = new JComboBox();
		schools.setModel(new DefaultComboBoxModel(new String[] {"Select School", "Crescent Heights", "Western", "Churchill"}));
		schools.setBounds(147, 111, 109, 22);
		school.add(schools);
		
		JTextArea pic = new JTextArea();
		pic.setWrapStyleWord(true);
		pic.setLineWrap(true);
		pic.setBounds(30, 158, 226, 78);
		school.add(pic);
		
		JLabel photo = new JLabel("");
		photo.setBackground(Color.WHITE);
		photo.setForeground(Color.WHITE);
		photo.setBounds(273, 158, 139, 78);
		school.add(photo);
		
		JButton submit = new JButton("Submit");
		submit.setFont(new Font("Tahoma", Font.BOLD, 11));
		submit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String fn = fName.getText();
				String ln = lName.getText();
				String grade = "";
				String school = "";
				
				if(grades.getSelectedItem().equals("Grade 12"))
				{
					grade = "12";
				}
				
				else if(grades.getSelectedItem().equals("Grade 11"))
				{
					grade = "11";
				}
				
				else if(grades.getSelectedItem().equals("Grade 10"))
				{
					grade = "10";
				}
				
				if(schools.getSelectedItem().equals("Crescent Heights"))
				{
					school = "Crescent Heights";
					photo.setIcon(ch);
				}
				
				else if(schools.getSelectedItem().equals("Western"))
				{
					school = "Western";
					photo.setIcon(w);
				}
				
				else if(schools.getSelectedItem().equals("Churchill"))
				{
					school = "Churchill";
					photo.setIcon(c);
				}
				
				pic.setText(fn + " " + ln + " is in grade " + grade + " and goes to " + school);
			}
		});
		submit.setBounds(292, 86, 89, 20);
		school.add(submit);
		
	}
	public JComboBox getSchools() {
		return schools;
	}
}
