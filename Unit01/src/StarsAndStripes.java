//© A+ Computer Science
//www.apluscompsci.com


//Name - Graham Garibaldi
//Date - 8/18/22
//Class - APCSA period 1, fall 2022


import static java.lang.System.*;

import java.util.Iterator;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
      
      
   }

   public void printTwentyStars()
   {
	   String s="";
	   while(s.length()<20) {
		   s+="*";
	   }
	   
	   System.out.println(s);
	   
   }

   public void printTwentyDashes()
   {
	   String s="";
	   while(s.length()<20) {
		   s+="-";
	   }
	   
	   System.out.println(s);
   }

   public void printTwoBlankLines()
   {
	   System.out.println("\n");
	   System.out.println("\n");
   }
   
   public void printASmallBox()
   {	
	   System.out.println("------------");
	   System.out.println("|          |");
	   System.out.println("|          |");
	   System.out.println("|          |");
	   System.out.println("|          |");
	   System.out.println("------------");

   }
 
   public void printABigBox()
   { 	
	   System.out.println("-------------------");
	   System.out.println("|                 |");
	   System.out.println("|                 |");
	   System.out.println("|                 |");
	   System.out.println("|                 |");
	   System.out.println("|                 |");
	   System.out.println("|                 |");
	   System.out.println("-------------------");
   }   
}