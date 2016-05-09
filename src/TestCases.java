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

}
