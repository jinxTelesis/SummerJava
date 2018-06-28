package junkcode;

public class Junk {
	
	public static void main(String args)
	{
		double[] storeMinimum = new double[5];
		double[] trailArray = new double[5];
		
		for(int i =0; i < storeMinimum.length; i++)
		{
			randu(trailArray);
		}
		
		
		
		
		
		
	}
	
	public static void randu(double[] valArray)
	{
		for (int i = 0; i < valArray.length; ++i)
		{
			valArray[i] = Math.random() * 100.0;
		}
	}

}
