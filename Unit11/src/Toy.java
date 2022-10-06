//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Toy
{
	private String name;
	private int count;

	public Toy()
	{
		this("nothing");
	}

	public Toy( String nm )
	{
		name=nm;
		count=1;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount( int cnt )
	{
		count=cnt;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nm )
	{
	}

	public String toString()
	{
	   return name+" "+count;
	}
}