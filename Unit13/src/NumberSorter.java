//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		String snum=""+number;
		int[] sorted = new int[snum.length()];
		for(int i=0; i<sorted.length; i++) {
			sorted[i]=Integer.parseInt(snum.substring(i, i+1));
		}
		
		for(int j=0; j<(sorted.length-1); j++) {
			for(int k=j+1; k<sorted.length; k++) {
				if(sorted[k]<sorted[j]) {
					int temp=sorted[k];
					sorted[k]=sorted[j];
					sorted[j]=temp;
				}
				
			}
		}
		
		return sorted;
	}
	
}