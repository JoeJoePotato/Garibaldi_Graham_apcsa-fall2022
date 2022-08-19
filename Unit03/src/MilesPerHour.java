

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour(int dist, int hrs, int mins)
	{
		this.distance=dist;
		this.hours=hrs;
		this.minutes=mins;
	}


	public void calcMPH()
	{
		int hundredmins=minutes*100;
	
		int hourstaken=Math.floorDiv(hundredmins, 60);
	
		hourstaken+=(hours*100);
		
		double finaltime=hourstaken*0.01;
		
		mph=distance/finaltime;
	}

	public void print()
	{
		System.out.println("speed: "+mph);
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}