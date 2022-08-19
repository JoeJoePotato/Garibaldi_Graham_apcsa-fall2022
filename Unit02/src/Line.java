//Name - Graham Garibaldi
//Date - 8/18/22
//Class - APCSA period 2, 2022


public class Line


{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		
		int rise=(y2-y1)*100;
		int run=x2-x1;
		long i=Math.floorDiv(rise,run);

		double d=i;
		d=d/100;
		
		return d;
	}

}