//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String[] args ){
		String[] r = {"a", "b", "c", "7", "9", "x", "2"};
		Grid g=new Grid(10, 10,  r);
		System.out.println(g);
		for(int i=0; i<r.length; i++) {
			System.out.println(r[i]+" appears "+g.countVals(r[i])+" times");
		}
		System.out.println("----------------");
		System.out.println(g.findMax(r));
	
	}
}