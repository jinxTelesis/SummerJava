package oop;

public class NonStaticInitializers {
	
	static final int ROWS = 12, COLUMNS = 10;
	static long[][] matrix = new long[ROWS][COLUMNS];
	
	static {
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = 2 * i + j;
	
	}
	
}
