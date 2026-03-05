package Mastery;

public class TTT
{
	private String[][] board;
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
	
	public String play(int row, int col, int val, boolean tracker)
	{
		String letter;
		
		if (val == 1)
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
			if (board[row][0].equals(board[row][1]) && board[row][1].equals(board[row][2]) && !(board[row][0].equals(" ")))
			{
				
			}
		}
	}
}
