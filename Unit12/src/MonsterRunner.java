//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		
		//instantiate monster one
		
		//ask for name and size
		
		//instantiate monster two
		System.out.print("Enter the size :: ");
		int size = keyboard.nextInt();
		System.out.print("Enter the name :: ");
		String name  = keyboard.next();
		Monster one=new Skeleton(name, size);
		
		System.out.print("Enter the size :: ");
		size = keyboard.nextInt();
		System.out.print("Enter the name :: ");
		name  = keyboard.next();
		Monster two=new Vampire(name, size);
		
		if(one.isBigger(two)) {
			System.out.println(one.getName()+" is bigger");
		}else if(two.isBigger(one)) {
			System.out.println(two.getName()+" is bigger");
		}
		
		if(one.namesTheSame(two)) {
			System.out.println("they have the same name!");
		}
		
	}
}