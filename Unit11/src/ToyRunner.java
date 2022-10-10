//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);

		System.out.print("How many toys do you want? :: ");
		int size = keyboard.nextInt();

		for(int i=0; i<size;i++)
		{
			System.out.print("Enter the toy :: ");
			String name = keyboard.nextInt();
			System.out.prinln(new Toy(name));
		}


	}
}