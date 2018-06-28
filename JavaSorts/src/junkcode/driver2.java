package junkcode;

public class driver2 {

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
		
	}
	
	public static void randu(double[] valArray)
	{
		for (int i = 0; i < valArray.length; ++i)
		{
			valArray[i] = Math.random() * 100.0;
		}
	}
	
	public static double findMinimum(double[] valArray) {
		
		double minValue = valArray[0]; // starts at one because minvalue set to element zero
		for(int i = 1; i < valArray.length; i++)
		{
			minValue = Math.min(minValue, valArray[i]);
		}
		
		return minValue;
	}

}
