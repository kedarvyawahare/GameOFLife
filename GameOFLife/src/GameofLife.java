
/**
 * @author kedar
 * Game of Life is an infinite two dimensional
   orthogonal grid of square cells, each of
   which is in one of two possible states, alive or dead . Every cell interacts with its eight neighbours, which
   are the cells that are horizontally, vertically, or diagonally adjacent
 *
 */
public class GameofLife {
	
	
	/**
	 * main function
	 */
	public static void main(String[] args)
	{
		
		int [] [] grid = new int [25][25];
		
		grid[12][12] = 1;
		grid[12][13] = 1;
		grid[12][14] = 1;
		grid[11][14] = 1;
		grid[10][13] = 1;
		
		
		GameofLife gameofLife = new GameofLife();
		
		gameofLife.gameOfLife(grid);
		
		
		for (int i = 0; i < grid.length; i++)
		{
			
			for (int j = 0; j < grid[0].length; j++)
			{
				System.out.print( grid[i][j]);
			}
			
			System.out.println();
			
		}
	}

	/**
	 * This function gives the next generation of grid 
	 * @param grid  
	 */
	public void gameOfLife(int[][] grid)
	{
		int rows = grid.length;
		int cols = grid[0].length;
		
		//iterate over each cell to get the next state
		
		for(int i = 0;i < rows; ++i)
		{
			for(int j = 0;j < cols; ++j)
			{
				int neighbors = getNeighbour(grid, i, j);
				
				// if cell is alive and need to keep the next state alive then make current cell val = 3
				if(grid[i][j] == 1)
				{
					if(neighbors==2 || neighbors==3)
						grid[i][j]=3;
				}
				
				// if cell is dead  and need to keep the next state alive then make current cell val = 3
				else
				{
					
					if(neighbors==3)
						grid[i][j]=2;
				}
			}
		}   
		
		// logic to make to get next cell value for next generation
		for(int i=0;i<rows;++i)
		{
			for(int j=0;j<cols;++j)
			{
				// if current value if 1 and need to make next value either 0 or 1  i.e ( 1>>1 )  or (3>>1);
				// if current value if 1 and need to make next value either 1  i.e (2>>1);
				
				grid[i][j]>>=1;
			}
		}
	}

	
	/**
	 * gives total neighbour count which are live
	 * 
	 * @param grid  input grid
	 * @param row   cell row
	 * @param col   cell column
	 * @return      return total neighbour count which are live
	 */
	private int getNeighbour(int[][] grid, int row, int col){
		int cnt=0;
		for(int i = row-1; i <= row+1; ++i)
		{
			for(int j= col-1; j <= col+1; ++j)
			{
				if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
				{
					continue;
				}
				
				// if grid[i][j] == 1 or grid[i][j] == 3 then , increase the count

				cnt += grid[i][j]&1;
			}
		}
		
		// to remove the current element from count
		cnt-=grid[row][col] & 1;  
		return cnt;
	}

}
