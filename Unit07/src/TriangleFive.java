import static java.lang.System.*;

import java.util.Iterator;

public class TriangleFive
{
   private char letter;
   private int amount;
   private char[] lets= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

	public TriangleFive()
	{
	}

	public TriangleFive(char c, int amt)
	{
		letter=c;
		amount=amt;
	}

	public void setLetter(char c)
	{
		letter=c;
	}

	public void setAmount(int amt)
	{
		amount=amt;
	}
	
	public char getNextLet(char q) {
		for (int i = 0; i < lets.length; i++) {
			if(q==lets[i]) {
				if(i==25) {
					return lets[0];
				}
				return lets[i+1];
			}
			
		}
			
			
			return 0;
	}

	public String toString()
	{
		String output="";
		char tempchar=letter;
		String[] blocks=new String[amount+1];
		
		for (int i = amount; i > 0; i--) {
			String s="";
			for (int j = 0; j < i; j++) {
				s+=tempchar;
				
			}
			blocks[i]=s+" ";
			tempchar=getNextLet(tempchar);
		}
		
		for (int i = 0; i < amount; i++) {
			for (int j = amount; j > i; j--) {
			output+=blocks[j];
			}
			output+="\n";
			
		}
		
		return output;
	}
}