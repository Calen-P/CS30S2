package Mastery;

public class TTT
{
	private static String[][] board;
	private String player1, player2;
	
	public TTT()
	{
		board = new String[3][3];
		for (int row = 0; row < board.length; row++)
		{
			for (int col = 0; col < board[0].length; col++)
			{
				board[row][col] = " ";
			}
		}
	}
	
	public static String winner(boolean tracker, int counter)
	{
		if (counter == 9)
		{
			return("Tie!");
		}
		
		else if (tracker == true)
		{
			return("O Wins!");
		}
		
		else
		{
			return("X Wins!");
		}
	}
	
	
	public static String player(boolean tracker)
	{
		if (tracker == true)	
		{
			return("X");
		}
		
		else
		{
			return("O");
		}
	}
	
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
	
	public static boolean play(int row, int col, boolean tracker)
	{
		String letter;
		
		if (tracker == true)
		{
			letter = "X";
		}
		
		else
		{
			letter = "O";
		}
		
		board[row][col] = letter;
		
		//test rows
		for (int r = 0; r < board.length; r++)
		{
			if (board[r][0].equals(board[r][1]) && board[r][1].equals(board[r][2]) && !(board[r][0].equals(" ")))
			{
				return true;
			}
		}
		
		//test columns
		for (int c = 0; c < board.length; c++)
		{
			if (board[0][c].equals(board[1][c]) && board[1][c].equals(board[2][c]) && !(board[0][c].equals(" ")))
			{
				return true;
			}
		}
		
		//test diagonal
		if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !(board[0][0].equals(" ")))
		{
			return true;
		}
		
		//test other diagonal
		if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !(board[0][2].equals(" ")))
		{
			return true;
		}
		
		//test ties
		
		
		return false;
	}
}
