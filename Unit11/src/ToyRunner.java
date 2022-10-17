//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class ToyRunner
{
	public static void main(String[] args)
	{
<<<<<<< HEAD
		Scanner keyboard = new Scanner(System.in);
	   	String choice="";
			do{
				out.print("\nEnter the word to display :: ");
				String word = keyboard.next();

				//call the printWord method
	 			TriangleWord.printTriangle(word);
				System.out.print("\nDo you want to enter more sample input? ");
				choice=keyboard.next();			
			}while(choice.equals("Y")||choice.equals("y"));		
		
		
=======

		Scanner keyboard = new Scanner(System.in);

		System.out.print("How many toys do you want? :: ");
		int size = keyboard.nextInt();

		for(int i=0; i<size;i++)
		{
			System.out.print("Enter the toy :: ");
			String name = keyboard.nextInt();
			System.out.prinln(new Toy(name));
		}


>>>>>>> 7a581e0bb20b9589c871fb25958a23dc92caedfa
	}
}