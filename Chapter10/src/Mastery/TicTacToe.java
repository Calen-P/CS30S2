package Mastery;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;

public class TicTacToe {
	
	boolean tracker = true;
	
	boolean winner;

	private JFrame frame;
	
	int counter = 0;

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
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(240, 240, 240));
		textArea.setFont(new Font("Monospaced", Font.BOLD, 14));
		textArea.setBounds(16, 232, 126, 21);
		panel.add(textArea);
		
		JButton replay = new JButton("Play Again?");
		replay.setFont(new Font("Tahoma", Font.BOLD, 13));
		replay.setBounds(152, 234, 126, 21);
		panel.add(replay);
		replay.setVisible(false);
	
		JButton topLeft = new JButton("");
		topLeft.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (TTT.check(0, 0) == true)
				{
					topLeft.setText(TTT.player(tracker));
					tracker = !tracker;
					counter += 1;
					
					if (TTT.play(0, 0, tracker) == true || counter == 9)
					{
						textArea.setText(TTT.winner(tracker, counter));
						TTT.flood();
						replay.setVisible(true);
					}
				}
				
				else
				{
					textArea.setText("Invalid Move");
				}
			}
		});
		topLeft.setBounds(18, 19, 126, 59);
		panel.add(topLeft);
		
		JButton midLeft = new JButton("");
		midLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (TTT.check(1, 0) == true)
				{
					midLeft.setText(TTT.player(tracker));
					tracker = !tracker;
					counter += 1;
					
					if (TTT.play(1, 0, tracker) == true || counter == 9)
					{
						textArea.setText(TTT.winner(tracker, counter));
						TTT.flood();
						replay.setVisible(true);
					}
				}
				
				else
				{
					textArea.setText("Invalid Move");
				}
			}
		});
		midLeft.setBounds(18, 89, 126, 59);
		panel.add(midLeft);
		
		JButton botLeft = new JButton("");
		botLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (TTT.check(2, 0) == true)
				{
					botLeft.setText(TTT.player(tracker));
					tracker = !tracker;
					counter += 1;
					
					if (TTT.play(2, 0, tracker) == true || counter == 9)
					{
						textArea.setText(TTT.winner(tracker, counter));
						TTT.flood();
						replay.setVisible(true);
					}
				}
				
				else
				{
					textArea.setText("Invalid Move");
				}
			}
		});
		botLeft.setBounds(18, 159, 126, 59);
		panel.add(botLeft);
		
		JButton topCenter = new JButton("");
		topCenter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (TTT.check(0, 1) == true)
				{
					topCenter.setText(TTT.player(tracker));
					tracker = !tracker;
					counter += 1;
					
					if (TTT.play(0, 1, tracker) == true || counter == 9)
					{
						textArea.setText(TTT.winner(tracker, counter));
						TTT.flood();
						replay.setVisible(true);
					}
				}
				
				else
				{
					textArea.setText("Invalid Move");
				}
			}
		});
		topCenter.setBounds(152, 19, 126, 59);
		panel.add(topCenter);
		
		JButton midCenter = new JButton("");
		midCenter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (TTT.check(1, 1) == true)
				{
					midCenter.setText(TTT.player(tracker));
					tracker = !tracker;
					counter += 1;
					
					if (TTT.play(1, 1, tracker) == true || counter == 9)
					{
						textArea.setText(TTT.winner(tracker, counter));
						TTT.flood();
						replay.setVisible(true);
					}
				}
				
				else
				{
					textArea.setText("Invalid Move");
				}
			}
		});
		midCenter.setBounds(152, 89, 126, 59);
		panel.add(midCenter);
		
		JButton botCenter = new JButton("");
		botCenter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (TTT.check(2, 1) == true)
				{
					botCenter.setText(TTT.player(tracker));
					tracker = !tracker;
					counter += 1;
					
					if (TTT.play(2, 1, tracker) == true || counter == 9)
					{
						textArea.setText(TTT.winner(tracker, counter));
						TTT.flood();
						replay.setVisible(true);
					}
				}
				
				else
				{
					textArea.setText("Invalid Move");
				}
			}
			
		});
		botCenter.setBounds(152, 159, 126, 59);
		panel.add(botCenter);
		
		JButton topRight = new JButton("");
		topRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (TTT.check(0, 2) == true)
				{
					topRight.setText(TTT.player(tracker));
					tracker = !tracker;
					counter += 1;
					
					if (TTT.play(0, 2, tracker) == true || counter == 9)
					{
						textArea.setText(TTT.winner(tracker, counter));
						TTT.flood();
						replay.setVisible(true);
					}
				}
				
				else
				{
					textArea.setText("Invalid Move");
				}
			}
		});
		topRight.setBounds(288, 19, 126, 59);
		panel.add(topRight);
		
		JButton midRight = new JButton("");
		midRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (TTT.check(1, 2) == true)
				{
					midRight.setText(TTT.player(tracker));
					tracker = !tracker;
					counter += 1;
					
					if (TTT.play(1, 2, tracker) == true || counter == 9)
					{
						textArea.setText(TTT.winner(tracker, counter));
						TTT.flood();
						replay.setVisible(true);
					}
				}
				
				else
				{
					textArea.setText("Invalid Move");
				}
			}
		});
		midRight.setBounds(288, 89, 126, 59);
		panel.add(midRight);
		
		JButton botRight = new JButton("");
		botRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (TTT.check(2, 2) == true)
				{
					botRight.setText(TTT.player(tracker));
					tracker = !tracker;
					counter += 1;
					
					if (TTT.play(2, 2, tracker) == true || counter == 9)
					{
						textArea.setText(TTT.winner(tracker, counter));
						TTT.flood();
						replay.setVisible(true);
					}
				}
				
				else
				{
					textArea.setText("Invalid Move");
				}
			}
		});
		botRight.setBounds(288, 159, 126, 59);
		panel.add(botRight);
	}
}