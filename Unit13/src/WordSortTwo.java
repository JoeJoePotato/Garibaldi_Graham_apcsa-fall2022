//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay=sentence.split(" ");
		
	}

	public void sort()
	{
		for(int i=0; i<wordRay.length; i++) {
			for(int j=1; j<wordRay.length; j++) {
				if(wordRay[j].compareTo(wordRay[j-1])<0) {
					String temp=wordRay[j];
					wordRay[j]=wordRay[j-1];
					wordRay[j-1]=temp;
				}
			}
		}
	}

	public String toString()
	{
		String output="";
		for(String s : wordRay) {
			output+=s;
			output+=", ";
		}
		return output+"\n\n";
	}
}