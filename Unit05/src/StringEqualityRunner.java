import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality w=new StringEquality("hello", "goodbye");
		System.out.println(w.toString());
		w.setWords("one", "two");
		System.out.println(w.toString());
		w.setWords("three", "four");
		System.out.println(w.toString());
		w.setWords("TCEA", "UIL");
		System.out.println(w.toString());
		w.setWords("State", "Champions");
		System.out.println(w.toString());
		w.setWords("ABC", "ABC");
		System.out.println(w.toString());
		w.setWords("ABC", "CBA");
		System.out.println(w.toString());
		w.setWords("Same", "Same");
		System.out.println(w.toString());
		
	}
}