//Name - Graham Garibaldi
//Date - 8/19/22
//Class - APCSA period 2, 2022



import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		testDistance();
		testDistance();
		testDistance();
	}

	public static void testDistance() {
		Scanner keyboard = new Scanner(in);

		out.print("Enter x1 :: ");
		int x1 = keyboard.nextInt();

		out.print("Enter y1 :: ");
		int y1 = keyboard.nextInt();

		out.print("Enter x2 :: ");
		int x2 = keyboard.nextInt();

		out.print("Enter y2 :: ");
		int y2 = keyboard.nextInt();
		
		Distance test = new Distance(x1, y1, x2, y2);
		test.print();
	}
	


}