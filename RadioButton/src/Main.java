import javax.swing.JFrame;

public class Main {

	public static void main(String args)
	{
		double[] storeMinimum = new double[5];
		double[] trailArray = new double[5];
		
		for(int i =0; i < storeMinimum.length; i++)
		{
			randu(trailArray);
			storeMinimum[i] = findMinimum(trailArray);
		}
		
		for (double minValue :storeMinimum) {
			System.out.printf("%.4f%n", minValue);
		}
		
		//System.out.println("minimum value: " + findMinimum2(new int[] {3, 5, 2, 8, 6}));
		//System.out.println("min value: " + findMinimum2(new int[] { 3, 8, 14, 18, 56}));
		
		double[][] matrix = new double[3][];
		
		for(int i = 0; i < matrix.length; i++)
		{
			matrix[i] = new double [i + 1];
		}
		
		double[][] matrix2 = {
				{0.0},
				{0.0, 0.0},
				{0.0, 0.0, 0.0}
		};
		
		double[][] matrix3 = new double[][] { // annoymous array to be an expression
			{0.0},
			{0.0, 0.0},
			{0.0, 0.0, 0.0}
		};
		}
		
		
		
	
	public static int findMinimum2(int[] dataSeq){
		int min = dataSeq[0];
		
		for(int index = 1; index < dataSeq.length; index++)
			if(dataSeq[index] < min)
				min = dataSeq[index];
		return min;
	}
	
	public static void randu(double[] valArray)
	{
		for (int i = 0; i < valArray.length; ++i)
		{
			valArray[i] = Math.random() * 100.0;
		}
	}
	
	public static double findMinimum(double[] trailArray) {
		
		double minValue = trailArray[0]; // starts at one because minvalue set to element zero
		for(int i = 1; i < trailArray.length; i++)
		{
			minValue = Math.min(minValue, trailArray[i]);
		}
		
		return minValue;
	}

}
