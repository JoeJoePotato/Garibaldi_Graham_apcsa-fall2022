//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] arr=new int[size];
		for(int i=0; i<arr.length; i++) {
		arr[i]=(int) (Math.random()*10);
		}
		
		
		
		return arr;
	}
	public static void shiftEm(int[] array)
	{
		
		print(array);
		int sevendex=0;
		for(int i=0; i<array.length; i++) {
			if(array[i]==7) {
				int temp=array[sevendex];
				array[sevendex]=array[i];
				array[i]=temp;
				sevendex++;
			}
		}
	print(array);
	}
	
	private static void print(int[] arr) {
		String printout="{";
		for(int i : arr) {
			printout+=(" "+i+" ");
		}
		
		printout+="}";
		System.out.println(printout);
	}
	
}