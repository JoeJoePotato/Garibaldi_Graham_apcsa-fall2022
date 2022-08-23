//Name - Graham Garibaldi
//Date - 8/22/22
//Class - APCSA period 2, 2022

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		/*
abe ape
giraffe gorilla
one two
fun funny
123 19
193 1910
goofy godfather
funnel fun

		 */
WordsCompare w=new WordsCompare("abe", "ape");
System.out.println(w.toString());
w.setWords("giraffe", "gorilla");
System.out.println(w.toString());
w.setWords("one", "two");
System.out.println(w.toString());
w.setWords("fun", "funny");
System.out.println(w.toString());
w.setWords("123", "19");
System.out.println(w.toString());
w.setWords("193", "1910");
System.out.println(w.toString());
w.setWords("goofy", "godfather");
System.out.println(w.toString());
w.setWords("funnel", "fun");
System.out.println(w.toString());
	}
}