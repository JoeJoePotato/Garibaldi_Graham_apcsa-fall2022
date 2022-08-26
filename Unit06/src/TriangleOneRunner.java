

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		TriangleOne t=new TriangleOne("hippo");
		System.out.println(t);
		t.setWord("abcd");
		System.out.println(t);
		t.setWord("it");
		System.out.println(t);
		t.setWord("a");
		System.out.println(t);
		t.setWord("chicken");
		System.out.println(t);
}
}