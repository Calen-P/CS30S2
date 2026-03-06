/*

Program: TicTacToe.java         Last Date of this Revision: March 06, 2026

Purpose: This class creates the graphical user interface for a Tic Tac Toe game
using Java Swing. The board consists of 9 buttons arranged in a 3x3 grid.
The GUI communicates with the TTT class, which contains the game logic
such as validating moves, tracking the board, and determining the winner.

Author: Calen Plana
School: CHHS
Course: Computer Programming CS30
 

*/

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

	/**
	 * Tracks which player's turn it currently is.
	 * 
	 * true  = Player X
	 * false = Player O
	 */
	boolean tracker = true;

	/**
	 * Stores whether the game has been won.
	 * (Currently unused in this class but likely used by the game logic.)
	 */
	boolean winner;

	/** Main application window */
	private JFrame frame;

	/**
	 * Counts the number of moves made.
	 * Used to determine if the game results in a draw (9 moves).
	 */
	int counter = 0;

	/**
	 * Launches the application.
	 * 
	 * The GUI is started using the EventQueue to ensure thread safety
	 * when working with Swing components.
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

		// Create instance of the game logic class
		TTT TTT = new TTT();
	}

	/**
	 * Constructor for the TicTacToe class.
	 * 
	 * Calls initialize() to build the GUI.
	 */
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initializes and builds the graphical user interface.
	 * 
	 * Creates the window, panel, message area, and all nine buttons
	 * that represent the Tic Tac Toe board.
	 */
	private void initialize()
	{
		// Create main window
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create panel to hold all components
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		// Text area used to display messages (winner, invalid move, etc.)
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(240, 240, 240));
		textArea.setFont(new Font("Monospaced", Font.BOLD, 14));
		textArea.setBounds(18, 228, 126, 21);
		panel.add(textArea);

		/* ======================================================
		   TOP LEFT BUTTON
		   ====================================================== */

		JButton topLeft = new JButton("");
		topLeft.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// Check if the move is valid
				if (TTT.check(0, 0) == true)
				{
					// Display the player's symbol
					topLeft.setText(TTT.player(tracker));

					// Switch turns
					tracker = !tracker;

					// Increase move counter
					counter += 1;

					// Check for win or draw
					if (TTT.play(0, 0, tracker) == true || counter == 9)
					{
						textArea.setText(TTT.winner(tracker, counter));

						// Fill board to prevent further moves
						TTT.flood();
					}
				}

				// If move was invalid
				else
				{
					textArea.setText("Invalid Move");
				}
			}
		});
		topLeft.setBounds(18, 19, 126, 59);
		panel.add(topLeft);

		/* ======================================================
		   MIDDLE LEFT BUTTON
		   ====================================================== */

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

		/* ======================================================
		   BOTTOM LEFT BUTTON
		   ====================================================== */

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

		/* ======================================================
		   TOP CENTER BUTTON
		   ====================================================== */

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

		/* ======================================================
		   MIDDLE CENTER BUTTON
		   ====================================================== */

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

		/* ======================================================
		   BOTTOM CENTER BUTTON
		   ====================================================== */

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

		/* ======================================================
		   RIGHT COLUMN BUTTONS
		   ====================================================== */

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