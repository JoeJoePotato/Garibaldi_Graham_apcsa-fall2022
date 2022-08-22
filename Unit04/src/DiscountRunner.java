//Name - Graham Garibaldi
//Date - 8/19/22
//Class - APCSA period 2, 2022



import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Discount d=new Discount();
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		System.out.printf("%.2f\n", d.getDiscountedBill(amt));

	}
}