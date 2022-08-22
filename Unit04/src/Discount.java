//Name - Graham Garibaldi
//Date - 8/22/22
//Class - APCSA period 2, 2022

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	public static double getDiscountedBill(double bill)
	{
		if(bill>2000) {
			bill=bill*0.85;
		}
		return bill;
	}
}