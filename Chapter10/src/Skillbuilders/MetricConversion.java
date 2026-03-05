package Skillbuilders;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MetricConversion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel text = new JLabel("Select a Conversion Type:");
		text.setFont(new Font("Tahoma", Font.BOLD, 15));
		text.setBounds(34, 29, 213, 40);
		frame.getContentPane().add(text);
		
		JTextArea conversion = new JTextArea();
		conversion.setFont(new Font("Monospaced", Font.BOLD, 15));
		conversion.setBackground(new Color(240, 240, 240));
		conversion.setBounds(34, 129, 368, 34);
		frame.getContentPane().add(conversion);
		
		JComboBox contype = new JComboBox();
		contype.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(contype.getSelectedItem().equals("Inches to Centimeters"))
				{
					conversion.setText("1 Inch = 2.54 Centimeters");
				}
				
				else if(contype.getSelectedItem().equals("Feet to Meters"))
				{
					conversion.setText("1 Foot = 0.3048 Meters");
				}
				
				else if(contype.getSelectedItem().equals("Gallons to Liters"))
				{
					conversion.setText("1 Gallon = 4.5461 Liters");
				}
				
				else if(contype.getSelectedItem().equals("Pounds to Kilograms"))
				{
					conversion.setText("1 Pound = 0.4536 Kilograms");
				}
				else
				{
					conversion.setText("");
				}
			}
		});
		
		contype.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contype.setModel(new DefaultComboBoxModel(new String[] {"Select...", "Inches to Centimeters", "Feet to Meters", "Gallons to Liters", "Pounds to Kilograms"}));
		contype.setBounds(34, 69, 193, 29);
		frame.getContentPane().add(contype);
	}
}
