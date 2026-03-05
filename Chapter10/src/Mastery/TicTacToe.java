package Mastery;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class TicTacToe {
	
	boolean tracker = true;
	
	boolean winner;

	private JFrame frame;
	
	static int[][] score = new int[3][3];

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		TTT TTT = new TTT();
		
		

	}
	
	
	
	/**
	 * Create the application.
	 */
	public TicTacToe() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
	
		JButton topLeft = new JButton("");
		topLeft.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent e)
			{
				if (tracker == true)	
				{
					topLeft.setText("X");
					TTT.add(0, 0, 1);
				}
				
				else if (tracker == false)
				{
					topLeft.setText("O");
				}
				
				
				
				tracker = !tracker;
			}
		});
		topLeft.setBounds(18, 19, 126, 59);
		panel.add(topLeft);
		
		JButton midLeft = new JButton("");
		midLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (tracker == true)	
				{
					midLeft.setText("X");
					System.out.println("Test.");
				}
				
				else
				{
					midLeft.setText("O");
				}
				
				tracker = !tracker;
			}
		});
		midLeft.setBounds(18, 89, 126, 59);
		panel.add(midLeft);
		
		JButton botLeft = new JButton("");
		botLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (tracker == true)	
				{
					botLeft.setText("X");
				}
				
				else
				{
					botLeft.setText("O");
				}
				
				tracker = !tracker;
			}
		});
		botLeft.setBounds(18, 159, 126, 59);
		panel.add(botLeft);
		
		JButton topCenter = new JButton("");
		topCenter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (tracker == true)	
				{
					topCenter.setText("X");
				}
				
				else
				{
					topCenter.setText("O");
				}
				
				tracker = !tracker;
			}
		});
		topCenter.setBounds(152, 19, 126, 59);
		panel.add(topCenter);
		
		JButton midCenter = new JButton("");
		midCenter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (tracker == true)	
				{
					midCenter.setText("X");
				}
				
				else
				{
					midCenter.setText("O");
				}
				
				tracker = !tracker;
			}
		});
		midCenter.setBounds(152, 89, 126, 59);
		panel.add(midCenter);
		
		JButton botCenter = new JButton("");
		botCenter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (tracker == true)	
				{
					botCenter.setText("X");
				}
				
				else
				{
					botCenter.setText("O");
				}
				
				tracker = !tracker;
			}
			
		});
		botCenter.setBounds(152, 159, 126, 59);
		panel.add(botCenter);
		
		JButton topRight = new JButton("");
		topRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (tracker == true)	
				{
					topRight.setText("X");
				}
				
				else
				{
					topRight.setText("O");
				}
				
				tracker = !tracker;
			}
		});
		topRight.setBounds(288, 19, 126, 59);
		panel.add(topRight);
		
		JButton midRight = new JButton("");
		midRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (tracker == true)	
				{
					midRight.setText("X");
				}
				
				else
				{
					midRight.setText("O");
				}
				
				tracker = !tracker;
			}
		});
		midRight.setBounds(288, 89, 126, 59);
		panel.add(midRight);
		
		JButton botRight = new JButton("");
		botRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (tracker == true)	
				{
					botRight.setText("X");
				}
				
				else
				{
					botRight.setText("O");
				}
				
				tracker = !tracker;
			}
		});
		botRight.setBounds(288, 159, 126, 59);
		panel.add(botRight);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(18, 229, 395, 21);
		panel.add(textArea);
	}
}
