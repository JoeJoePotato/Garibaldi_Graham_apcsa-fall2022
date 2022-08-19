//Name - Graham Garibaldi
//Date - 8/19/22
//Class - APCSA period 2, 2022



import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance(int x1, int y1, int x2, int y2)
	{
	 this.xOne=x1;
	 this.yOne=y1;
	 this.xTwo=x2;
	 this.yTwo=y2;
	}


	public void calcDistance()
	{
	int xDistance=(xTwo-xOne)*(xTwo-xOne);
	int yDistance=(yTwo-yOne)*(yTwo-yOne);	
	double pythagorasstolealotofhisproofs=xDistance+yDistance;
	distance=Math.sqrt(pythagorasstolealotofhisproofs);
	
	}
	
	public double getDistance()
	{
		calcDistance();
		return distance;
	}
	
	public void print()
	{
		System.out.printf("%.3f\n", getDistance());
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}