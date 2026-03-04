
public class TTT
{
	private static int[][] score = new int[3][3];

	public static void add(int row, int col, int player)
	{
		score[row][col] = player;
	}
	
	public static boolean checkRow()
	{
		int temp;
		
		for (int i = 0; i <= 2; i++)
		{
			temp = 0;
			
			for (int j = 0; j <= 2; i++)
			{
				temp += score[i][j];
				
				if (temp == 3)
				{
					return true;
				}
				
				else if (temp == 6)
				{
					return true;
				}
			}
		}
		
		return false;
	}
}
