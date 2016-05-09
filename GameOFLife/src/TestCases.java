import static org.junit.Assert.*;

import org.junit.Test;


public class TestCases {

	@Test
	public void testBlockPattern() {
		
		int arr[] [] = new int [][] {{0,0},{0,0}};
		
		int outputExpected [] [] =  new int [][] {{0,0},{0,0}};
		
		
		new GameofLife().gameOfLife(arr);
		
	   assertArrayEquals(outputExpected,  arr);
	}
	
	
	@Test
	public void testBloatPattern() {
		
		int arr[] [] = new int [][] {{0,0,1},{0,1,0},{1,0,1}};
		
		int outputExpected [] [] =  new int [][] {{0,0,0},{0,1,1},{0,1,0}};
		
		
		new GameofLife().gameOfLife(arr);
		
	   assertArrayEquals(outputExpected,  arr);
	}
	
	
	@Test
	public void testBlinkerPattern() {
		
		int arr[] [] = new int [][] {{0,1,0},{0,1,0},{0,1,0}};
		
		int outputExpected [] [] =  new int [][] {{0,0,0},{1,1,1},{0,0,0}};
		
		
		new GameofLife().gameOfLife(arr);
		
	   assertArrayEquals(outputExpected,  arr);
	}
	
	
	@Test
	public void testToadPattern() {
		
		int arr[] [] = new int [][] {{0,1,1,1},{1,1,1,0},{0,0,1,0}};
		
		int outputExpected [] [] =  new int [][] {{1,0,0,1},{1,0,0,0},{0,0,1,0}};
		
		
		new GameofLife().gameOfLife(arr);
		
	   assertArrayEquals(outputExpected,  arr);
	}
	
	
	@Test
	public void testGliderrPattern() {
		
		int [] [] grid = new int [25][25];

		grid[12][12] = 1;
		grid[12][13] = 1;
		grid[12][14] = 1;
		grid[11][14] = 1;
		grid[10][13] = 1;
		
		
		int outputExpected [] [] = new int [25][25];
		
		outputExpected[11][12] = 1;
		outputExpected[11][14] = 1;
		outputExpected[12][13] = 1;
		outputExpected[12][14] = 1;
		outputExpected[13][13] = 1;

		
		
		new GameofLife().gameOfLife(grid);
		
	   assertArrayEquals(outputExpected,  grid);
	}

}
