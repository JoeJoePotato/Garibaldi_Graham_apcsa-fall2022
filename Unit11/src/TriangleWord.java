//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		String assembly="";
		for(int i=1; i<(word.length()+1); i++) {
			assembly="";
			for(int j=0; j<i; j++) {
				assembly+=word.charAt(j);
			}
		
			for(int k=1; k<i; k++) {
				System.out.print(assembly);
			}
			System.out.println(assembly);
			
		}
	}
}