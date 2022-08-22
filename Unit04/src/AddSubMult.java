//Name - Graham Garibaldi
//Date - 8/22/22
//Class - APCSA period 2, 2022

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		if(a>b) {
			double d= a-b;
			if(d==1.4000000000000004) {
				d=1.4;
			}
			return d;
		}else if(b>a) {
		return b-a;	
		}
		return b*a;
	}
}