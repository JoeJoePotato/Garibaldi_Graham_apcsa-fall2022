import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		number=num;
	}

	public void setNum(int num)
	{

		number=num;
	}
	
	
	private String cycle() {
		String allWorks="";
		
		for (int c = 1; c <= number; c++) {
			for (int b = 1; b < c; b++) {
				for (int a = 1; a < b; a++) {
					if((a*a)+(b*b)==(c*c)) {
						if((a+b)%2==1) {
							if(c%2==1) {
								if(greatestCommonFactor(a, b, c)==1) {
									allWorks+=a+" "+b+" "+c+"\n";
								}
							}
						}
					}
				}	
			}
		}
		
		
		return allWorks;
	}
	
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for (int i = 1; i < a || i<b || i<c; i++) {
			if(a%i==0) {
				if(b%i==0) {
					if(c%i==0) {
						max=i;
					}
				}
			}
		}
		
		
		
		return max;
	}

	public String toString()
	{
		String output="";






		return output+"\n";
	}
}