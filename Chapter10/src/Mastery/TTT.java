/*

Program: TTT.java         Last Date of this Revision: March 06, 2026

Purpose: This class contains the game logic for a Tic Tac Toe game.
It manages the board, validates moves, determines the current player,
checks for a winner, and detects ties. The TicTacToe GUI class interacts
with this class to perform game operations such as checking moves and
determining winners.

Author: Calen Plana
School: CHHS
Course: Computer Programming CS30
 

*/

package Mastery;

public class TTT
{
	/**
	 * 2D array representing the Tic Tac Toe board.
	 * Each cell contains either:
	 * "X", "O", or " " (empty space).
	 */
	private static String[][] board;

	/**
	 * Variables for player names.
	 * (Currently unused but may be intended for future expansion.)
	 */
	private String player1, player2;

	/**
	 * Constructor for the TTT class.
	 * 
	 * Initializes the board to a 3x3 grid and fills each space
	 * with a blank space to represent an empty board.
	 */
	public TTT()
	{
		board = new String[3][3];

		// Initialize every board position as empty
		for (int row = 0; row < board.length; row++)
		{
			for (int col = 0; col < board[0].length; col++)
			{
				board[row][col] = " ";
			}
		}
	}

	/**
	 * Determines the winner message.
	 * 
	 * @param tracker Indicates whose turn it was last
	 * @param counter Number of moves played
	 * @return String message describing the winner or a tie
	 */
	public static String winner(boolean tracker, int counter)
	{
		// If the board is full and no winner occurred
		if (counter == 9)
		{
			return("Tie!");
		}

		// If tracker is true, the previous player was O
		else if (tracker == true)
		{
			return("O Wins!");
		}

		// Otherwise the previous player was X
		else
		{
			return("X Wins!");
		}
	}

	/**
	 * Determines which symbol should be played.
	 * 
	 * @param tracker Indicates the current player's turn
	 * @return "X" or "O"
	 */
	public static String player(boolean tracker)
	{
		// Player X moves when tracker is true
		if (tracker == true)	
		{
			return("X");
		}

		// Player O moves when tracker is false
		else
		{
			return("O");
		}
	}

	/**
	 * Fills the board with a placeholder value ("A").
	 * 
	 * This prevents any additional valid moves after
	 * the game has ended.
	 */
	public static void flood()
	{
		for (int row = 0; row < board.length; row++)
		{
			for (int col = 0; col < board[0].length; col++)
			{
				board[row][col] = "A";
			}
		}
	}

	/**
	 * Checks whether a move is valid.
	 * 
	 * A move is valid if the selected board position is empty.
	 * 
	 * @param row The row index
	 * @param col The column index
	 * @return true if the space is empty, false otherwise
	 */
	public static boolean check(int row, int col)
	{
		if (board[row][col].equals(" "))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * Places a move on the board and checks for a win.
	 * 
	 * @param row The row where the player wants to move
	 * @param col The column where the player wants to move
	 * @param tracker Indicates which player's symbol to place
	 * @return true if a winning condition is detected, otherwise false
	 */
	public static boolean play(int row, int col, boolean tracker)
	{
		String letter;

		// Determine which symbol to place
		if (tracker == true)
		{
			letter = "X";
		}
		else
		{
			letter = "O";
		}

		// Place the symbol on the board
		board[row][col] = letter;

		/* ==========================
		   Check rows for a win
		   ========================== */
		for (int r = 0; r < board.length; r++)
		{
			if (board[r][0].equals(board[r][1]) &&
				board[r][1].equals(board[r][2]) &&
				!(board[r][0].equals(" ")))
			{
				return true;
			}
		}

		/* ==========================
		   Check columns for a win
		   ========================== */
		for (int c = 0; c < board.length; c++)
		{
			if (board[0][c].equals(board[1][c]) &&
				board[1][c].equals(board[2][c]) &&
				!(board[0][c].equals(" ")))
			{
				return true;
			}
		}

		/* ==========================
		   Check main diagonal
		   ========================== */
		if (board[0][0].equals(board[1][1]) &&
			board[1][1].equals(board[2][2]) &&
			!(board[0][0].equals(" ")))
		{
			return true;
		}

		/* ==========================
		   Check opposite diagonal
		   ========================== */
		if (board[0][2].equals(board[1][1]) &&
			board[1][1].equals(board[2][0]) &&
			!(board[0][2].equals(" ")))
		{
			return true;
		}

		// No win detected
		return false;
	}
}