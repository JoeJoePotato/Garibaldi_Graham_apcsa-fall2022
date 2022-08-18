//© A+ Computer Science
//www.apluscompsci.com

//Name - Graham Garibaldi
//Date - 8/18/22
//Class - APCSA period 1, fall 2022

import static java.lang.System.*;

import java.util.Random;


public class StarsRunner
{
   public static void main(String args[])
   {
      //instantiate a StarsAndStripes object
      StarsAndStripes starprinter=new StarsAndStripes();
      //call the methods needed to make the patterns on the word document
    Random r=new Random();
    
    //prints a random selection from stars and stripes
    for (int i = 0; i < 10; i++) {
		int z=r.nextInt(5);
		if(z==0) {
			starprinter.printTwoBlankLines();
		}else if(z==1) {
			starprinter.printABigBox();
		}else if(z==2) {
			starprinter.printASmallBox();
		}else if(z==3) {
			starprinter.printTwentyStars();
		}else {
			starprinter.printTwentyDashes();
		}
	}
      
      
   }
   
}