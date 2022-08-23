//Name - Graham Garibaldi
//Date - 8/22/22
//Class - APCSA period 2, 2022

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
   private boolean compare;

	public WordsCompare()
	{
		
	}

	public WordsCompare(String one, String two)
	{
		this.wordOne=one;
		this.wordTwo=two;
	}

	public void setWords(String one, String two)
	{
		wordOne=one;
		wordTwo=two;
	}

	public boolean compare()
	{
		
		for (int i = 1; i < wordOne.length() && i< wordTwo.length(); i++) {
			char One=wordOne.charAt(i);
			char Two=wordTwo.charAt(i);	
		
		if(One<Two) {
			return true;
		}
		if(One>Two) {
			return false;
		}
		
		
		
		}
		if(wordOne.length()<wordTwo.length()) {
			return true;
		}
		
	return false;
	}

	public String toString()
	{
		compare=compare();
		if(compare==true)
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}