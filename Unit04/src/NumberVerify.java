//Name - Graham Garibaldi
//Date - 8/22/22
//Class - APCSA period 2, 2022


import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
		num=Math.abs(num);
		if(num%2==0) {
			return false;
		}
		return true;
	}
	public static boolean isEven( int num )
	{
		num=Math.abs(num);
		if(num%2==1) {
			return false;
		}
		return true;
	}	
}