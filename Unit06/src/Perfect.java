
import static java.lang.System.*;

import java.util.Iterator;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect(int number) {
	  this.number=number;
   }

	//add a set method
   public void setNum(int number) {
	   this.number=number;
   }

	public boolean isPerfect()
	{
		if(number==getDivisorSum()) {
			return true;
		}
		
		return false;
	}

	private int getDivisorSum() {
		// TODO Auto-generated method s
		int sumdivisors=0;
		for (int i = 1; i <= number/2; i++) {
			if(number%i==0) {
			
				sumdivisors+=i;
			}
		}
		return sumdivisors;
	}
	
	/*private int getDigitSum() {
		int r=0;
		int tempnum=number;
		for (int i = 0; i < (number+"").length(); i++) {
			r+=tempnum%10;
			tempnum=Math.floorDiv(tempnum, 10);
		}
		
		return r;
	}*/

	//add a toString	
	public String toString() {
		if(isPerfect()==true) {
			return number+" is perfect.";
		}
		return number+" is not perfect";
		
	}
}