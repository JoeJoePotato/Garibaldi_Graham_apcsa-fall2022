//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("src/words.dat"));

		int size = file.nextInt();
		Word[] words=new Word[size];
	
		int j=0;
		 while(j<size) {
			 words[j]=(new Word(file.nextLine()));
			 j++;
		 }
		 
		 
		 for(int i=0; i<words.length; i++) {
			 for(int k=1; k<words.length; k++) {
				 if(words[k].compareTo(words[k-1]) < 0) {
					 Word temp=words[k];
					 words[k]=words[k-1];
					 words[k-1]=temp;
				 }
			 }
		 }
		 

		 for(int l=0; l<size; l++) {
System.out.println(words[l]);


		 }




	}
}